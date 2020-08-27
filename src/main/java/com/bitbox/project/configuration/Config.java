package com.bitbox.project.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bitbox.project.repositories.item.ItemRepository;
import com.bitbox.project.repositories.item.ItemRepositorySQL;
import com.bitbox.project.repositories.pricereduction.PriceReductionRepository;
import com.bitbox.project.repositories.pricereduction.PriceReductionRepositorySQL;
import com.bitbox.project.repositories.supplier.SupplierRepository;
import com.bitbox.project.repositories.supplier.SupplierRepositorySQL;
import com.bitbox.project.repositories.user.UserRepository;
import com.bitbox.project.repositories.user.UserRepositorySQL;

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
