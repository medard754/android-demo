package medard754.demo;

import android.os.Bundle;
import android.widget.EditText;

public class Calculator{
    private double result=0;
    public Calculator effacer(){
        this.result=0;
        return  this;
    }
    public Calculator addition(double a, double b){
        this.result=this.result+a+b;
        return this;
    }
    public Calculator soustraction(double a, double b){
        this.result=this.result-a-b;
        return this;
    }
    public Calculator multiplication(double a, double b){
        if(this.result==0){
            this.result=a*b;
        }
        this.result=this.result*a*b;
        return this;
    }
    public Calculator division(double a, double b){
        if(this.result==0 && b != 0){
            this.result=a/b;
            return  this;
        }
        if(a!=0 && b!=0){
            this.result=this.result/a/b;
            return  this;
        }
        return  this;
    }
    public Calculator reste(double a, double b){
        if(this.result==0 && b!=0){
            this.result=a/b;
            return  this;
        }
        if(a!=0 && b!=0){
            this.result=this.result /a/b;
            return  this;
        }
        return  this;
    }
    public  int toInt(){
        int result=(int) this.result;
        return result;
    }
}
