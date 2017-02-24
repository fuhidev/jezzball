package topicsse.controller.command;


/**
 * 
 */
public class UpCommand implements ICommand {
	
	private static UpCommand command = new UpCommand();

    /**
     * Default constructor
     */
    public UpCommand() {
    }

    /**
     * 
     */
    public static UpCommand getInstance() {
        // TODO implement here
    	return command;
    }

}