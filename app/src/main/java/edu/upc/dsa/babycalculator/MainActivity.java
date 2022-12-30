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
    Operation operation;
    Stack<Integer> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers="";
        results=new Stack<Integer>();
        setLabel("");
    }
    public void Clear(View view){
        numbers="";
        setLabel("");
    }
    public void Zero(View view) {
        numbers=numbers+"0";
        setLabel(numbers);
    }
    public void One(View view) {
        numbers=numbers+"1";
        setLabel(numbers);
    }
    public void Two(View view) {
        numbers=numbers+"2";
        setLabel(numbers);
    }
    public void Three(View view) {
        numbers=numbers+"3";
        setLabel(numbers);
    }
    public void Four(View view) {
        numbers=numbers+"4";
        setLabel(numbers);
    }
    public void Five(View view) {
        numbers=numbers+"5";
        setLabel(numbers);
    }
    public void Six(View view) {
        numbers=numbers+"6";
        setLabel(numbers);
    }
    public void Seven(View view) {
        numbers=numbers+"7";
        setLabel(numbers);
    }
    public void Eight(View view) {
        numbers=numbers+"8";
        setLabel(numbers);
    }
    public void Nine(View view) {
        numbers=numbers+"9";
        setLabel(numbers);
    }
    public void Minus(View view) {
        numbers=numbers+" ";
        this.operation=new Operation("-");
        setLabel("");
    }
    public void Multiply(View view) {
        numbers=numbers+" ";
        this.operation=new Operation("x");
        setLabel("");
    }
    public void Sum(View view) {
        numbers=numbers+" ";
        this.operation=new Operation("+");
        setLabel("");
    }
    public void Divide(View view) {
        numbers=numbers+" ";
        this.operation=new Operation("÷");
        setLabel("");
    }
    public int Equal(View view){
        String factor1="0";
        String factor2="0";
        for(int i =0; i<numbers.length();i++){
            char number=numbers.charAt(i);
            if(String.valueOf(number).equals(" ")){
                factor1=numbers.substring(0,i);
                Log.i("FACTOR1:","FACTOR1="+factor1);
                factor2=numbers.substring(i+1);
                Log.i("FACTOR1:","FACTOR1="+factor2);
                break;
            }
        }
        this.numbers="";
        int result=this.operation.computeOperation(Integer.parseInt(factor1),Integer.parseInt(factor2));
        results.add(result);
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