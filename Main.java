public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();  // Obtain the Logger instance
        
        // Log some messages
        logger.log("Application started");
        logger.log("Performing some operation");
        logger.log("Operation completed");
        
        // ...
        
        logger.log("Application exiting");
    }
}
