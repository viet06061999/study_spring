package com.example.sping_hibernate.dto;


import java.util.List;


public class FoodDto {
    private Integer id;
    private String name;
    private String dataType;
    private String foodCategory;
    private List<InfoDto> infos;

    public FoodDto() {
    }

    public FoodDto(String name, String dataType, String foodCategory) {
        this.name = name;
        this.dataType = dataType;
        this.foodCategory = foodCategory;
    }

    public FoodDto(Integer id, String name, String dataType, String foodCategory) {
        this.id = id;
        this.name = name;
        this.dataType = dataType;
        this.foodCategory = foodCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public List<InfoDto> getInfos() {
        return infos;
    }

    public void setInfos(List<InfoDto> infos) {
        this.infos = infos;
    }
}
