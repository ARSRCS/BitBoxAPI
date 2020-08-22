package services.suppliers;

import models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.supplier.SupplierRepository;

@Service
public class GetSupplier {

    private SupplierRepository supplierRepository;

    @Autowired
    public GetSupplier(SupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }
    public Supplier execute(int supplierId){
        return supplierRepository.get(supplierId);
    }
}
