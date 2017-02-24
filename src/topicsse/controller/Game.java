package topicsse.controller;

/**
 * 
 */
public class Game {

	/**
	 * Default constructor
	 */
	public Game() {
	}

	/**
     * 
     */
	private IGameWorld gw;

	/**
     * 
     */
	public void play() {

	}

	/**
     * 
     */
	protected void getCommand(char c) {

		switch (c) {
		case 'n':
			gw.changeHeading(0);
			break;
		case 'e':
			gw.changeHeading(90);
			break;
		case 's':
			gw.changeHeading(180);
			break;
		case 'w':
			gw.changeHeading(270);
			break;
		case 'i':
			gw.increaseSpeed();
			break;
		case 'l':
			gw.decreaseSpeed();
			break;
		case 'b':
			gw.addMonsterBall();
			break;
		case 'k':
			gw.addTimeTicket();
			break;
		case 'g':
			gw.surroundedGroupSquares();
			break;
		case '1':
			gw.collidedMonsterball();
			break;
		case '2':
			gw.drivenOverNewSquare();
			break;
		case '3':
			gw.drivenOverTimeTicket();
			break;
		case 't':
			gw.ticked();
			break;
		case 'd':
			gw.display();
			break;
		case 'm':
			gw.outputMap();
			break;
		case 'q':
			gw.exit();
			break;
		default:
			System.out.println("You have picked an option that does not exist"); // In
																					// case
																					// an
																					// option
																					// that
																					// has
																					// not
																					// been
																					// coded
																					// is
																					// used

		}
	}

}