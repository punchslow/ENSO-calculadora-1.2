/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.operators;

/**
 *
 * @author maria
 */
public class SinRadOperator implements UnaryOperator {
    @Override
    public Double execute(Double num) {
        return Math.sin(num);
    }
}
