package services.pricereductions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.pricereduction.PriceReductionRepository;
import models.PriceReduction;

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
