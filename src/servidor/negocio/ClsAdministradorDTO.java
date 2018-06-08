package servidor.negocio;

public class ClsAdministradorDTO {

    private String login;
    private String clave;


    public ClsAdministradorDTO() {
    }

    public ClsAdministradorDTO(String login, String clave) {
        this.login = login;
        this.clave = clave;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
