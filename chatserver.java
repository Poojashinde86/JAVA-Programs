import java.io.*;
import java.net.*;


public class chatserver {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
    ServerSocket ss=null;
    Socket socket=null;
    String message=null;
     ss= new ServerSocket(8005);
     System.out.println("Server socket is created and waiting to client");
     socket=ss.accept();
     DataOutputStream ostream=new DataOutputStream(socket.getOutputStream());
     DataInputStream istream=new DataInputStream(socket.getInputStream());
     while(true)
     {
    	 
    	
    	 message=istream.readUTF();
    	 System.out.println("Client Says :"+message);
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("Server says : "+message);
    	 message=br.readLine();
    	 
    	 if(message.equals("end"))
    	 {
    		 socket.close();
    		 ostream.close();
    		 istream.close();
    		 System.exit(0);
    	 }
    		 
    	   ostream.writeUTF(message);
    	 
     }
     
     
	}

}