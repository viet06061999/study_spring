package com.example.sping_hibernate.model;


import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "data_type")
    private String dataType;

    @Column(name = "food_category")
    private String foodCategory;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "food_id")
    private Set<Info> infos;

    public Food() {
    }

    public Food(String name, String dataType, String foodCategory) {
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

    public Set<Info> getInfos() {
        return infos;
    }

    public void setInfos(Set<Info> infos) {
        this.infos = infos;
    }

    @PrePersist
    public void prePersist() {
        System.out.println("PrePersist: Entity is being persisted");
    }

    @PostPersist
    public void postPersist() {
        System.out.println("PostPersist: Entity has been persisted");
    }

    @PreUpdate
    public void preUpdate() {
        System.out.println("PreUpdate: Entity is being updated");
    }

    @PostUpdate
    public void postUpdate() {
        System.out.println("PostUpdate: Entity has been updated");
    }

    @PreRemove
    public void preRemove() {
        System.out.println("PreRemove: Entity is being removed");
    }

    @PostRemove
    public void postRemove() {
        System.out.println("PostRemove: Entity has been removed");
    }
}
