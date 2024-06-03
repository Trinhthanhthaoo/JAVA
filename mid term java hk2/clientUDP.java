

import java.io.*;
import java.net.*;

public class clientUDP {
    public static void main(String[] args) throws Exception {
        // Create client socket
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("localhost");

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Enter message for server : ");
            String sentence = inFromUser.readLine();
            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];
            sendData = sentence.getBytes();
            
            // Create and send packet to server
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);

            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String modifiedSentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("FROM SERVER: " + modifiedSentence);
        }

        clientSocket.close();
    }
}
