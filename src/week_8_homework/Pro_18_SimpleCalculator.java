package week_8_homework;

public class Pro_18_SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {

        return firstNumber;
    }

    public double getSecondNumber() {

        return secondNumber;
    }

    public void setFirstNumber(double f1) {

        this.firstNumber = f1;
    }

    public void setSecondNumber(double s1) {

        this.secondNumber = s1;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        return this.secondNumber == 0 ? 0 : this.firstNumber / this.secondNumber;
    }

    public static void main(String[] args) {

        Pro_18_SimpleCalculator calculator = new Pro_18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }


}
