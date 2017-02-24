package topicsse.controller.command;


/**
 * 
 */
public class RightCommand implements ICommand {

	private static RightCommand command = new RightCommand();
	
    /**
     * Default constructor
     */
    public RightCommand() {
    }

    /**
     * 
     */
    public static RightCommand getInstance() {
        // TODO implement here
    	return command;
    }

}