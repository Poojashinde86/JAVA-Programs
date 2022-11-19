 Import java.io.DataInputStream;
 Import java.io.DataOutputStream;
 Import java.io.IOException;
 Import java.net.ServerSocket;
 Import java.net.Socket;
 Import java.net.SocketException;
 
 Public class Server {
 Static ServerSocket Serversocket;
 Static DataInputStream dis;
 Static DataOutputStream dos;
 
 Public static void main(String[] args) throws SocketException {
 
 Try {
 Int a[] = { 30, 40, 50, 60, 70, 80, 90, 100, 110 };
 Serversocket = new ServerSocket(8011);
 System.out.println(“waiting for connection”);
 Socket client = Serversocket.accept();
 Dis = new DataInputStream(client.getInputStream());
 Dos = new DataOutputStream(client.getOutputStream());
 System.out.println(“The number of packets sent is:” + a.length);
 Int y = a.length;
 Dos.write(y);
 Dos.flush();
  For (int i = 0; i < a.length; i++) 
 {
 Dos.write(a[i]);
 Dos.flush();
 }
 Int k = dis.read();
 Dos.write(a[k]);
 Dos.flush();
 } 
 catch (IOException e) 
 {
 System.out.println(e);
 } 
 finally 
 {
 Try 
 {
 Dis.close();
 Dos.close();
 } catch (IOException e) 
 {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 
 }
 }
 }
