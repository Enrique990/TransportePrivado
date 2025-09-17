package Models;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Conductor> conductores;
    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    private List<Viaje> viajes;

    public Empresa() {
        this.conductores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }

    public void registrarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void asignarViaje(Cliente cliente, Vehiculo vehiculo, String origen, String destino, float costo) {
        if (!vehiculos.contains(vehiculo)) {
            throw new IllegalArgumentException("El vehículo no está registrado en la empresa.");
        }

        if (!clientes.contains(cliente)) {
            throw new IllegalArgumentException("El cliente no está registrado.");
        }

        Viaje nuevoViaje = new Viaje(origen, destino, cliente, vehiculo, costo);
        viajes.add(nuevoViaje);
    }

    public List<Viaje> getViajes() {
        return new ArrayList<>(viajes);
    }

    public List<Conductor> getConductores() {
        return new ArrayList<>(conductores);
    }

    public List<Vehiculo> getVehiculos() {
        return new ArrayList<>(vehiculos);
    }

    public List<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }
}
