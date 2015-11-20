import java.util.Random;

/**
 * Created by 47767573t on 20/11/15.
 */


public class ejercicio3 extends Thread{

    enum Estados { VERDE(0), AMBAR(0), ROJO(0);

        private int tiempo;

        private Estados (int tiempo){
            this.tiempo = tiempo;
        }

        public void setTiempo(int tiempo) {
            this.tiempo = tiempo;
        }

        public int getTiempo() {
            return tiempo;
        }

        public String toString(){
            return this.name()+" terminara en..."+(this.tiempo/1000)+"s";
        }
    }

    synchronized public static void main(String[] args)  {
        Random rnd = new Random();
        for (Estados estados : Estados.values()) {
            estados.setTiempo(rnd.nextInt(5000));
        }
        ejercicio3 semaforo = new ejercicio3();
        semaforo.start();
    }

    @Override
    public void run() {
        boolean enMarcha = true;
        while (enMarcha){
            for (Estados estado: Estados.values()) {
                System.out.println(estado.toString());
                try {
                    sleep(estado.getTiempo());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
