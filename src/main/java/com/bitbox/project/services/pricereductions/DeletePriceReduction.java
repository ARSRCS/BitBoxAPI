package com.bitbox.project.services.pricereductions;

import org.springframework.beans.factory.annotation.Autowired;
import com.bitbox.project.repositories.pricereduction.PriceReductionRepository;
import org.springframework.stereotype.Service;

@Service
public class DeletePriceReduction {

    private PriceReductionRepository priceReductionRepository;

    @Autowired
    public void DeletePriceReduction(PriceReductionRepository priceReductionRepository){
        this.priceReductionRepository=priceReductionRepository;
    }

    public void execute(int priceReductionId){
        priceReductionRepository.delete(priceReductionId);
    }
}
