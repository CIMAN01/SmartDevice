/*

@Author CIMAN01 - October 2020

A revised mini project based on a previous project I did during my time at Skillspire.

This program implements a smart home device (i.e alexa device).

This smart device can communicate with a user in order to turn a light on or off and/or open or close a door via voice commands.

A total of five classes are used, each dealing with one aspect of the overall functionality.

Both Composition, Inheritance, and Polymorphism are used to achieve this.

In the Main class objects are created representing each class and appropriate methods are invoked on these objects in order
to perform desired tasks.

This program can easily be further modified using the scanner class and additional conditional statements in order to be more interactive
(taking commands from a user via the console).

*/


// class Main
public class Main {

    // main method
    public static void main(String[] args) { // run main program

        // create a lightSwitch object
        LightSwitch lightSwitch = new LightSwitch(false); // set condition to false

        // create a door object
        Door door = new Door(false); // set condition to false

        // create an Alexa object
        Alexa alexa = new Alexa(lightSwitch, door); // pass in door and lightSwitch objects to Alexa constructor

        // turn light on and open door
        alexa.useAlexaLightSwitch("Alexa, turn on the light"); // access light switch via Alexa
        alexa.useAlexaDoorHandle("Alexa, open the door"); // access door handle via Alexa

        // turn light off and close door
        alexa.useAlexaLightSwitch("Alexa, turn off the light"); // access light switch via Alexa
        alexa.useAlexaDoorHandle("Alexa, close the door"); // access door handle via Alexa

        // create new LivingRoomLight object and set default brightness to 0%
        LivingRoomLight room = new LivingRoomLight(false, 0);

        // throw light switch to on position
        room.useLightSwitch("Alexa, turn on the light"); // access light switch via room

        // dim brightness to 50%
        room.adjustBrightness(50); // access brightness via room

        // throw light switch to off position
        room.useLightSwitch("Alexa, turn off the light"); // access light switch via room

    }

}

