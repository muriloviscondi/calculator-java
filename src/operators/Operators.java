package operators;

public class Operators {
    private double num1 = 0, num2 = 0, result = 0;
    private char operator = ' ';
    private boolean operatorEnable = false;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public double setResult(char operatorValue, String textField) {
        if (num1 == 0 && num2 == 0) {
            setNum1(Double.parseDouble(textField));

            return num1;
        }

        if (Character.isWhitespace(operatorValue)) {
            return num1;
        }

        setNum2(Double.parseDouble(textField));

        switch (operatorValue) {
            case '+':
                this.result = num1 + num2;
                break;
            case '-':
                this.result = num1 - num2;
                break;
            case '*':
                this.result = num1 * num2;
                break;
            case '/':
                this.result = num1 / num2;
                break;
        }

        setNum1(result);

        return result;
    }

    public char getOperator() {
        return this.operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public boolean isOperatorEnable() {
        return this.operatorEnable;
    }

    public void setOperatorEnable(boolean operatorEnable) {
        this.operatorEnable = operatorEnable;
    }
}
