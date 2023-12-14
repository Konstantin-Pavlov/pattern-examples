package org.example.patterns.state.caps;

import org.example.patterns.state.caps.model.Name;
import org.example.patterns.state.caps.state.CapitalizeState;
import org.example.patterns.state.caps.state.LowerCaseState;
import org.example.patterns.state.caps.state.UpperCaseState;

public class CapsRunner {
    public static void main(String[] args) {
        Name name = new Name("tiM");

        System.out.println(name.getName());

        name.setState(new LowerCaseState());
        name.changeCase();
        System.out.println(name.getName());

        name.setState(new UpperCaseState());
        name.changeCase();
        System.out.println(name.getName());

        name.setState(new CapitalizeState());
        name.changeCase();
        System.out.println(name.getName());
    }
}
