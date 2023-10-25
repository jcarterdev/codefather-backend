package com.swacorp.codefatherbackend.model;


import lombok.Builder;

@Builder
public record Schedule(long id, String name) {
}
