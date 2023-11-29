package com.demo.food.repository;

import com.demo.food.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository <Food, Long> {

    Food findFoodByFoodType(String foodType);
}
