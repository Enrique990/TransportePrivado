package Models;
import Models.Cliente;
import Models.Vehiculo;

public class Viaje {
    public String origen;
    public String destino;
    private Cliente cliente;
    public Vehiculo vehiculo;
    public float costo;

    public Viaje(String origen, String destino, Cliente cliente, Vehiculo vehiculo, float costo) {
        this.origen = origen;
        this.destino = destino;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.costo = costo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
