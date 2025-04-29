package ModeloVO;
import java.util.Date;

public class ClienteVO {
    
    private String nombre;
    private String cedula;
    private String celular;
    private String fecha;
    private String fechafin;
    private String id;
    
    public ClienteVO() {
    }

    public ClienteVO(String nombre, String cedula, String celular, String fecha, String fechafin, String id) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
        this.fecha = fecha;
        this.fechafin = fechafin;
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }
    
    
  }
