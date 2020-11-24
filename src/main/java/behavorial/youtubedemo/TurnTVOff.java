package behavorial.youtubedemo;

public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice) {

        this.theDevice = newDevice;
    }

    public void execute(){

        theDevice.off();
    }
}
