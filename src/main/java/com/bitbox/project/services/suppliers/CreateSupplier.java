package com.bitbox.project.services.suppliers;

import com.bitbox.project.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.supplier.SupplierRepository;
@Service
public class CreateSupplier {
    private SupplierRepository supplierRepository;
    @Autowired
    public CreateSupplier(SupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }

    public void execute(Supplier supplier){
        supplierRepository.add(supplier);
    }


}
