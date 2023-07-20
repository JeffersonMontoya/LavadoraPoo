
public class Lavadora {
    
    
    //Metodo para lavar la ropa y definir los kilos
    public static void lavarRopa(int peso) { 
        if (peso <= 16 && peso > 12) {
            System.out.println("Llenando de agua...");
            esperarYMostrarTiempo(12);
            System.out.println("Lavando...");
            esperarYMostrarTiempo(12);
            System.out.println("Enjuagando...");
            esperarYMostrarTiempo(12);
            System.out.println("Exprimiendo...");
            esperarYMostrarTiempo(12);
        } else if (peso <= 12 && peso > 8) {
            System.out.println("Llenando de agua...");
            esperarYMostrarTiempo(8);
            System.out.println("Lavando...");
            esperarYMostrarTiempo(8);
            System.out.println("Enjuagando...");
            esperarYMostrarTiempo(8);
            System.out.println("Exprimiendo...");
            esperarYMostrarTiempo(8);
        } else if (peso <= 8) {
            System.out.println("Llenando de agua...");
            esperarYMostrarTiempo(6);
            System.out.println("Lavando...");
            esperarYMostrarTiempo(6);
            System.out.println("Enjuagando...");
            esperarYMostrarTiempo(6);
            System.out.println("Exprimiendo...");
            esperarYMostrarTiempo(6);
        } else {
            System.out.println("El peso de la carga es demasiado alto para el lavarropas.");
        }
    }

    //Metodo para monstrar el tiempo de lavado
    public static void esperarYMostrarTiempo(int segundos) {
        for (int i = segundos; i > 0; i--) {
            System.out.println("Tiempo restante: " + i + " segundos.");
          
        }
        System.out.println("-----------------------");
        System.out.println("¡Listo, ciclo cumplido");
        System.out.println("------------------------");
        System.out.println("");
    }

    public static void esperarUnSegundo() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
