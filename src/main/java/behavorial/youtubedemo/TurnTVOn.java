package behavorial.youtubedemo;

public class TurnTVOn implements Command{

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice newDevice) {

        this.theDevice = newDevice;
    }

    public void execute(){

        theDevice.on();
    }
}
