package behavorial.youtubedemo;

public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice) {

        this.theDevice = newDevice;
    }

    public void execute(){

        theDevice.volumeUp();
    }
}

