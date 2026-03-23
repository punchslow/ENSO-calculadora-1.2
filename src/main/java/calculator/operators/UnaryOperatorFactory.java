/**
 * @name        Unary Operator Factory class
 * @package     calculator.operators
 * @file        UnaryOperatorFactory.java
 * @description Factory for creating UnaryOperator instances
 */

package calculator.operators;

import calculator.domain.DegreesRadiansModes;
import calculator.domain.UnaryOperatorModes;

public class UnaryOperatorFactory {
    
    /**
     * Create instance of a UnaryOperator based on the given mode
     * @param mode The mode of the operator to create
     * @return The created UnaryOperator instance
     * @throws IllegalArgumentException if the mode is not recognized
     */
    public static UnaryOperator create(UnaryOperatorModes mode, DegreesRadiansModes grados) {
        return switch (mode) {
            case SQUARE -> new SquareOperator();
            case SQRT -> new SqrtOperator();
            case INV -> new InvOperator();
            case COS -> (grados == DegreesRadiansModes.DEGREES ? new CosOperator() : new CosRadOperator());
            case SIN -> (grados == DegreesRadiansModes.DEGREES ? new SinOperator() : new SinRadOperator());
            case TAN -> (grados == DegreesRadiansModes.DEGREES ? new TanOperator() : new TanRadOperator());
            case ACOS -> (grados == DegreesRadiansModes.DEGREES ? new AcosOperator() : new AcosRadOperator());
            case ASIN -> (grados == DegreesRadiansModes.DEGREES ? new AsinOperator() : new AsinRadOperator());
            case ATAN -> (grados == DegreesRadiansModes.DEGREES ? new AtanOperator() : new AtanRadOperator());
            case LOG -> new LogOperator();
            case LN -> new LnOperator();
            case PERCENT -> new PercentOperator();
            case ABS -> new AbsOperator();
            case BIN -> new BinOperator();
            case NEGATE -> new NegateOperator();
            default -> throw new IllegalArgumentException("Unknown operator mode: " + mode);
        };
    }
}
