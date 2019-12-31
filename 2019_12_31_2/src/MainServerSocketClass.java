import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MainServerSocketClass
{
    public static void main(String[] args)
    {
        ServerSocket serverSocket = null;
        Socket socket = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;


        Scanner input = null;

        try
        {
            serverSocket = new ServerSocket(9000);
            System.out.println("Ready to connect Client");

            socket = serverSocket.accept();

            System.out.println("connect to Client");
            System.out.println("socket : " + socket);

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            while (true)
            {
                String ClientMessage = dataInputStream.readUTF();
                System.out.println("Client Message : " + ClientMessage);

                dataOutputStream.writeUTF("Message Complete");
                dataOutputStream.flush();

                if (ClientMessage.equals("STOP"))
                {
                    break;
                }
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
                if (dataInputStream != null) dataInputStream.close();
                if (dataOutputStream != null) dataOutputStream.close();

                if (socket != null) socket.close();

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
