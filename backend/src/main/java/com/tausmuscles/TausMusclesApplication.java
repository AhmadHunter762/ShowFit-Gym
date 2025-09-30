package com.tausmuscles;

import com.tausmuscles.model.Food;
import com.tausmuscles.repository.FoodRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TausMusclesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TausMusclesApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(FoodRepository repository) {
        return args -> {
            repository.save(new Food("Oats with Banana", 350, "https://via.placeholder.com/220x140?text=Oats+Banana", "gain"));
            repository.save(new Food("Avocado Toast", 280, "https://via.placeholder.com/220x140?text=Avocado+Toast", "gain"));
            repository.save(new Food("Grilled Chicken Salad", 220, "https://via.placeholder.com/220x140?text=Grilled+Chicken+Salad", "lose"));
            repository.save(new Food("Steamed Veggies & Quinoa", 200, "https://via.placeholder.com/220x140?text=Steamed+Veggies+Quinoa", "lose"));
        };
    }
}
