package edu.upc.dsa.babycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Stack;

import edu.upc.dsa.babycalculator.values.Operation;

public class MainActivity extends AppCompatActivity {
    String numbers;
    String numbersShown;
    Operation operation;
    int degreesOrRadians=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers="";
        numbersShown="";
        setLabel("");
    }
    public void Clear(View view){
        numbers="";
        numbersShown="";
        setLabel("");
    }
    public void Zero(View view) {
        numbers=numbers+"0";
        numbersShown=numbersShown+"0";
        setLabel(numbersShown);
    }
    public void One(View view) {
        numbers=numbers+"1";
        numbersShown=numbersShown+"1";
        setLabel(numbersShown);
    }
    public void Two(View view) {
        numbers=numbers+"2";
        numbersShown=numbersShown+"2";
        setLabel(numbersShown);
    }
    public void Three(View view) {
        numbers=numbers+"3";
        numbersShown=numbersShown+"3";
        setLabel(numbersShown);
    }
    public void Four(View view) {
        numbers=numbers+"4";
        numbersShown=numbersShown+"4";
        setLabel(numbersShown);
    }
    public void Five(View view) {
        numbers=numbers+"5";
        numbersShown=numbersShown+"5";
        setLabel(numbersShown);
    }
    public void Six(View view) {
        numbers=numbers+"6";
        numbersShown=numbersShown+"6";
        setLabel(numbersShown);
    }
    public void Seven(View view) {
        numbers=numbers+"7";
        numbersShown=numbersShown+"7";
        setLabel(numbersShown);
    }
    public void Eight(View view) {
        numbers=numbers+"8";
        numbersShown=numbersShown+"8";
        setLabel(numbersShown);
    }
    public void Nine(View view) {
        numbers=numbers+"9";
        numbersShown=numbersShown+"9";
        setLabel(numbersShown);
    }
    public void Minus(View view) {
        numbers=numbers+" ";
        numbersShown=numbersShown+"-";
        this.operation=new Operation("-");
        setLabel(numbersShown);
    }
    public void Multiply(View view) {
        numbers=numbers+" ";
        numbersShown=numbersShown+"x";
        this.operation=new Operation("x");
        setLabel(numbersShown);
    }
    public void Sum(View view) {
        numbers=numbers+" ";
        numbersShown=numbersShown+"+";
        this.operation=new Operation("+");
        setLabel(numbersShown);
    }
    public void Divide(View view) {
        numbers=numbers+" ";
        numbersShown=numbersShown+"÷";
        this.operation=new Operation("÷");
        setLabel(numbersShown);
    }
    public void Sinus(View view){
        numbers=numbers+" ";
        numbersShown=numbersShown+"sin";
        this.operation=new Operation("sin");
        setLabel(numbersShown);
    }
    public void Cosinus(View view){
        numbers=numbers+" ";
        numbersShown=numbersShown+"cos";
        this.operation=new Operation("cos");
        setLabel(numbersShown);
    }
    public void Tangent(View view){
        numbers=numbers+" ";
        numbersShown=numbersShown+"tan";
        this.operation=new Operation("tan");
        setLabel(numbersShown);
    }
    public void Comma(View view){
        numbers=numbers+".";
        numbersShown=numbersShown+".";
        setLabel(numbersShown);
    }
    public void Pi(View view) {
        numbers=numbers+ Math.PI;
        numbersShown=numbersShown+Math.PI;
        setLabel(numbersShown);
    }
    public void setDegrees(View view){
        this.degreesOrRadians=0;
    }
    public void setRadians(View view){
        this.degreesOrRadians=1;
    }
    public double Equal(View view){
        String factor1="0";
        String factor2="0";
        for(int i =0; i<numbers.length();i++){
            char number=numbers.charAt(i);
            if(String.valueOf(number).equals(" ")){
                factor1=numbers.substring(0,i);
                Log.i("FACTOR1:","FACTOR1="+factor1);
                factor2=numbers.substring(i+1);
                Log.i("FACTOR1:","FACTOR2="+factor2);
                break;
            }
        }
        this.numbers="";
        double result;
        if(this.operation.getIdOperation().length()!=1){
            result=this.operation.computeOperation(0,Double.parseDouble(factor2),this.degreesOrRadians);
            setLabel(String.valueOf(result));
            if(this.degreesOrRadians==0){
                return (result*360/(2*Math.PI));
            }
            return result;
        }
        result=this.operation.computeOperation(Double.parseDouble(factor1),Double.parseDouble(factor2),this.degreesOrRadians);
        setLabel(String.valueOf(result));
        return result;
    }
    public void setLabel(String newLabel){
        String updateTitle =getString(R.string.result);
        updateTitle=newLabel;
        EditText editorTitle = (EditText) findViewById (R.id.Edit_Title_Update);
        editorTitle.setText(updateTitle);
    }



}