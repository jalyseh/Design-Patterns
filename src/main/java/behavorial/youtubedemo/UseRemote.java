package behavorial.youtubedemo;

import java.util.ArrayList;
import java.util.List;

public class UseRemote {

    public static void main(String[] args) {

        //CONTAINS METHODS WE WANT TO EXECUTE
        ElectronicDevice newDevice = TvRemote.getDevice();

        //SPECIFIC COMMAND
        TurnTVOn onCommand = new TurnTVOn(newDevice);

        //RECEIVER - preforms certain actions when it is called
        DeviceButton onPressed = new DeviceButton(onCommand);

        //CALLING RECEIVER
        onPressed.press();

        //--------------------------

        TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        //--------------------------

        TurnTVUp volumeUpCommand = new TurnTVUp(newDevice);
        onPressed = new DeviceButton(volumeUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //-------------------------

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();



    }
}
