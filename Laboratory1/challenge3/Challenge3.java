package challenge3;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Repeats a message three times and then reverses the final result.
 */
public class Challenge3 {

    /**
     * Repeats the message three times (using StringBuilder and stream())
     * and then reverses the final result (using StringBuffer).
     *
     * @param message
     * @return
     */
    public static String mysteriousEcho(String message) {

        StringBuilder builder = new StringBuilder();

        Stream.of(message, message, message)
                .forEach(m -> builder.append(m).append(" "));

        String repeated = builder.toString().trim();

        StringBuffer buffer = new StringBuffer(repeated);

        return buffer.reverse().toString();
    }

    /**
     * Main function.
     *
     * @param args
     */
    public static void main(String[] args) {

        Function<String, String> echo = Challenge3::mysteriousEcho;

        String result = echo.apply("Hola");

        System.out.println("Resultado: " + result);
    }
}