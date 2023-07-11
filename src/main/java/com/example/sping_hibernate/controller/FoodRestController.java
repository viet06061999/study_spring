package com.example.sping_hibernate.controller;


import com.example.sping_hibernate.dto.BaseResponse;
import com.example.sping_hibernate.dto.FoodDto;
import com.example.sping_hibernate.dto.food_request.FoodRequestDto;
import com.example.sping_hibernate.dto.food_request.FoodSpecification;
import com.example.sping_hibernate.repository.FoodRepository;
import com.example.sping_hibernate.service.FoodService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodRestController {
    private final FoodService service;
    private final FoodRepository repository;

    public FoodRestController(FoodService service, FoodRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping("/foods")
    public BaseResponse<List<FoodDto>> getAllFoods() {
        List<FoodDto> foods = service.findAll();
        return BaseResponse.success("Retrieve data success!", foods);
    }

    @PostMapping("/foods/search")
    public BaseResponse<Page<FoodDto>> getAllFoodsPaging(@RequestBody FoodRequestDto requestDto) {
        Pageable pageable = PageRequest.of(requestDto.getPage(), requestDto.getPerPage(), Sort.by(requestDto.getOrder()));
        FoodSpecification specification = new FoodSpecification(requestDto.getSearch());
        return BaseResponse.success("Retrieve data success!", service.findAllFoodsPaging(pageable, specification));
    }

    @PostMapping("/foods")
    public BaseResponse<FoodDto> createFood(@RequestBody FoodDto foodDto) {
        return BaseResponse.success("Create food success!", service.createFood(foodDto));
    }

    @GetMapping("/foods/{id}")
    public BaseResponse<FoodDto> getFoodDetail(@PathVariable("id") Integer id) {
        return BaseResponse.success("Retrieve data success!", service.findById(id));
    }
}
