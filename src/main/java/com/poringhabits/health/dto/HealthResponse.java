package com.poringhabits.health.dto;

public record HealthResponse(
    String status,
    long timestamp,
    String service
) {}
