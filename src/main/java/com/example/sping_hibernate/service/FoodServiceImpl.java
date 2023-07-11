package com.example.sping_hibernate.service;

import com.example.sping_hibernate.dto.FoodDto;
import com.example.sping_hibernate.exception.NotFoundException;
import com.example.sping_hibernate.repository.FoodRepository;
import com.example.sping_hibernate.model.Food;
import com.example.sping_hibernate.utils.mapping.FoodMapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodServiceImpl implements FoodService {
    private final FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository repository) {
        foodRepository = repository;
    }

    @Override
    public List<FoodDto> findAll() {
        return foodRepository.findAllFoods().stream().map(FoodMapping::toDTO).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public FoodDto findById(Integer id) {
        Food food = foodRepository.getDetail(id);
        if (food == null) {
            throw new NotFoundException("Không tồn tại food!");
        }
        return FoodMapping.toDTODetail(food);
    }

    @Override
    public FoodDto createFood(FoodDto dto) {
        Food food = FoodMapping.toEntityDetail(dto);
        return FoodMapping.toDTO(foodRepository.save(food));
    }

    @Override
    public Page<FoodDto> findAllFoodsPaging(Pageable pageable, Specification<Food> specification) {
        return foodRepository.findAll(specification, pageable).map(FoodMapping::toDTO);
    }
}
