package com.example.sping_hibernate.repository;

import com.example.sping_hibernate.model.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>, JpaSpecificationExecutor<Food> {

    @Query("SELECT f FROM Food f")
    List<Food> findAllFoods();

    @Query("SELECT f FROM Food f")
    Page<Food> findAllFoodsPaging(Pageable pageable, Specification<Food> specification);

    @Query("SELECT DISTINCT f FROM Food f  JOIN fetch f.infos WHERE f.id = :id ")
    Food getDetail(@Param("id") Integer id);
}
