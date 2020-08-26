package configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.item.ItemRepository;
import repositories.item.ItemRepositorySQL;
import repositories.pricereduction.PriceReductionRepository;
import repositories.pricereduction.PriceReductionRepositorySQL;
import repositories.supplier.SupplierRepository;
import repositories.supplier.SupplierRepositorySQL;
import repositories.user.UserRepository;
import repositories.user.UserRepositorySQL;

@Configuration
public class Config {

    @Value("jdbc:postgresql://localhost:5432/store_db")
    private String connection;

    @Bean
    public UserRepository userRepository() {
        return new UserRepositorySQL(connection);
    }

    @Bean
    public PriceReductionRepository priceReductionRepository(){
        return new PriceReductionRepositorySQL(connection);
    }

    @Bean
    public SupplierRepository supplierRepository(){
        return new SupplierRepositorySQL(connection);
    }

    @Bean
    public ItemRepository itemRepository(){
        return new ItemRepositorySQL(connection);
    }
}
