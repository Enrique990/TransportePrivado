package Models;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Viaje> viajes;

    public Empresa() {
        this.viajes = new ArrayList<>();
    }

    public void asignarViaje(Cliente cliente, Vehiculo vehiculo, String origen, String destino, float costo) {
        Viaje nuevoViaje = new Viaje(origen, destino, cliente, vehiculo, costo);
        viajes.add(nuevoViaje);
    }

    public List<Viaje> getViajes() {
        return new ArrayList<>(viajes);
    }
}
