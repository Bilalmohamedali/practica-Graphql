package com.app.ecom.Dto;

public record ProductoRequest(

        String id,
        String nombre,
        double precio,
        int cantidad,
        Long categoriaId
) {
}
