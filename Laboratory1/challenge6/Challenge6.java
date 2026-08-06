package challenge6;

/**
 * se hacen los comandos de la maquina 
 */
public class Challenge6 {

    /**
     * @param command
     * @return 
     */
    public static String machineResponse(String command) {

        switch (command) {
            case "GREET":
                return "¡Saludos, viajero del tiempo y del código!";

            case "FAREWELL":
                return "Que los bits te acompañen hasta la próxima misión.";

            case "SING":
                return "01010101";

            case "DANCE":
                return "Girando en modo fiesta.";

            default:
                return "Comando desconocido.";
        }
    }

    /**
     * Clase principal
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(machineResponse("GREET"));
        System.out.println(machineResponse("FAREWELL"));
        System.out.println(machineResponse("SING"));
        System.out.println(machineResponse("DANCE"));
    }
}