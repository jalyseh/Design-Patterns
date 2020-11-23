package behavorial.commanddemo;

//invoker
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }
}
