package com.product.dtos;

public record ProductElasticeSearchRequest(
        String keyword,
        String brand,
        String category,
        Double minPrice,
        Double maxPrice,
        String color,
        String variantSize,   // ✅ renamed
        int page,
        int pageSize,         // ✅ renamed
        String sortBy,
        String sortDirection,
        // variant filters
        String variantColor

) {
}
