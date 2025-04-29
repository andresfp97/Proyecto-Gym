
package ModeloVO;


public class LoginVO {
    private String id;
    private String usuario;
    private String contra;
    private String tipo;

    public LoginVO() {
    }

    public LoginVO(String id, String usuario, String contra, String tipo) {
        this.id = id;
        this.usuario = usuario;
        this.contra = contra;
        this.tipo = tipo;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
