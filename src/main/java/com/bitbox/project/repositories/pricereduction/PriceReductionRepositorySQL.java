package com.bitbox.project.repositories.pricereduction;

import com.bitbox.project.models.PriceReduction;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class PriceReductionRepositorySQL implements PriceReductionRepository{
    private final Sql2o sql2o;

    public PriceReductionRepositorySQL(String connection){
        this.sql2o=sql2o(connection);
    }

    private Sql2o sql2o(String connectionUrl){
        return new Sql2o(connectionUrl,"postgres","admin");
    }

    @Override
    public void add(PriceReduction priceReduction) {
        final String query= "insert into store.price_reduction (\"reducedPrice\",\"startDate\",\"endDate\") values (:porcentaje,:fechaInicio,:fechaFin);";
        try (Connection connection = sql2o.open()) {
            connection.createQuery(query)
                    .addParameter("porcentaje", priceReduction.getReducedPrice())
                    .addParameter("fechaInicio", priceReduction.getStartDate())
                    .addParameter("fechaFin", priceReduction.getEndDate())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int priceReductionId) {
        final String query="delete from store.price_reduction where reduction_id="+ priceReductionId;
        try (Connection connection = sql2o.open()){
            connection.createQuery(query)
                    .executeUpdate();
        }
    }

    @Override
    public void update(int priceReductionId, PriceReduction updatedPriceReduction){
            final String query = "update store.price_reduction set \"reducedPrice\"=:porcentaje, \"startDate\"=:fechaInicio, \"endDate\"=:fechaFin where reduction_id=" + priceReductionId + ";";
            try (Connection connection = sql2o.open()) {
                connection.createQuery(query)
                        .addParameter("porcentaje", updatedPriceReduction.getReducedPrice())
                        .addParameter("fechaInicio", updatedPriceReduction.getStartDate())
                        .addParameter("fechaFin", updatedPriceReduction.getEndDate())
                        .executeUpdate();
            }
        }

    @Override
    public PriceReduction get(int priceReductionId) {
        final String query = "select * from store.price_reduction where reduction_id=" + priceReductionId;
        try (Connection connection = sql2o.open()) {
            return connection.createQuery(query)
                    .addColumnMapping("reduction_id","reductionId")
                    .executeAndFetch(PriceReduction.class).get(0);
        }
    }
}
