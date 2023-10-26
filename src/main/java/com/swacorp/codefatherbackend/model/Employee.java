package com.swacorp.codefatherbackend.model;

import com.swacorp.codefatherbackend.type.ShiftPreference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int seniority;
    @Enumerated(EnumType.STRING)
    private ShiftPreference shiftPreference;
}
