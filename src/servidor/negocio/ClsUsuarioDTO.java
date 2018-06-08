package servidor.negocio;

public class ClsUsuarioDTO {
    private String nombres;
    private String apellidos;
    private String nickName;
    private String clave;

    public ClsUsuarioDTO() {
    }

    public ClsUsuarioDTO(String nombres, String apellidos, String nickName, String clave) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nickName = nickName;
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
