package com.example.sping_hibernate.service;

import com.example.sping_hibernate.dto.FoodDto;
import com.example.sping_hibernate.model.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface FoodService {
   List<FoodDto> findAll();

   FoodDto findById(Integer id);

   FoodDto createFood(FoodDto dto);

   Page<FoodDto> findAllFoodsPaging(Pageable pageable, Specification<Food> specification);
}
