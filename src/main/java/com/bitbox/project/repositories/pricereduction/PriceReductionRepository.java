package com.bitbox.project.repositories.pricereduction;

import com.bitbox.project.models.PriceReduction;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceReductionRepository {
        void add(PriceReduction priceReduction);
        void delete(int priceReductionId);
        void update(int priceReductionId,PriceReduction updatedPriceReduction);
        PriceReduction get(int priceReductionId);

}
