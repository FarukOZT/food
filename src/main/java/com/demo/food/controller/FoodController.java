package com.demo.food.controller;

import com.demo.food.model.Food;
import com.demo.food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FoodController {

    @Autowired
    FoodService foodService;

    @PostMapping("/add")
    public Food addfood(@RequestBody Food food) {
        return foodService.addfood(food);
    }
    @GetMapping("/getAll")
    public List<Food> getAllfood() {
        return foodService.getAllFood();
    }

    @GetMapping("/searchFood")
    public Food searchFoodByType(@RequestParam(value = "type") String foodType){
        return foodService.searchFoodByType(foodType);
    }
    @DeleteMapping("/delete/{foodId}")
    public ResponseEntity deleteFood(@PathVariable Long foodId) {
        foodService.deletefood(foodId);
        return ResponseEntity.ok("Silindi : " + foodId);
    }


}
