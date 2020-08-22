package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.suppliers.*;
import models.Supplier;

@CrossOrigin(origins="*")
@RestController
public class SupplierController {

    private CreateSupplier createSupplier;
    private DeleteSupplier deleteSupplier;
    private UpdateSupplier updateSupplier;
    private GetSupplier getSupplier;

    @Autowired
    public SupplierController(CreateSupplier createSupplier, DeleteSupplier deleteSupplier, UpdateSupplier updateSupplier, GetSupplier getSupplier){
        this.createSupplier=createSupplier;
        this.deleteSupplier=deleteSupplier;
        this.updateSupplier=updateSupplier;
        this.getSupplier=getSupplier;
    }

    @ResponseBody
    @PostMapping("/createSupplier")
    public void createSupplier(@RequestBody Supplier supplier){
        createSupplier.execute(supplier);
    }
    @ResponseBody
    @PostMapping("/updateSupplier/{id}")
    public void updateSupplier(@PathVariable("id") int supplierId, @RequestBody Supplier updatedSupplier){
        updateSupplier.execute(supplierId,updatedSupplier);
    }
    @ResponseBody
    @PostMapping("/deleteSupplier/{id}")
    public void deleteSupplier(@PathVariable("id") int supplierId){
        deleteSupplier.execute(supplierId);
    }

    @ResponseBody
    @GetMapping("suppliers/{supplierId}")
    public Supplier getSupplier(@PathVariable("supplierId") int supplierId){
        return getSupplier.execute(supplierId);
    }
}
