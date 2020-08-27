package com.bitbox.project.repositories.item;

import com.bitbox.project.models.Item;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class ItemRepositorySQL implements ItemRepository{
    private final Sql2o sql2o;

    public ItemRepositorySQL(String connection){
        this.sql2o=sql2o(connection);
    }
    private Sql2o sql2o(String connectionUrl){
        return new Sql2o(connectionUrl,"postgres","admin");
    }

    @Override
    public void add(Item item){
        final String query="insert into store.item(description, price, state, suppliers, \"priceReductions\", \"creationDate\", creator) values (:descripcion,:precio,:estado,:idproveedor,:iddescuento,:fecha,:creador);";
        try (Connection connection = sql2o.open()){
            connection.createQuery(query)
                    .addParameter("descripcion",item.getDescription())
                    .addParameter("precio",item.getPrice())
                    .addParameter("estado",item.getState())
                    .addParameter("idproveedor",item.getSuppliers())
                    .addParameter("iddescuento",item.getPriceReductions())
                    .addParameter("fecha",item.getCreationDate())
                    .addParameter("creador",item.getCreator())
                    .executeUpdate();

        }
    }

    @Override
    public void delete(int itemId){
        final String query="delete from store.item where item_code="+ itemId;
        try (Connection connection = sql2o.open()){
            connection.createQuery(query)
                    .executeUpdate();
        }
    }

    @Override
    public void update(int itemId, Item updatedItem){
        final String query="update store.item set description=:descripcion, price=:precio, state=:estado, suppliers=:proveedor, 'priceReductions'=:descuento, 'creationDate'=:fecha, creator=:creador where item_code="+itemId+";";
        try (Connection connection = sql2o.open()){
            connection.createQuery(query)
                    .addParameter("descripcion",updatedItem.getDescription())
                    .addParameter("precio",updatedItem.getPrice())
                    .addParameter("estado",updatedItem.getState())
                    .addParameter("idproveedor",updatedItem.getSuppliers())
                    .addParameter("iddescuento",updatedItem.getPriceReductions())
                    .addParameter("fecha",updatedItem.getCreationDate())
                    .addParameter("creador",updatedItem.getCreator())
                    .executeUpdate();
        }
    }

    @Override
    public Item get(int itemId){
        final String query="select * from store.item where item_code="+itemId;
        try (Connection connection = sql2o.open()){
            return connection.createQuery(query)
                    .executeAndFetch(Item.class).get(0);

        }
    }
}
