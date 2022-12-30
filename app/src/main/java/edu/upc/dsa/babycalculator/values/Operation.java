package edu.upc.dsa.babycalculator.values;

import android.util.Log;

import java.util.Objects;

public class Operation {
    String idOperation;
    public Operation(){
    }
    public Operation(String idOperation){
        this.idOperation=idOperation;
    }
    public int computeOperation(int factor1,int factor2){
        if(Objects.equals(idOperation, "+")){
            return (factor1+factor2);
        }
        if(Objects.equals(idOperation, "-")){
            return (factor1-factor2);
        }
        if (Objects.equals(idOperation, "÷")){
            return (factor1/factor2);
        }
        if (Objects.equals(idOperation, "x")){
            return (factor1*factor2);
        }
        return -1;
    }

}
