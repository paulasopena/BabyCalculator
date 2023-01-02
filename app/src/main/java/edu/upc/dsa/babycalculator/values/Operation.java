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
    public double computeOperation(double factor1,double factor2,int degreesOrRadians){
        if ((idOperation.length()!=1)&&(degreesOrRadians==0)){
            factor2=factor2*2*Math.PI/360;
        }
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
        if(Objects.equals(idOperation, "sin")){
            return Math.sin(factor2);
        }
        if(Objects.equals(idOperation, "cos")){
            return Math.cos(factor2);
        }
        if(Objects.equals(idOperation,"tan")){
            return Math.tan(factor2);
        }
        return -1;
    }
    public String getIdOperation(){
        return this.idOperation;
    }

}
