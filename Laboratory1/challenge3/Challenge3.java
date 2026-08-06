package challenge3;

/**
 * recibe el mensaje y lo repite tres veces y separa cada repetición
 */
public class Challenge3 {

    /**
     * Repite un mensaje tres veces separado por espacios.
     *
     * @param message 
     * @return 
     */
    public static String mysteriousEcho(String message) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            builder.append(message);

            if (i < 2) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    /**
     *Funcion principal
     * @param args
     */
    public static void main(String[] args) {

        String result = mysteriousEcho("Hola");

        System.out.println("Resultado: " + result);
    }
}
