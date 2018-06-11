package sop_corba_admin;

import servidor.acceso.db.ClsAdministradorDAO;
import sop_corba_admin.gestionUsuariosIntPackage.Usuario;

public class gestionUsuariosImpl extends gestionUsuariosIntPOA {

    private ClsAdministradorDAO administradorDAO = new ClsAdministradorDAO();
    @Override
    public boolean ingresoSistemaAdmin(String login, String clave) {
        return administradorDAO.ingresoAlSistema(login,clave);
    }

    @Override
    public boolean registroUsuario(Usuario usuario) {
        return administradorDAO.registrarUsuario(usuario);
    }

    @Override
    public Usuario[] listarUsuarios() {
        // TODO 1: Implementar listarUsuarios
        return new Usuario[0];
    }
}
