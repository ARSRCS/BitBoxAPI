package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.pricereductions.*;
import models.PriceReduction;

@CrossOrigin(origins="*")
@RestController
public class PriceReductionController {

    private CreatePriceReduction createPriceReduction;
    private DeletePriceReduction deletePriceReduction;
    private UpdatePriceReduction updatePriceReduction;
    private GetPriceReduction getPriceReduction;

    @Autowired
    public PriceReductionController(CreatePriceReduction createPriceReduction, DeletePriceReduction deletePriceReduction, UpdatePriceReduction updatePriceReduction, GetPriceReduction getPriceReduction){
        this.createPriceReduction = createPriceReduction;
        this.deletePriceReduction=deletePriceReduction;
        this.updatePriceReduction=updatePriceReduction;
        this.getPriceReduction=getPriceReduction;
    }

    @GetMapping("/priceReductionlist")
    public String priceReductionList(){
        return "";
    }
    @ResponseBody
    @PostMapping("/createPriceReduction")
    public void createPriceReduction(@RequestBody PriceReduction priceReduction){
        createPriceReduction.execute(priceReduction);
    }
    @ResponseBody
    @PostMapping("/updatePriceReduction/{id}")
    public void updatePriceReduction(@PathVariable("id") int priceReductionId, @RequestBody PriceReduction updatedPriceReduction){
        updatePriceReduction.execute(priceReductionId,updatedPriceReduction);
    }
    @ResponseBody
    @PostMapping("/deletePriceReduction/{id}")
    public void deletePriceReduction(@PathVariable("id") int priceReductionId){
        deletePriceReduction.execute(priceReductionId);
    }
    @ResponseBody
    @GetMapping("priceReductions/{priceReductionId}")
    public PriceReduction getPriceReduction(@PathVariable("priceReductionId") int priceReductionId){
        return getPriceReduction.execute(priceReductionId);
    }


}
