package sop_corba_admin.gestionUsuariosIntPackage;


/**
* sop_corba_admin/gestionUsuariosIntPackage/AdminHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from admin.idl
* Tuesday, June 5, 2018 7:28:26 PM COT
*/

abstract public class AdminHelper
{
  private static String  _id = "IDL:sop_corba_admin/gestionUsuariosInt/Admin:1.0";

  public static void insert (org.omg.CORBA.Any a, sop_corba_admin.gestionUsuariosIntPackage.Admin that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sop_corba_admin.gestionUsuariosIntPackage.Admin extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "login",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "clave",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (sop_corba_admin.gestionUsuariosIntPackage.AdminHelper.id (), "Admin", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sop_corba_admin.gestionUsuariosIntPackage.Admin read (org.omg.CORBA.portable.InputStream istream)
  {
    sop_corba_admin.gestionUsuariosIntPackage.Admin value = new sop_corba_admin.gestionUsuariosIntPackage.Admin ();
    value.login = istream.read_string ();
    value.clave = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sop_corba_admin.gestionUsuariosIntPackage.Admin value)
  {
    ostream.write_string (value.login);
    ostream.write_string (value.clave);
  }

}
