package org.example.patterns.state.caps.state;

import org.example.patterns.state.caps.interfaces.State;
import org.example.patterns.state.caps.model.Name;

public class LowerCaseState implements State {
    @Override
    public void changeCase(Name name) {
        name.setName(name.getName().toLowerCase());
    }
}
