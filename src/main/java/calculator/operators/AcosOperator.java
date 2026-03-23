package calculator.operators;

public class AcosOperator implements UnaryOperator {
    @Override
    public Double execute(Double num) {
        return Math.toDegrees(Math.acos(num));
    }
}