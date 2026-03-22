package com.product.dtos;

public record InventoryVariantStock(
        String size,
        String color,
        String configuration,
        Integer stock
) {
}
