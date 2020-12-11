package basepatterns.behavioral.strategy;

public class Developer {
    Activity activity;
    void setActivity(Activity activity){
        this.activity = activity;
    }
    public void executeActivity(){
        activity.justDoIt();
    }
}
