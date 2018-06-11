package sop_corba_audio;

import servidor.acceso.db.ClsUsuarioDAO;

public class servidorAudioImpl extends servidorAudioPOA {

    ClsUsuarioDAO usuarioDAO = new ClsUsuarioDAO();


    @Override
    public void enviarAudio(byte[] audioStream) {
        // TODO 1: Implementarl logica enviarAudio
    }

    @Override
    public boolean ingresoSistemaUsuario(String nickName, String clave) {
        return usuarioDAO.ingresoAlSistema(nickName,clave);
    }

    @Override
    public boolean registrarUsuario(callbackInt callback) {
        return false;
    }
    @Override
    public boolean suscribirUsuario(String nickName) {
        return usuarioDAO.suscribirUsuario(nickName);
    }
}
