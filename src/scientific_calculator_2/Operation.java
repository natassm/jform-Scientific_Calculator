/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientific_calculator_2;

/**
 *
 * @author Natasha
 */
public class Operation {
    public String result;
    public double firstnum;
    public double secondnum;
    private Object math;

    public void setFirstnum(double firstnum) {
        this.firstnum = firstnum;
    }

    public double getFirstnum() {
        return firstnum;
    }

    public void setSecondnum(double secondnum) {
        this.secondnum = secondnum;
    }

    public double getSecondnum() {
        return secondnum;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
    
        
    public void plus(double a, double b){
        double result = a + b;
        String total = result + "";
        setResult(total);
    }
       
    public void plus(int a, int b){
        int result = a + b;
        String total = result + "";
        setResult(total);
    }
    
    public void minus(double a, double b){
        double result = a - b;
        String total = result + "";
        setResult(total);
    }
       
    public void minus(int a, int b){
        int result = a - b;
        String total = result + "";
        setResult(total);
    }
    
    public void times(double a, double b){
        double result = a * b;
        String total = result + "";
        setResult(total);
    }
       
    public void times(int a, int b){
        int result = a * b;
        String total = result + "";
        setResult(total);
    }
    
    public void divide(double a, double b){
        double result = a / b;
        String total = result + "";
        setResult(total);
    }
       
    public void divide(int a, int b){
        int result = a / b;
        String total = result + "";
        setResult(total);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    public void sin(double a){
        double result = Math.sin(a);
        String total = result + "";
        setResult(total);
    }

    
     public void cos(double a){
        double result = Math.cos(a);
        String total = result + "";
        setResult(total);
    }
}
