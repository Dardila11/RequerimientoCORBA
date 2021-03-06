package servidor.acceso.db;

import servidor.negocio.ClsAdministradorDTO;
import servidor.negocio.ClsUsuarioDTO;
import sop_corba_admin.gestionUsuariosIntPackage.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClsAdministradorDAO {

    private ConnDB connDB;

    public ClsAdministradorDAO() {
        this.connDB = new ConnDB();
    }

    public boolean ingresoAlSistema(String login, String clave){

        ArrayList<ClsAdministradorDTO> administradores = new ArrayList();
        connDB.conectar();
        boolean existe = false;

        try {
            PreparedStatement sentencia = null;
            String consulta = "select * from Administrador";
            sentencia = connDB.getConnection().prepareStatement(consulta);
            ResultSet res = sentencia.executeQuery();
            while (res.next()){
                ClsAdministradorDTO administradorDTO = new ClsAdministradorDTO();
                administradorDTO.setLogin(res.getString("AdminLogin"));
                administradorDTO.setClave(res.getString("AdminClave"));
                administradores.add(administradorDTO);
            }
            sentencia.close();
            connDB.desconectar();

            for (ClsAdministradorDTO administradore : administradores) {
                if (administradore.getLogin().equalsIgnoreCase(login) &&
                        administradore.getClave().equalsIgnoreCase(clave)) {
                    existe = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existe;
    }

    public boolean registrarUsuario(Usuario usuario){

        connDB.conectar();
        int conectado = -1;

        try {
            PreparedStatement sentencia = null;
            String consulta = "insert into Usuario(usuario.nombres,usuario.apellidos," +
                    "usuario.nickName,usuario.clave) values(?,?,?,?)";
            sentencia = connDB.getConnection().prepareStatement(consulta);
            sentencia.setString(1, usuario.nombres);
            sentencia.setString(2, usuario.apellidos);
            sentencia.setString(3, usuario.nickName);
            sentencia.setString(4, usuario.clave);
            conectado = sentencia.executeUpdate();
            sentencia.close();
            connDB.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conectado == 1;
    }

    public ArrayList listarUsuarios(){
        ArrayList<ClsUsuarioDTO> usuarios = new ArrayList();
        connDB.conectar();

        try {
            PreparedStatement sentencia = null;
            String consulta = "select * from Usuario";
            sentencia = connDB.getConnection().prepareStatement(consulta);
            ResultSet res = sentencia.executeQuery();
            while (res.next()){
                ClsUsuarioDTO usuarioDTO = new ClsUsuarioDTO();
                usuarioDTO.setNombres(res.getString("userNombres"));
                usuarioDTO.setApellidos(res.getString("userApellidos"));
                usuarioDTO.setNickName(res.getString("userNickname"));
                usuarioDTO.setClave(res.getString("userClave"));
                usuarios.add(usuarioDTO);
            }
            sentencia.close();
            connDB.desconectar();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  usuarios;
    }
}
