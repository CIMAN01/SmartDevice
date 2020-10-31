/*

Class LightSwitch has only one field (boolean) to represent whether a light is on or off.

It uses a method to turn on or turn off a light.

*/

// class LightSwitch
public class LightSwitch {

    // field/attribute
    private Boolean isLightOn;

    // constructor
    public LightSwitch(Boolean status) {
        isLightOn = status;
    }

    /* getters and setters */

    public Boolean getLightOn() {
        return isLightOn;
    }

    public void setLightOn(Boolean status) {
        isLightOn = status;
    }

    // a method that turns a light on or off based on a given command
    public void useLightSwitch (String switchButton) {
        // if the voice command given says to turn a light
        if (switchButton.toLowerCase().equals("alexa, turn on the light")) {
            // set boolean condition to true
            setLightOn(true);
            // print a message informing user light has been turned on
            System.out.println("light is now turned on");
        }
        // if the voice command given is to turn off a light
        else if (switchButton.toLowerCase().equals("alexa, turn off the light")) {
            // set boolean condition to false
            setLightOn(false);
            // print a message informing user light has been turned off
            System.out.println("light is now turned off");
        }
    }

}
