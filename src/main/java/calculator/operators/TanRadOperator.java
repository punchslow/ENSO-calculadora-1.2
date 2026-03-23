/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.operators;

import static java.lang.Double.NaN;

/**
 *
 * @author maria
 */
public class TanRadOperator implements UnaryOperator {
    
    @Override
    public Double execute(Double num) {
        double eps = 1e-10;
        if (Math.abs(num % Math.PI) < eps) {
            return 0.0;
        }
        else if (Math.abs(num % (Math.PI/2)) < eps) {
            return NaN;
        }
        return Math.tan(num);
    }
    
}
