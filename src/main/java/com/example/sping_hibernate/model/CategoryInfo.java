//package com.example.sping_hibernate.model;
//
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.Set;
//
//
//@Entity
//@Table(name = "category_info")
//public class CategoryInfo {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Integer id;
//
//    @Column(name = "name")
//    private String name;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = {
//            CascadeType.PERSIST, CascadeType.DETACH,
//            CascadeType.MERGE, CascadeType.REFRESH
//    })
//    @JoinColumn(name = "food_id")
//    private Food food;
//
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "category_info_id")
//    private Set<Info> infos;
//
//    public CategoryInfo() {
//    }
//
//    public CategoryInfo(String name) {
//        this.name = name;
//    }
//
//    public CategoryInfo(Integer id, String name, Food food) {
//        this.id = id;
//        this.name = name;
//        this.food = food;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Food getFood() {
//        return food;
//    }
//
//    public void setFood(Food food) {
//        this.food = food;
//    }
//
//    public Set<Info> getInfos() {
//        return infos;
//    }
//
//    public void setInfos(Set<Info> infos) {
//        this.infos = infos;
//    }
//}
