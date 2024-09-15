package stateCapsTest;

import org.example.patterns.state.caps.model.Name;
import org.example.patterns.state.caps.state.CapitalizeState;
import org.example.patterns.state.caps.state.LowerCaseState;
import org.example.patterns.state.caps.state.UpperCaseState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateCapsTests {
    String name = "jOhN";
    Name john = new Name(name);

    @Test
    public void test1() {
        john.setState(new LowerCaseState());
        john.changeCase();
        Assertions.assertEquals(name.toLowerCase(), john.getName());
    }

    @Test
    public void test2() {
        john.setState(new UpperCaseState());
        john.changeCase();
        Assertions.assertEquals(name.toUpperCase(), john.getName());
    }

    @Test
    public void test3() {
        john.setState(new CapitalizeState());
        john.changeCase();
        Assertions.assertEquals(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase(), john.getName());
    }
}
