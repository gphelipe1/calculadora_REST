package com.example.calc.Services;

import org.springframework.stereotype.Service;

@Service
public class OperationService {

    String result;
    
	public String realizaOp(double x, String op, double y) {
        try {
            if(op.equalsIgnoreCase("+")){ //Soma
        
                result =  String.valueOf(x + y);
        
            } else if(op.equalsIgnoreCase("-")){ //Subtrai
        
                result =  String.valueOf(x - y);
    
            } else if(op.equalsIgnoreCase("*")){ //Multiplica
                
                result = String.valueOf(x * y);
        
            } else if(op.equalsIgnoreCase("/")){ //Divide
        
                result = String.valueOf(x / y);
                
            } else if(op.equalsIgnoreCase("^")){ //Eleva à potencia Y
        
                result = String.valueOf(Math.pow(x, y)) ;
                
            }

            return result;

        } catch (Exception e) {
            return e.getMessage();
        }
	} 

}
