public class Calculator {

    public static float calculator(float firstOperator, float secondOperator, char operator) {
        switch (operator) {
            case '+':
                return firstOperator + secondOperator;
            case '-':
                return firstOperator - secondOperator;
            case '*':
                return firstOperator * secondOperator;
            case '/':
                if (secondOperator != 0) {
                    return firstOperator / secondOperator;
                } else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
