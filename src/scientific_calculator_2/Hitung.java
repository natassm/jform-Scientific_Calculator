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
public class Hitung {
    
    public String plus(Operation op) {
        double result = op.getFirstnum() + op.getSecondnum();
        String total = result + "";
        return total;
    }
    
    public String minus(Operation op){
        double result = op.getFirstnum() - op.getSecondnum();
        String total = result + "";
        return total;
    }
    
    public String times(Operation op){
        double result = op.getFirstnum() * op.getSecondnum();
        String total = result + "";
        return total;
    }
    
    public String divide(Operation op){
        double result = op.getFirstnum() / op.getSecondnum();
        String total = result + "";
        return total;
    }
}
