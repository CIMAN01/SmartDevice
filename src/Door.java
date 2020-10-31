/*

Class Door has only one field to represent whether a door is open or closed.

It uses a method to open or close a door.

*/

// class Door
public class Door {

    // field/attribute
    private Boolean isDoorOpen;

    // constructor
    public Door(Boolean status) {
        isDoorOpen = status;
    }

    /* getter and setter */

    public Boolean getDoorOpen() {
        return isDoorOpen;
    }

    public void setDoorOpen(Boolean status) {
        isDoorOpen = status;
    }

    // a method that opens or closes a door based on a given command
    public void useDoorHandle (String doorHandle) {
        // if the voice command given says to open a door
        if (doorHandle.toLowerCase().equals("alexa, open the door")) {
            // set boolean condition to true
            setDoorOpen(true);
            // print a message informing the user that a door has been opened
            System.out.println("door is now opened");
        }
        // // if the voice command given says to close a door
        else if (doorHandle.toLowerCase().equals("alexa, close the door")) {
            // set boolean condition to false
            setDoorOpen(false);
            // print a message informing the user that a door has been closed
            System.out.println("door is now closed");
        }
    }

}
