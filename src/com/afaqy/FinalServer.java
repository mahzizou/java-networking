package com.afaqy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FinalServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();

            byte[] bytes= new byte[1024*16];
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            File file = new File("/home/afq-eg-lptp-122/Downloads/file-recremix.mp3");
            OutputStream outputStream = new FileOutputStream(file);
            int count;
            while ((count = inputStream.read(bytes)) > 0)
            {
                outputStream.write(bytes, 0, count);
            }
            socket.close();
            serverSocket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
