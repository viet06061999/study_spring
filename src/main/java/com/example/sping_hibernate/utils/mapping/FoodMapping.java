package com.example.sping_hibernate.utils.mapping;

import com.example.sping_hibernate.dto.FoodDto;
import com.example.sping_hibernate.model.Food;

import java.util.stream.Collectors;

public class FoodMapping {
    public static FoodDto toDTO(Food food) {
        return new FoodDto(food.getId(), food.getName(), food.getDataType(), food.getFoodCategory());
    }

    public static FoodDto toDTODetail(Food food) {
        FoodDto dto = toDTO(food);
        if (food.getInfos() != null) {
            dto.setInfos(
                    food.getInfos().stream().map(
                            InfoMapping::toDTO
                    ).collect(Collectors.toList())
            );
        }
        return dto;
    }

    public static Food toEntity(FoodDto dto) {
        return new Food(dto.getName(), dto.getDataType(), dto.getFoodCategory());
    }

    public static Food toEntityDetail(FoodDto dto) {
        Food food = toEntity(dto);
        if (dto.getInfos() != null) {
            food.setInfos(
                    dto.getInfos().stream().map(info -> InfoMapping.toEntity(info, food)
                    ).collect(Collectors.toSet())
            );
        }
        return food;
    }
}
