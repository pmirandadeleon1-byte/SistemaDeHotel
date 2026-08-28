package app;

import modelo.*;

public class Principal {

    public static void main(String[] args) {
        //crear hotel
        Hotel hotel1 = new Hotel("Hotel Vista Hermosa", 4);

        //crear habitaciones
        Habitacion habitacion1 = new Habitacion(101, 300, "habitacion101.jpg");
        Habitacion habitacion2 = new Habitacion(102, 400, "habitacion102.jpg");

        hotel1.agregarHabitacion(habitacion1);
        hotel1.agregarHabitacion(habitacion2);

        //crear cliente
        Cliente cliente1 = new Cliente("Juan Perez", "Quetzaltenango", "55555555");

        //crear reservacion
        Reservacion reservacion1 = new Reservacion("28/08/2026", 3, cliente1, habitacion2);

        System.out.println("INFORMACION DEL HOTEL");
        hotel1.mostrarInformacion();

        System.out.println("\nINFORMACION DE LA RESERVACION");

        reservacion1.mostrarInformacion();
    }
}
