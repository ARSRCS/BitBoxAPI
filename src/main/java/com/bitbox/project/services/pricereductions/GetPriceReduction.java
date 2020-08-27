package com.bitbox.project.services.pricereductions;

import com.bitbox.project.models.PriceReduction;
import org.springframework.beans.factory.annotation.Autowired;
import com.bitbox.project.repositories.pricereduction.PriceReductionRepository;
import org.springframework.stereotype.Service;

@Service
public class GetPriceReduction {

    private PriceReductionRepository priceReductionRepository;

    @Autowired
    public GetPriceReduction(PriceReductionRepository priceReductionRepository){
        this.priceReductionRepository=priceReductionRepository;
    }

    public PriceReduction execute(int priceReductionId){
        return priceReductionRepository.get(priceReductionId);
    }
}
