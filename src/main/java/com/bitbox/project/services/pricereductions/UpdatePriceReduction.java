package com.bitbox.project.services.pricereductions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.pricereduction.PriceReductionRepository;
import com.bitbox.project.models.PriceReduction;

@Service
public class UpdatePriceReduction {

    private PriceReductionRepository priceReductionRepository;

    @Autowired
    public void UpdatePriceReduction(PriceReductionRepository priceReductionRepository){
        this.priceReductionRepository=priceReductionRepository;
    }
    public void execute(int priceReductionId, PriceReduction updatedPriceReduction){
        priceReductionRepository.update(priceReductionId,updatedPriceReduction);
    }

}
