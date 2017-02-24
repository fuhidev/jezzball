package topicsse.model;

import java.util.*;

/**
 * Cars are concrete steerable objects with unchangeable color.  Cars have integer attributes width and height.  There is a rule that says there can only be ONE such object in the game (we’ll see later how to enforce this rule in software).   Cars are constrained such that the only headings they are allowed to take are 0, 90, 180, or 270 (that is, north, east, south, or west).  The width and height of a car must be no greater than the size attribute of a FieldSquare (that is, cars must fit onto FieldSquares).  However, cars may move anywhere, including off the field entirely.
 */
public class Cars extends MoveableObject implements ISteerable {

    /**
     * Default constructor
     */
    public Cars() {
    }

    /**
     * 
     */
    private int width;

    /**
     * 
     */
    private int height;

    /**
     * 
     */
    public void changeHeading() {
        // TODO implement here
    }

}