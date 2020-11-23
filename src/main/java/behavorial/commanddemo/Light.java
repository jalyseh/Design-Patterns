package behavorial.commanddemo;

//receiver
public class Light {

    private boolean isOn = false;

    public boolean isOn(){
        return isOn;
    }

    //this gives the application some state
    public void toggle(){
        if(isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    //this does not
    public void on(){
        System.out.println("Light switched on");
    }

    public void off(){
        System.out.println("Light switched off");
    }
}
