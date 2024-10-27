package ec.edu.espol.singleton;

public class AyudanteDeCocina {

    private String nombre;

    public AyudanteDeCocina(String nombre) {
        this.nombre = nombre;
    }

    public void presentarIngredientes(String ingredientes, Chef chef) {
        System.out.println(nombre + " presenta los ingredientes: " + ingredientes);
        int valor = chef.calificarIngredientes(ingredientes);
        System.out.println("El " + chef + " evaluo los ingredientes con" + " "+ valor);
    }

}
