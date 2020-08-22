package services.suppliers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.supplier.SupplierRepository;
@Service
public class DeleteSupplier {

    private SupplierRepository supplierRepository;

    @Autowired
    public void DeleteSupplier(SupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }

    public void execute(int supplierId){
        supplierRepository.delete(supplierId);
    }
}
