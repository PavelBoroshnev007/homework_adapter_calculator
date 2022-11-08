public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(a)
                        .addOperand(b)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );
        Calculator calc2 = new Calculator();
        System.out.println(
                calc2.newFormula()
                        .addOperand(a)
                        .addOperand(b)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
        Calculator calc3 = new Calculator();
        System.out.println(
                calc2.newFormula()
                        .addOperand(a)
                        .addOperand(b)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );
        System.out.println();
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(a, b));
        System.out.println(intsCalc.mult(a, b));
        System.out.println(intsCalc.pow(a, b));

    }
}
