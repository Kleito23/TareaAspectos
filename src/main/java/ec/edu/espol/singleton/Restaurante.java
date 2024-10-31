package ec.edu.espol.singleton;

public class Restaurante {

public static void main(String[] args) {
Chef chef = Chef.getInstance();
Chef chef2 = Chef.getInstance();
chef.cocinar();

AyudanteDeCocina ayudante = new AyudanteDeCocina("Pepe");

ayudante.presentarIngredientes("Tomates, albahaca, aceite de oliva", chef2);
ayudante.presentarIngredientes("Tomates, queso", chef);

chef2.setNombre("Juanito");

ayudante.presentarIngredientes("Tomates, albahaca, aceite de oliva", chef2);
ayudante.presentarIngredientes("Tomates, queso", chef);

System.out.println("¿Chef es el mismo que chef2? " + (chef == chef2));
}
}