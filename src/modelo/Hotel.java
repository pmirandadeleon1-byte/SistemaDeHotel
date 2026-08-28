package modelo;

public class Hotel {
    //atributos
    private String nombre;
    private int estrellas;

    //relacion con habitacion
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;

    //constructor
    public Hotel(String nombre, int estrellas) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        habitaciones = new Habitacion[20];
        cantidadHabitaciones = 0;
    }
 
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    //agregar una habitacion al hotel
    public void agregarHabitacion(Habitacion habitacion) {
        if (cantidadHabitaciones < habitaciones.length) {
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
        } else {
            System.out.println("No se pueden agregar mas habitaciones");
        }
    }

    //mostrar datos del hotel
    public void mostrarInformacion() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Numero de estrellas: " + estrellas);
        System.out.println("Habitaciones registradas: " + cantidadHabitaciones);
    }
}
