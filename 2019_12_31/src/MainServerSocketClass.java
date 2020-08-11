import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerSocketClass
{
    public static void main(String[] args)
    {
        ServerSocket serverSocket = null;

        Socket socket = null;

        try
        {
            serverSocket = new ServerSocket(9000);
            System.out.println("Ready for Client");

            socket = serverSocket.accept();
            System.out.println("Connect");
            System.out.println("socket : " + socket);
        } catch (IOException e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(socket != null)
                {
                    socket.close();
                }
                if(serverSocket != null)
                {
                    serverSocket.close();
                }

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
