package InterpreterTest;

import org.example.patterns.interpreter.Evaluate;
import org.example.patterns.interpreter.interfaces.Expression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InterpreterTests {
    @Test
    public void test1() {
        String expression = "1+2+3-4";
        int answer = 2;
        Expression evaluator = new Evaluate(expression);
        Assertions.assertEquals(answer, evaluator.interpret(evaluator));
    }
    @Test
    public void test2() {
        String expression = "1+2+3";
        int answer = 6;
        Expression evaluator = new Evaluate(expression);
        Assertions.assertEquals(answer, evaluator.interpret(evaluator));
    }
    @Test
    public void test3() {
        String expression = "1+2";
        int answer = 3;
        Expression evaluator = new Evaluate(expression);
        Assertions.assertEquals(answer, evaluator.interpret(evaluator));
    }
    @Test
    public void test4() {
        String expression = "12+2";
        int answer = 12;
        Expression evaluator = new Evaluate(expression);
        Assertions.assertEquals(answer, evaluator.interpret(evaluator));
    }
}
