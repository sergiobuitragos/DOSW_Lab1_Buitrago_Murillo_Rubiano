package challenge3;

/**
 * Receives the message and reverses it using StringBuffer.
 */
public class Challenge3 {

    /**
     * Reverses a message using StringBuffer.
     *
     * @param message
     * @return
     */
    public static String mysteriousEcho(String message) {

        StringBuffer buffer = new StringBuffer(message);

        return buffer.reverse().toString();
    }

    /**
     * Main function.
     *
     * @param args
     */
    public static void main(String[] args) {

        String result = mysteriousEcho("Hola");

        System.out.println("Resultado: " + result);
    }
}
