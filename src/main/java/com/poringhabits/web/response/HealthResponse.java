package com.poringhabits.web.response;

public record HealthResponse(
    String status,
    long timestamp,
    String service,
    String database
) {}
