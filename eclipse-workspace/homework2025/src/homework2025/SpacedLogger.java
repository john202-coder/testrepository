package homework2025;

public class SpacedLogger implements Logger {

    @Override
    public void log(String message) {
        String spacedMessage = String.join(" ", message.split(""));
        System.out.println(spacedMessage);
    }

    @Override
    public void error(String message) {
        String spacedMessage = String.join(" ", message.split(""));
        System.out.println("ERROR: " + spacedMessage);
    }
}
