import java.util.ArrayList;
import java.util.List;

public class Granja
{
    private List<Animal> animales;

    public Granja() {
        this.animales = new ArrayList<>();
    }

    // Método para registrar un nuevo animal en la granja
    public void registrarAnimal(int identificador, String nombre, double peso, TipoAnimal tipo, Date fechaNacimiento) {
        Animal nuevoAnimal = new Animal(identificador, nombre, peso, tipo, fechaNacimiento);
        animales.add(nuevoAnimal);
        System.out.println("Animal registrado con éxito en la granja.");
    }

    // Método para obtener la lista de animales en la granja
    public List<Animal> getAnimales() {
        return animales;
    }
    
    // Método para mostrar la cantidad de animales por tipo en la granja
    public void mostrarCantidadAnimalesPorTipo() {
        int cantidadGallinas = 0;
        int cantidadVacas = 0;
        int cantidadCerdos = 0;

        for (Animal animal : animales) {
            switch (animal.getTipo()) {
                case GALLINA:
                    cantidadGallinas++;
                    break;
                case VACA:
                    cantidadVacas++;
                    break;
                case CERDO:
                    cantidadCerdos++;
                    break;
            }
        }

        System.out.println("Cantidad de animales por tipo en la granja:");
        System.out.println("Gallinas: " + cantidadGallinas);
        System.out.println("Vacas: " + cantidadVacas);
        System.out.println("Cerdos: " + cantidadCerdos);
    }
}
