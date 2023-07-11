package com.example.sping_hibernate.dto;

public class InfoDto {

    private Integer id;

    private String name;

    private Integer averageAmount;
    private String unit;
    private Integer min;

    private Integer max;

    public InfoDto() {
    }

    public InfoDto(String name, Integer averageAmount, String unit, Integer min, Integer max) {
        this.name = name;
        this.averageAmount = averageAmount;
        this.unit = unit;
        this.min = min;
        this.max = max;
    }

    public InfoDto(Integer id, String name, Integer averageAmount, String unit, Integer min, Integer max) {
        this.id = id;
        this.name = name;
        this.averageAmount = averageAmount;
        this.unit = unit;
        this.min = min;
        this.max = max;
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

    public Integer getAverageAmount() {
        return averageAmount;
    }

    public void setAverageAmount(Integer averageAmount) {
        this.averageAmount = averageAmount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

}
