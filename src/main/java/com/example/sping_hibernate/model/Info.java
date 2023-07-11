package com.example.sping_hibernate.model;


import javax.persistence.*;

@Entity
@Table(name = "info")
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "av_amount")
    private  Integer averageAmount;
    @Column(name = "unit")
    private  String unit;
    @Column(name = "min")
    private  Integer min;

    @Column(name = "max")
    private  Integer max;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

    public Info() {
    }

    public Info(String name, Integer averageAmount, String unit, Integer min, Integer max) {
        this.name = name;
        this.averageAmount = averageAmount;
        this.unit = unit;
        this.min = min;
        this.max = max;
    }

    public Info(Integer id, String name, Integer averageAmount, String unit, Integer min, Integer max, Food food) {
        this.id = id;
        this.name = name;
        this.averageAmount = averageAmount;
        this.unit = unit;
        this.min = min;
        this.max = max;
        this.food = food;
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

    public void setMax(Integer max) {
        this.max = max;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
