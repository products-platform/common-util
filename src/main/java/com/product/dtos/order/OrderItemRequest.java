package com.product.dtos.order;

public record OrderItemRequest(
        Long productId,
        Long variantId,
        Integer quantity,
        Integer locationId,
        String variantName
) {}
