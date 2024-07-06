package com.docdoc.settings.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Filter {
    @Id
    @GeneratedValue
    private long id;

    private String nameRus;
    private String description;
    private String nameEng;
    private FilterType type;
    private boolean isActive;

    public enum FilterType {
        SPECIALTY,
        BODY_SYSTEMS,
        ADMISSION_OPTION
    }
}
