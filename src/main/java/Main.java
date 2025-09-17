import Models.*;

public class Main {
    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("Juan Pérez", "LIC123", 5);
        Empresa empresa = getEmpresa(conductor1);

        System.out.println("Viajes realizados:");
        for (Viaje viaje : empresa.getViajes()) {
            System.out.println("Origen: " + viaje.getOrigen() +
                    " - Destino: " + viaje.getDestino() +
                    " - Costo: $" + viaje.getCosto() +
                    " - Cliente: " + viaje.getCliente().getNombre() +
                    " - Vehículo: " + viaje.getVehiculo().getModelo());
        }
    }

    private static Empresa getEmpresa(Conductor conductor1) {
        Conductor conductor2 = new Conductor("María García", "LIC456", 3);

        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", 4, TipoVehiculo.AUTOMOVIL, conductor1);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Honda CRV", 5, TipoVehiculo.CAMIONETA, conductor2);

        Cliente cliente1 = new Cliente("Carlos López", "555-1234", "carlos@email.com");
        Cliente cliente2 = new Cliente("Ana Martínez", "555-5678", "ana@email.com");

        Empresa empresa = new Empresa();

        empresa.asignarViaje(cliente1, vehiculo1, "Ciudad A", "Ciudad B", 50.0f);
        empresa.asignarViaje(cliente2, vehiculo2, "Ciudad C", "Ciudad D", 75.5f);
        return empresa;
    }
}