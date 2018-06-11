package servidor.acceso.db;

import servidor.negocio.ClsAdministradorDTO;
import servidor.negocio.ClsUsuarioDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClsUsuarioDAO {

    private ConnDB connDB;
    private ArrayList<String> usuariosSuscritos;

    public ClsUsuarioDAO(){
        this.connDB = new ConnDB();
        this.usuariosSuscritos = new ArrayList<>();
    }

    public boolean ingresoAlSistema(String nickName, String clave){

        ArrayList<ClsUsuarioDTO> usuarios = new ArrayList();
        connDB.conectar();
        boolean existe = false;

        try {
            PreparedStatement sentencia = null;
            String consulta = "select * from Usuario";
            sentencia = connDB.getConnection().prepareStatement(consulta);
            ResultSet res = sentencia.executeQuery();
            while (res.next()){
                ClsUsuarioDTO usuarioDTO = new ClsUsuarioDTO();
                usuarioDTO.setNickName(res.getString("userNickname"));
                usuarioDTO.setClave(res.getString("userClave"));
                usuarios.add(usuarioDTO);
            }
            sentencia.close();
            connDB.desconectar();

            for (ClsUsuarioDTO usuario : usuarios) {
                if (usuario.getNickName().equalsIgnoreCase(nickName) &&
                        usuario.getClave().equalsIgnoreCase(clave)) {
                    existe = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existe;
    }

    public boolean suscribirUsuario(String nickName){
        boolean suscrito = false;
        if(!usuariosSuscritos.contains(nickName)){
            usuariosSuscritos.add(nickName);
            suscrito = true;
        }
        return suscrito;
    }




}
