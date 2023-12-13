package InterpreterTest;

import org.example.patterns.interpreter.Evaluate;
import org.example.patterns.interpreter.interfaces.Expression;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class InterpreterTests {
    @Test
    public void test1() {
        String expression = "1+2+3-4"; // 2
        int answer = 2;
        Expression evaluator = new Evaluate(expression);
        Assert.assertEquals(answer, evaluator.interpret(evaluator));
    }
}
