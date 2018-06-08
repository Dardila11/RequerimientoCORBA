package sop_corba_admin;

import sop_corba_admin.gestionUsuariosIntPackage.Usuario;

public class gestionUsuariosImpl extends gestionUsuariosIntPOA {
    @Override
    public boolean ingresoSistemaAdmin(String login, String clave) {
        return false;
    }

    @Override
    public boolean registroUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public Usuario[] listarUsuarios() {
        return new Usuario[0];
    }
}
