public class Logger {
    
    private static Logger instance = null;
    
    
    private StringBuilder logMessages;

    
    private Logger() {
        logMessages = new StringBuilder(); 
    }

    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); 
        }
        return instance; 
    }

    
    public void log(String message) {
        logMessages.append(message).append("\n"); 
    }

    
    public String getLog() {
        return logMessages.toString(); 
    }

    
    public void clearLog() {
        logMessages.setLength(0); 
    }

    
    
    public String toString() {
        return "Logger: \n" + getLog();
    }

    
    public static void main(String[] args) {
        
        Logger logger = Logger.getInstance();

        
        logger.log("Application started");
        logger.log("User logged in");
        logger.log("Error: Invalid user input");

        
        System.out.println("Log messages:");
        System.out.println(logger.getLog());

       
        logger.clearLog();
        System.out.println("Log after clearing:");
        System.out.println(logger.getLog());
    }
}