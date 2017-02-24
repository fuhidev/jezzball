package topicsse.model;

import java.util.*;

/**
 * Moveable game objects have integer attributes heading and speed.  Telling a moveable object to move() causes the object to update its location based on its current heading and speed.  Heading is specified by a compass angle in degrees: 0 means heading north (upwards on the screen), 90 means heading east (rightward on the screen), etc
 */
public abstract class MoveableObject extends GameObject implements IMoveable {

    /**
     * Default constructor
     */
    public MoveableObject() {
    }

    /**
     * 
     */
    protected int heading;

    /**
     * 
     */
    protected int speed;

    /**
     * 
     */
    public void move() {
        // TODO implement here
    }

}