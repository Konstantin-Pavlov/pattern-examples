package org.example.patterns.state.caps.interfaces;

import org.example.patterns.state.caps.model.Name;

public interface State {
    void changeCase(Name name);
}
