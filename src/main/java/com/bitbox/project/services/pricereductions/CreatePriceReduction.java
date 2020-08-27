package com.bitbox.project.services.pricereductions;

import com.bitbox.project.models.PriceReduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.pricereduction.PriceReductionRepository;

@Service
public class CreatePriceReduction {
    private PriceReductionRepository priceReductionRepository;

    @Autowired
    public void CreatePriceReduction(PriceReductionRepository priceReductionRepository){
        this.priceReductionRepository=priceReductionRepository;
    }

    public void execute(PriceReduction priceReduction){
        priceReductionRepository.add(priceReduction);
    }

}
