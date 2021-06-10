package com.afaqy;

import java.io.*;
import java.net.Socket;

public class FinalClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            FileInputStream fileInputStream = new FileInputStream("/home/afq-eg-lptp-122/Downloads/3andko shamboo remix.mp3");
            BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream);

//            int fileSize = (int) file.length();
            File file = new File("/home/afq-eg-lptp-122/Downloads/3andko shamboo remix.mp3");
            byte[] fileBytes = new byte[(int) file.length()];
            bufferedInputStream.read(fileBytes,0, fileBytes.length);
            outputStream.write(fileBytes,0, fileBytes.length);



//            SoftAudioPusher softAudioPusher = new SoftAudioPusher()
//            AudioStream audioStream = new AudioDataStream();
//            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("/home/afq-eg-lptp-122/Downloads/3andko shamboo remix.mp3"));
//            AudioStream audioStream = new AudioDataStream(stream);


//            stream.getFrameLength();
//            stream.getFormat();

//            int fileSize = (int) file.length();
//            byte[] fileBytes = new byte[(int) file.length()];
//            dataOutputStream.write(fileBytes,0, fileBytes.length);

//            dataOutputStream.write();


//            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//            String str = "", str2 = "";
//            while(!str.equals("stop")) {
//                str = bufferedReader.readLine();
//
//                dataOutputStream.writeUTF(str);
//
//                dataOutputStream.flush();
//                str2 = dataInputStream.readUTF();
//
//                System.out.println("Server says: " + str2);
//            }
//            dataInputStream.close();

        //    FileOutputStream fos = new FileOutputStream(new File("/home/afq-eg-lptp-122/Downloads/3andko shamboo remix.mp3"));


            outputStream.flush();
            outputStream.close();
//            dataOutputStream.flush();
//            dataOutputStream.close();

            socket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
