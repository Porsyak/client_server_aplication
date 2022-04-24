package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try(Socket clientSocket = new Socket("127.0.0.1", 8080);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
            out.println("Hello World");
            String string = in.readLine();
            System.out.println(string);
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
