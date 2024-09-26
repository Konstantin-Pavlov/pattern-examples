package org.example.patterns.strategy;


import org.example.patterns.state.developer.Activity;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }
     public void executeActivity(){
        activity.justDolt();
     }
}
