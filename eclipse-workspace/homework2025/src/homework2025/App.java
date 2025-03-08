package homework2025;

public class App {

    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Testing AsteriskLogger
        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("This is an error");

        System.out.println();

        // Testing SpacedLogger
        System.out.println("Testing SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("This is an error");
    }
}
