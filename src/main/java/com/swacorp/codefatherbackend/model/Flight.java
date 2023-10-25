package com.swacorp.codefatherbackend.model;

import lombok.Builder;

import java.util.Date;

@Builder
public record Flight(long id, String type, String tailNuber, Date date) {

}
