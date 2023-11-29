package com.demo.food.service;

import com.demo.food.model.Food;
import com.demo.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepository;
    public Food addfood(Food food) {
        food.setId(food.getId());
        food.setFoodName(food.getFoodName());
        food.setFoodMaterials(food.getFoodMaterials());
        food.setFoodType(food.getFoodType());
        food.setRecipes(food.getRecipes());
        food.setFoodPic(food.getFoodPic());
        foodRepository.save(food);
        return food;
    }

    public void deletefood(Long id) {
        foodRepository.deleteById(id);
    }

    public List<Food> getAllFood() {
        return foodRepository.findAll();

    }

    public Food searchFoodByType(String foodType) {
        return foodRepository.findFoodByFoodType(foodType);

    }
}
