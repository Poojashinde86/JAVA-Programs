Import java.lang.System;
 Import java.net.*;
 Import java.io.*;
 
 Public class Client
 {
 Static Socket connection;
 
 Public static void main(String a[]) throws SocketException
 {
 Try 
 {
 Int v[] = new int[9];
 //int g[] = new int[8];
 Int n = 0;
 InetAddress addr = InetAddress.getByName(“Localhost”);
 System.out.println(addr);
 Connection = new Socket(addr, 8011);
 DataOutputStream out = new DataOutputStream( Connection.getOutputStream());
 DataInputStream in = new DataInputStream(Connection.getInputStream());
 Int p = in.read();
 System.out.println(“No of frame is:” + p);
 
 For (int i = 0; i < p; i++) 
 {
 V[i] = in.read();
 System.out.println(v[i]);
 //g[i] = v[i];
 }
 V[5] = -1;
 For (int i = 0; i < p; i++)
 {
 System.out.println(“Received frame is: “ + v[i]);
 
 }
 For (int i = 0; i < p; i++)
 If (v[i] == -1) 
 {
 System.out.println(“Request to retransmit packet no “+ (i+1) + “ again!!”);
 N = i;
 Out.write(n);
 Out.flush();
 }
 
 System.out.println();
 
 V[n] = in.read();
 System.out.println(“Received frame is: “ + v[n]);
  System.out.println(“quiting”);
 } 
 catch (Exception e) 
 {
 System.out.println(e);
 }
 }
 }
