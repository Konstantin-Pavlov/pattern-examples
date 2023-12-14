package org.example.patterns.state.caps.state;

import org.example.patterns.state.caps.interfaces.State;
import org.example.patterns.state.caps.model.Name;

import static org.apache.commons.text.WordUtils.capitalizeFully;


public class CapitalizeState implements State {
    @Override
    public void changeCase(Name name) {
        name.setName(capitalizeFully(name.getName()));
    }
}
