package ec.edu.espol.singleton;

public class Chef {
    private static Chef Chefprincipal;
    private String nombre;
    private int experiencia;
    
    private Chef(){
        nombre = "Gordon Ramsey";
        experiencia = 25;

    }

    public static Chef getInstance() {
        if ( Chefprincipal == null) {
            Chefprincipal = new Chef();
        }
        return Chefprincipal;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    public void cocinar(){
        System.out.println("El Chef" + " "+nombre + " está cocinando un platillo especial.");
    }

    public int calificarIngredientes(String ingredientes) {
        System.out.println("El Chef está evaluando los ingredientes: " + ingredientes);
        int calificacion = (int) (Math.random() * 10 + 1); // Genera una calificación aleatoria del 1 al 10
        return calificacion;
    }

    @Override
    public String toString() {
        return "chef" + " "+ nombre + " " + "con " + experiencia + " años de experiencia";
    }


}
