/**
 * Created by 47767573t on 20/11/15.
 */

enum Tools{
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

public class ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Las herramientas son: ");
        for (Tools herramientas : Tools.values()) {
            System.out.println(herramientas.name() + ": " + herramientas.ordinal());
        }
    }
}
