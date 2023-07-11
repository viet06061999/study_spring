package com.example.sping_hibernate.utils.mapping;

import com.example.sping_hibernate.dto.InfoDto;
import com.example.sping_hibernate.model.Food;
import com.example.sping_hibernate.model.Info;

public class InfoMapping {
    public static InfoDto toDTO(Info info) {
        return new InfoDto(info.getId(), info.getName(), info.getAverageAmount(), info.getUnit(), info.getMin(), info.getMax());
    }

    public static Info toEntity(InfoDto dto, Food food) {
        return new Info(null, dto.getName(), dto.getAverageAmount(), dto.getUnit(), dto.getMin(), dto.getMax(), food);
    }
}
