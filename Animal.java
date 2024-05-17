public class Animal{
    // Atributos
    private int identificador;
    private String nombre;
    private double peso;
    private TipoAnimal tipo;
    private Date fechaNacimiento;

    // Constructor
    public Animal(int identificador, String nombre, double peso, TipoAnimal tipo, Date fechaNacimiento) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos de acceso (getters)
    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Métodos de modificación (setters)
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para calcular la edad del animal en años
    public int calcularEdad() {
        Date fechaActual = new Date(2024, 4, 9); // Fecha actual para el ejemplo
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }
}
