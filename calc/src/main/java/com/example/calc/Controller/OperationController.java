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

    @PostMapping("/soma")
    public ResponseEntity soma(@RequestBody EquationDTO eq) {
        
        EquationDTO equacao = EquationDTO.builder().x(eq.getX()).y(eq.getY()).build();

        try {
            
            resultado = Double.parseDouble(service.soma(equacao.getX(), equacao.getY()));
            return new ResponseEntity(resultado, HttpStatus.OK);

        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }

    }

    @PostMapping("/subtrai")
    public ResponseEntity subtrai(@RequestBody EquationDTO eq) {
        
        EquationDTO equacao = EquationDTO.builder().x(eq.getX()).y(eq.getY()).build();

        try {
            
            resultado = Double.parseDouble(service.subtrai(equacao.getX(), equacao.getY()));
            return new ResponseEntity(resultado, HttpStatus.OK);

        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }

    }

    @PostMapping("/multiplica")
    public ResponseEntity multiplica(@RequestBody EquationDTO eq) {
        
        EquationDTO equacao = EquationDTO.builder().x(eq.getX()).y(eq.getY()).build();

        try {
            
            resultado = Double.parseDouble(service.multiplica(equacao.getX(), equacao.getY()));
            return new ResponseEntity(resultado, HttpStatus.OK);

        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }

    }

    @PostMapping("/divide")
    public ResponseEntity divide(@RequestBody EquationDTO eq) {
        
        EquationDTO equacao = EquationDTO.builder().x(eq.getX()).y(eq.getY()).build();

        try {
            
            resultado = Double.parseDouble(service.divide(equacao.getX(), equacao.getY()));
            return new ResponseEntity(resultado, HttpStatus.OK);

        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }

    }

    @PostMapping("/potencia")
    public ResponseEntity processOperation(@RequestBody EquationDTO eq) {
        
        EquationDTO equacao = EquationDTO.builder().x(eq.getX()).y(eq.getY()).build();

        try {
            
            resultado = Double.parseDouble(service.potencia(equacao.getX(), equacao.getY()));
            return new ResponseEntity(resultado, HttpStatus.OK);

        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }

    }
    
}