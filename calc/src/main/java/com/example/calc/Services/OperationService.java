package com.example.calc.Services;

import org.springframework.stereotype.Service;

@Service
public class OperationService {
    
	public String soma(double x, double y) {
        try {
            
            return String.valueOf(x + y);
            
        } catch (Exception e) {

            return e.getMessage();
        }
    }

    public String subtrai(double x, double y) {
        try {
            
            return String.valueOf(x + y);
            
        } catch (Exception e) {
            
            return e.getMessage();
        }
    }
    public String multiplica(double x, double y) {
        try {
            
            return String.valueOf(x + y);
            
        } catch (Exception e) {
            
            return e.getMessage();
        }
    }
    public String divide(double x, double y) {
        try {
            
            return String.valueOf(x + y);
            
        } catch (Exception e) {
            
            return e.getMessage();
        }
    }
    public String potencia(double x, double y) {
        try {
            
            return String.valueOf(Math.pow(x, y));
            
        } catch (Exception e) {
            
            return e.getMessage();
        }
    }
        
}
