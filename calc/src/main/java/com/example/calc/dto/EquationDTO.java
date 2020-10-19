package com.example.calc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class EquationDTO {
    double x;
    String op;
    double y;
}
