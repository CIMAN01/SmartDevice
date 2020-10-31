/*

LivingRoomLight class uses both Inheritance (extends the LightSwitch class) and Polymorphism (overrides the method in the LightSwitch class)
and there's creates an "is-a" relationship with class Lightswitch.

This class has only one field to represent the light percentage (brightness) and Overrides the method from the LightSwitch class to turn on the light

When it turns the light on, it will to automatically set the brightness to 100%.

Also, another method is created to adjust the brightness of this light.

In the main method (in the Main class) and an instance of the LivingRoomLight will be created, and the Overridden method will
turn a light on or off, as well as adjust the dimness.

*/

// class LivingRoomLight
public class LivingRoomLight extends LightSwitch {

    // field/attribute
    private int brightness;

    // constructor
    public LivingRoomLight(Boolean isLightOn, int brightness) {
        super(isLightOn);
        this.brightness = brightness;
    }

    /* getters and setters */

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    /* a method that overrides the method useLightSwitch in the LightSwitch class */
    @Override
    public void useLightSwitch(String switchButton) {
        // invoke method in the parent or super class passing in an argument
        super.useLightSwitch(switchButton);
        // get boolean condition or status of the light from the super class and store in a separate variable
        boolean status = super.getLightOn();
        // if the boolean status is true (i.e. the light has been turned on)
        if (status) {
            // automatically set the brightness to 100% when light is switched on
            adjustBrightness(100);
        }
    }

    //  a method that adjusts the brightness/dimness of a light and prints it to the console
    public void adjustBrightness(int brightness) {
        // a call to setter
        setBrightness(brightness);
        // display brightness level to user
        System.out.println("brightness level is set to " + getBrightness() + "%");
    }

}
