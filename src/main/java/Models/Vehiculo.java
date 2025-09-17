package Models;
import Models.TipoVehiculo;
import Models.Conductor;

public class Vehiculo {
    private String placa;
    private String modelo;
    private Integer capacidadPasajeros;
    private TipoVehiculo tipoVehiculo;
    private Conductor conductor;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, Integer capacidadPasajeros, TipoVehiculo tipoVehiculo, Conductor conductor) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.tipoVehiculo = tipoVehiculo;
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
