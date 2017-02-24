package topicsse.controller.command;


/**
 * 
 */
public class LeftCommand implements ICommand {

	private static LeftCommand command = new LeftCommand();
	
	/**
     * Default constructor
     */
    public LeftCommand() {
    }

    /**
     * 
     */
    public static LeftCommand getInstance() {
        // TODO implement here
    	return command;
    }

}