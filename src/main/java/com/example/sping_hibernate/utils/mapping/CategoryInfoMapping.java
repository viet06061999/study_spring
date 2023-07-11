//package com.example.sping_hibernate.utils.mapping;
//
//import com.example.sping_hibernate.dto.CategoryInfoDto;
//import com.example.sping_hibernate.dto.InfoDto;
//import com.example.sping_hibernate.model.CategoryInfo;
//import com.example.sping_hibernate.model.Food;
//import com.example.sping_hibernate.model.Info;
//
//import java.util.stream.Collectors;
//
//public class CategoryInfoMapping {
//
//    public static CategoryInfoDto toDTO(CategoryInfo categoryInfo) {
//        return new CategoryInfoDto(categoryInfo.getId(), categoryInfo.getName());
//    }
//
//    public static CategoryInfoDto toDTODetail(CategoryInfo categoryInfo) {
//        CategoryInfoDto categoryInfoDto = toDTO(categoryInfo);
//        categoryInfoDto.setInfos(categoryInfo.getInfos().stream().map(
//                InfoMapping::toDTO
//        ).collect(Collectors.toList()));
//        return categoryInfoDto;
//    }
//
//    public static CategoryInfo toEntity(CategoryInfoDto dto) {
//        return new CategoryInfo(dto.getName());
//    }
//
//    public static CategoryInfo toEntityDetail(CategoryInfoDto dto, Food food) {
//        CategoryInfo categoryInfo = toEntity(dto);
//        categoryInfo.setInfos(dto.getInfos().stream().map(
//                infoDto -> InfoMapping.toEntity(infoDto, categoryInfo)
//        ).collect(Collectors.toSet()));
//        categoryInfo.setFood(food);
//        return categoryInfo;
//    }
//}
