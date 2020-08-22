package services.pricereductions;

import org.springframework.beans.factory.annotation.Autowired;
import repositories.pricereduction.PriceReductionRepository;

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
