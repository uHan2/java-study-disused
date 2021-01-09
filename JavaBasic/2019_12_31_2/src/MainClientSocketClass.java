import java.awt.image.DataBufferInt;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainClientSocketClass
{
    public static void main(String[] args)
    {
        Socket socket = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;


        Scanner input = null;

        try
        {
            socket = new Socket("localhost", 9000);
            System.out.println("Connect to Server");

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            input = new Scanner(System.in);

            while (true)
            {
                System.out.println("Enter Message : ");
                String outMessage = input.nextLine();
                dataOutputStream.writeUTF(outMessage);
                dataOutputStream.flush();

                String inMessage = dataInputStream.readUTF();
                System.out.println("inMessage : " + inMessage);

                if (outMessage.equals("STOP"))
                {
                    break;
                }
            }

        } catch (UnknownHostException e)
        {
            e.printStackTrace();
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
