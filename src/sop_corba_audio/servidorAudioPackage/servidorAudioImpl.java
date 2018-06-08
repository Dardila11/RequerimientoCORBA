package sop_corba_audio.servidorAudioPackage;

import sop_corba_audio.callbackInt;
import sop_corba_audio.servidorAudioPOA;

public class servidorAudioImpl extends servidorAudioPOA {
    // TODO 1: Mover codigo a su correspondiente DAO
    @Override
    public void enviarAudio(byte[] audioStream) {

    }

    @Override
    public boolean ingresoSistemaUsuario(String nickName, String clave) {
        return false;
    }

    @Override
    public boolean registrarUsuario(callbackInt callback) {
        return false;
    }
}
