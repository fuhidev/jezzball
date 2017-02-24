package topicsse.controller.command;


/**
 * 
 */
public class DownCommand implements ICommand {

	
	private static DownCommand command = new DownCommand();
    /**
     * Default constructor
     */
    public DownCommand() {
    }

    /**
     * @return 
     * 
     */
    public static DownCommand getInstance() {
        // TODO implement here
    	return command;
    }

}