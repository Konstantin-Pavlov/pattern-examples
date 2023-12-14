package org.example.patterns.state.caps.model;

import org.example.patterns.state.caps.interfaces.State;

public class Name {
    private String name;
    private State state;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeCase(){
        this.state.changeCase(this);
    }

}
