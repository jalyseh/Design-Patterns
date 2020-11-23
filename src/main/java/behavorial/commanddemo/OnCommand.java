package behavorial.commanddemo;

//concrete method - whats doing the callback
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}
