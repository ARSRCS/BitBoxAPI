package repositories.supplier;

import models.Supplier;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class SupplierRepositorySQL implements SupplierRepository{

    private final Sql2o sql2o;

    public SupplierRepositorySQL(String connection){
        this.sql2o=sql2o(connection);
    }
    private Sql2o sql2o(String connectionUrl){
        return new Sql2o(connectionUrl,"postgres","admin");
    }


    @Override
    public void add(Supplier supplier) {
        final String query="insert into store.supplier(name, country) values (:nombre,:pais);";
        try (Connection connection = sql2o.open()){
            connection.createQuery(query)
                    .addParameter("nombre",supplier.getName())
                    .addParameter("pais",supplier.getCountry())
                    .executeUpdate();

        }
    }

    @Override
    public void delete(int supplierId) {
        final String query="delete from store.supplier where supplier_id="+ supplierId;
        try (Connection connection = sql2o.open()){
            connection.createQuery(query)
                    .executeUpdate();
        }
    }

    @Override
    public void update(int supplierId, Supplier updatedSupplier) {
        final String query="update store.supplier set name=:nombre, country=:pais where supplier_id="+supplierId;
        try (Connection connection = sql2o.open()){
            connection.createQuery(query)
                    .addParameter("nombre",updatedSupplier.getName())
                    .addParameter("pais",updatedSupplier.getCountry())
                    .executeUpdate();
        }
    }

    @Override
    public Supplier get(int supplierId) {
        final String query="select * from store.supplier where supplier_id="+supplierId+";";
        try (Connection connection = sql2o.open()){
            return connection.createQuery(query)
                    .executeAndFetch(Supplier.class).get(0);

        }
    }
}
