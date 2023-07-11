package com.example.sping_hibernate.dto;

import java.util.List;

public class CategoryInfoDto {

    private Integer id;

    private String name;

    private List<InfoDto> infos;

    public CategoryInfoDto() {
    }

    public CategoryInfoDto(String name) {
        this.name = name;
    }

    public CategoryInfoDto(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public List<InfoDto> getInfos() {
        return infos;
    }

    public void setInfos(List<InfoDto> infos) {
        this.infos = infos;
    }
}
