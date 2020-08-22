package repositories.supplier;

import models.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository {
    void add(Supplier supplier);
    void delete(int supplierId);
    void update(int supplierId,Supplier supplier);
    Supplier get(int supplierId);
}
