
import java.net.*;
import java.util.Random;

public class serverUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9876);

        while (true) {
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);

            String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("RECEIVED: " + sentence);

            InetAddress clientIPAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            Random rand = new Random();
            int randomNumber = rand.nextInt(100); // Random number between 0 and 99
            String response = "Random number: " + randomNumber;

            // Send response to client
            sendData = response.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIPAddress, clientPort);
            serverSocket.send(sendPacket);
        }
    }
}
