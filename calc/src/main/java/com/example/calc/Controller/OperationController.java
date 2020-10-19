package com.example.calc.Controller;

import com.example.calc.dto.EquationDTO;
import com.example.calc.Services.OperationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/calc")

public class OperationController {
    
    @Autowired
    OperationService service;

    double resultado;

    @PostMapping("/op")
    public ResponseEntity processOperation(@RequestBody EquationDTO eq) {
        
        EquationDTO equacao = EquationDTO.builder().x(eq.getX()).op(eq.getOp()).y(eq.getY()).build();

        try {
            
            resultado = Double.parseDouble(service.realizaOp(equacao.getX(), equacao.getOp(), equacao.getY()));
            return new ResponseEntity(resultado, HttpStatus.OK);

        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }


    }
    
}
