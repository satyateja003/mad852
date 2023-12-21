import java.io.*;
import java.net.*;
 
public class MyClient2
{
 public static void main(String[] args)
 {
  try
  { 
   Socket s = new Socket("localhost", 1003);
   DataOutputStream dout = new DataOutputStream(s.getOutputStream());
   dout.writeUTF("Hey Server ! How are you ?  ?");
   
   DataInputStream dis = new DataInputstream(s.getInputStream());
   String str = (String)dis.readUTF();
   System.out.println("Servers says : " +str);
  }
  catch(Exception e)
  {
   System.out.print(e);
  } 
 }
}