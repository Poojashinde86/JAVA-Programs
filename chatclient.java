import java.io.*;
import java.net.*;


public class chatclient {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
     Socket cs=null;
     String message=null;
     cs= new Socket("127.0.0.1",8005);
     System.out.println("Client socket is created and waiting to server");
     DataOutputStream ostream=new DataOutputStream(cs.getOutputStream());
     DataInputStream istream=new DataInputStream(cs.getInputStream());
     while(true)
     {
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 //System.out.println("Client Says :");
    	 message=br.readLine();
    	 ostream.writeUTF(message);
    	 ostream.flush();
    	 if(message.equals("end"))
    	 {
    		 cs.close();
    		 ostream.close();
    		 istream.close();
    		 System.exit(0);
    	 }
    		 
    	message=istream.readUTF();
    	System.out.println("Server says : "+message);
    	 
     }
     
     
	}

}