package modelo;

public class Cliente {
    //atributos
    private String nombre;
    private String direccion;
    private String telefono;

    //constructor
    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //mostrar datos del cliente
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }
}
