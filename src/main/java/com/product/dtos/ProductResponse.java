package com.product.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.time.Instant;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ProductResponse(Long id,
                              String sku,
                              String name,
                              String brand,
                              String category,
                              Boolean active,
                              Instant createdAt,
                              Instant updatedAt) implements Serializable {
    public static ProductResponse limit(Long id) {
        return new ProductResponse(
                id,
                null,
                "Product unavailable",
                null,
                null,
                null,
                null,
                null
        );
    }

    public static ProductResponse empty(Long id) {
        return new ProductResponse(
                id,
                null,
                "Product unavailable",
                null,
                null,
                null,
                null,
                null
        );
    }
}
