package org.example.patterns.state.developer;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }
     public void changeActivity(){
        if(activity instanceof Sleeping){
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        }else
         setActivity(new Sleeping());
     }

     public void justDolt(){
        activity.justDolt();
     }
}
