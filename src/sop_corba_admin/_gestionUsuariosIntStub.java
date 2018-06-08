package sop_corba_admin;


/**
* sop_corba_admin/_gestionUsuariosIntStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from admin.idl
* Tuesday, June 5, 2018 7:28:26 PM COT
*/

public class _gestionUsuariosIntStub extends org.omg.CORBA.portable.ObjectImpl implements sop_corba_admin.gestionUsuariosInt
{

  public boolean ingresoSistemaAdmin (String login, String clave)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ingresoSistemaAdmin", true);
                $out.write_string (login);
                $out.write_string (clave);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return ingresoSistemaAdmin (login, clave        );
            } finally {
                _releaseReply ($in);
            }
  } // ingresoSistemaAdmin

  public boolean registroUsuario (sop_corba_admin.gestionUsuariosIntPackage.Usuario usuario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registroUsuario", true);
                sop_corba_admin.gestionUsuariosIntPackage.UsuarioHelper.write ($out, usuario);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registroUsuario (usuario        );
            } finally {
                _releaseReply ($in);
            }
  } // registroUsuario

  public sop_corba_admin.gestionUsuariosIntPackage.Usuario[] listarUsuarios ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarUsuarios", true);
                $in = _invoke ($out);
                sop_corba_admin.gestionUsuariosIntPackage.Usuario $result[] = sop_corba_admin.gestionUsuariosIntPackage.ListaUsuariosHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarUsuarios (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarUsuarios

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba_admin/gestionUsuariosInt:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _gestionUsuariosIntStub
