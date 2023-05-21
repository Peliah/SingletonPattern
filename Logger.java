public class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent direct instantiation
    }

    // Static method to get the Logger instance
    public static Logger getInstance() {
        if (instance == null) {  // If no instance exists
            synchronized (Logger.class) {  // Make sure only one thread can create the instance at a time
                if (instance == null) {  // Double-check if instance is still null
                    instance = new Logger();  // Create a new Logger instance
                }
            }
        }
        return instance;  // Return the Logger instance
    }

    // Method to print log messages
    public void log(String message) {
        System.out.println("Logging: " + message);
    }
}
