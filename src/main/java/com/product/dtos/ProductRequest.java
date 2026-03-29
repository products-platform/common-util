package com.product.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ProductRequest(
        Long productId,
        String sku,
        String name,
        String brand,
        String category,
        List<ProductVariantRequest> variants,
        Boolean active,
        Instant createdAt,
        Instant updatedAt
) {}
