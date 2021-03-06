package sop_corba_audio;


/**
* sop_corba_audio/servidorAudioPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from audio.idl
* Sunday, June 10, 2018 11:24:40 AM COT
*/

public abstract class servidorAudioPOA extends org.omg.PortableServer.Servant
 implements sop_corba_audio.servidorAudioOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("enviarAudio", new java.lang.Integer (0));
    _methods.put ("ingresoSistemaUsuario", new java.lang.Integer (1));
    _methods.put ("registrarUsuario", new java.lang.Integer (2));
    _methods.put ("suscribirUsuario", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba_audio/servidorAudio/enviarAudio
       {
         byte audioStream[] = sop_corba_audio.servidorAudioPackage.audioHelper.read (in);
         this.enviarAudio (audioStream);
         out = $rh.createReply();
         break;
       }

       case 1:  // sop_corba_audio/servidorAudio/ingresoSistemaUsuario
       {
         String nickName = in.read_string ();
         String clave = in.read_string ();
         boolean $result = false;
         $result = this.ingresoSistemaUsuario (nickName, clave);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // sop_corba_audio/servidorAudio/registrarUsuario
       {
         sop_corba_audio.callbackInt callback = sop_corba_audio.callbackIntHelper.read (in);
         boolean $result = false;
         $result = this.registrarUsuario (callback);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // sop_corba_audio/servidorAudio/suscribirUsuario
       {
         String nickName = in.read_string ();
         boolean $result = false;
         $result = this.suscribirUsuario (nickName);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba_audio/servidorAudio:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public servidorAudio _this() 
  {
    return servidorAudioHelper.narrow(
    super._this_object());
  }

  public servidorAudio _this(org.omg.CORBA.ORB orb) 
  {
    return servidorAudioHelper.narrow(
    super._this_object(orb));
  }


} // class servidorAudioPOA
