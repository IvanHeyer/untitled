public class Main {

    public static void main(String[] args) {
        //if
        int numeroIF = 30;

        if (numeroIF > 0) {
            System.out.println("Su numeroIF es: " +numeroIF+ " es positivo");
        } else if (numeroIF < 0) {
            System.out.println("Su numeroif es: " +numeroIF+ " es negativo");
        } else {
            System.out.println("Su numeroIf es: " +numeroIF+ " es 0");
        }

        //while
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("Su numeroWhile es: " +numeroWhile);
            numeroWhile++;
        }

        // dowhile
        int numeroDoWhile = 4;

        do {
            System.out.println("Su numeroDoWhile es: " +numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        //for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //switch
        var estacion = "PRIMAVERA";

        switch (estacion) {
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
            case "VERNANO":
                System.out.println("es verano");
            default:
                System.out.println("Esta estacion no existe ");
        }

    }
}