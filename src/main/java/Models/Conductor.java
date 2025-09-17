package Models;

public class Conductor {
    private String nombre;
    private String licencia;
    private Integer anosExperiencia;

    public Conductor() {
    }

    public Conductor(String nombre, String licencia, Integer anosExperiencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Integer getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
