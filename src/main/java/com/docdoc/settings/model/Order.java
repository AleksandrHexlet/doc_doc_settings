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
public class Order {
    @Id
    @GeneratedValue
    private long id;
    private OrderDirection orderDirection;
    private String criteria;
    private boolean isActive;

    public enum OrderDirection {
        ASCENDING,
        DESCENDING
    }
}
