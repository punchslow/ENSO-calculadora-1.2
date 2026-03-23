package calculator.operators;

public class AsinOperator implements UnaryOperator {
    @Override
    public Double execute(Double num) {
        return Math.toDegrees(Math.asin(num));
    }
}