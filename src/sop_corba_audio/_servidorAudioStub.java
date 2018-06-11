package sop_corba_audio;


/**
* sop_corba_audio/_servidorAudioStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from audio.idl
* Sunday, June 10, 2018 11:24:40 AM COT
*/

public class _servidorAudioStub extends org.omg.CORBA.portable.ObjectImpl implements sop_corba_audio.servidorAudio
{

  public void enviarAudio (byte[] audioStream)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("enviarAudio", true);
                sop_corba_audio.servidorAudioPackage.audioHelper.write ($out, audioStream);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                enviarAudio (audioStream        );
            } finally {
                _releaseReply ($in);
            }
  } // enviarAudio

  public boolean ingresoSistemaUsuario (String nickName, String clave)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("ingresoSistemaUsuario", true);
                $out.write_string (nickName);
                $out.write_string (clave);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return ingresoSistemaUsuario (nickName, clave        );
            } finally {
                _releaseReply ($in);
            }
  } // ingresoSistemaUsuario

  public boolean registrarUsuario (sop_corba_audio.callbackInt callback)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarUsuario", true);
                sop_corba_audio.callbackIntHelper.write ($out, callback);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarUsuario (callback        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarUsuario

  public boolean suscribirUsuario (String nickName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("suscribirUsuario", true);
                $out.write_string (nickName);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return suscribirUsuario (nickName        );
            } finally {
                _releaseReply ($in);
            }
  } // suscribirUsuario

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba_audio/servidorAudio:1.0"};

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
} // class _servidorAudioStub
