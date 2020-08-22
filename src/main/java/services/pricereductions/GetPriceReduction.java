package services.pricereductions;

import models.PriceReduction;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.pricereduction.PriceReductionRepository;

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
