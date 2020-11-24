package behavorial.youtubedemo;

public class TurnTVDown implements Command {

    ElectronicDevice theDevice;

    public TurnTVDown(ElectronicDevice newDevice) {

        this.theDevice = newDevice;
    }

    public void execute(){

        theDevice.volumeDown();
    }
//    public void undo(){
//
//        theDevice.volumeUp();
//    }
}
