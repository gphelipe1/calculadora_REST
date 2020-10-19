package com.example.calc.Services;

import org.springframework.stereotype.Service;

@Service
public class OperationService {

	public double realizaOp(double x, String op, double y) {
		
        if(op.equalsIgnoreCase("soma")){
    
            return x + y;
    
        } else if(op.equalsIgnoreCase("subtrai")){
    
            return x - y;
    
        } else if(op.equalsIgnoreCase("divide")){
    
            return x / y;
            
        } else if(op.equalsIgnoreCase("potencua")){
    
            return Math.pow(x, y) ;
            
        }
        else{
            return -99999999;
        }
	} 

}
