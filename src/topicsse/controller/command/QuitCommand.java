package topicsse.controller.command;


/**
 * 
 */
public class QuitCommand implements ICommand {

	private static QuitCommand command = new QuitCommand();
	
    /**
     * Default constructor
     */
    public QuitCommand() {
    }

    /**
     * 
     */
    public static QuitCommand getInstance() {
        // TODO implement here
    	return command;
    }

}