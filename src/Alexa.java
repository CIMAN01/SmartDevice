/*

Class Alexa uses Composition to create "has-a" relationships between Alexa and LightSwitch/Door.

This class will, therefore, create two fields/attributes from those classes.

It also uses two methods which handle voice commands and invoke calls (passing on those commands as arguments) to the aforementioned classes' methods
to turn a light on/off and open/close a door.

*/


// class Alexa
public class Alexa {

    // fields/attributes
    private final LightSwitch light;
    private final Door door;

    // constructor
    public Alexa(LightSwitch light, Door door) {
        this.light = light;
        this.door = door;
    }

    /* getter and setter for Alexa class not used/needed */

    // a method that turn a light on or off based on voice commands
    public void useAlexaLightSwitch(String switchButton) {
        // if a "turn on" command is given
        if (switchButton.toLowerCase().equals("alexa, turn on the light")) {
            // use class LightSwitch method to turn on a light
            light.useLightSwitch(switchButton);
            // check the status of the light by invoking the class LightSwitch getter
            System.out.println("is light on? " + light.getLightOn());
        }
        // if a "turn off" command is given
        else if (switchButton.toLowerCase().equals("alexa, turn off the light")) {
            // use class LightSwitch method to turn off a light
            light.useLightSwitch(switchButton);
            // check the status of the light by invoking the class LightSwitch getter
            System.out.println("is light on? " + light.getLightOn());
        }
    }


    // a method that opens or closes a door based on voice commands
    public void useAlexaDoorHandle(String doorHandle) {
        // if an "open" command is given
        if (doorHandle.toLowerCase().equals("alexa, open the door")) {
            // use class Door method to open a door
            door.useDoorHandle(doorHandle);
            // check the status of the door by invoking the class Door getter
            System.out.println("is door open? " + door.getDoorOpen());
        }
        // if a "close" command is given
        else if (doorHandle.toLowerCase().equals("alexa, close the door")) {
            // use class Door method to close a door
            door.useDoorHandle(doorHandle);
           // check the status of the door by invoking the class Door getter
           System.out.println("is door open? " + door.getDoorOpen());
        }
    }

}
