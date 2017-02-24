package topicsse.controller;

import java.util.*;

/**
 * 
 */
public interface IGameWorld {

	/**
     * 
     */
	public void getClock();

	/**
     * 
     */
	public void getScore();

	/**
     * 
     */
	public void getSound();

	/*
	 * the car has changed heading
	 */
	public void changeHeading(int heading);

	/*
	 * increase the car’s speed by one unit.
	 */
	public void increaseSpeed();

	/*
	 * lower the car’s speed by one unit as long as doing so doesn’t reduce
	 * speed below zero.
	 */
	public void decreaseSpeed();

	/*
	 * add a new Monster ball to the world at a random location and with random
	 * color, heading and speed (the speed should be constrained to be a small
	 * number).
	 */
	public void addMonsterBall();

	/*
	 * add a new Time Ticket to the game world at a random location and with a
	 * time value corresponding to the current level as defined above.
	 */
	public void addTimeTicket();

	/*
	 * add a new Time Ticket to the game world at a random location and with a
	 * time value corresponding to the current level as defined above.
	 */
	public void surroundedGroupSquares();

	/*
	 * Colliding with a monster ball has the effect of costing the player one
	 * life and repositioning the car back at the initial starting location. It
	 * also causes the monster ball’s color to change.
	 */
	public void collidedMonsterball();

	/*
	 * tell the game world that the car has driven over a new square and now
	 * owns another square (in other words, increase the number of owned squares
	 * by one). Later we will have to keep track of precisely which squares are
	 * owned; for now we won’t worry about that. As with the ‘g’ command, if the
	 * new total of owned squares produces a score equal to or higher than the
	 * minimum score defined for the level, the player advances to the next
	 * level, which in turn causes the world to be reinitialized as described
	 * under “Game Play”.
	 */
	public void drivenOverNewSquare();

	/*
	 * tell the game world that the car has driven over (collided with) a Time
	 * Ticket. The effect of this is to increase the countdown clock by the
	 * amount of time contained in the Time Ticket and to remove the Time Ticket
	 * from the world.
	 */
	public void drivenOverTimeTicket();

	/*
	 * The effect of this is to increase the countdown clock by the amount of
	 * time contained in the Time Ticket and to remove the Time Ticket from the
	 * world.
	 */
	public void ticked();

	/*
	 * generate a display by outputting lines of text on the console describing
	 * the current game state values. The display should include (1) the current
	 * level, (2) the number of lives left in the level, (3) the current
	 * countdown clock value (remaining time), (4) the current score (the
	 * percent of squares owned), and (5) the minimum required score for the
	 * level. All output should be appropriately labeled in easily readable
	 * format.
	 */
	public void display();

	/*
	 * output a “map” showing the current world
	 */
	public void outputMap();

	/*
	 * Your program should confirm the user’s intent to quit before actually
	 * exiting. Additional
	 */
	public void exit();

}