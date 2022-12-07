package exceptions.calculator;

public class ComplexCalculator {
    public float calculate(float a, float b) {
        if(b == 0) {
            throw new FatalException();
        }
        return a/b;
    }
    public float complexOperation(int nr) throws NumberTooHighException {
        float result = 3.5f;

        if(nr > 4) {
            throw new NumberTooHighException();
        }
        else {
            result = calculate(result, nr);
        }

        return result;
    }
}
