package exceptions.calculator;

public class Main {
    public static void main(String[] args) throws NumberTooHighException {
        ComplexCalculator cc = new ComplexCalculator();
        try {
            cc.complexOperation(6);
        } catch(NumberTooHighException e) {
            e.printStackTrace();
        }
        cc.complexOperation(0);

        System.out.println("End! ");
    }
}
