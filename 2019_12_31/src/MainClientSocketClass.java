import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClientSocketClass
{
    public static void main(String[] args)
    {
        Socket socket = null;

        try
        {
            socket = new Socket("localhost", 9000); //127.0.0.1 : localhost
            System.out.println("Connect to Server");
            System.out.println("Socket : " + socket);

        } catch (UnknownHostException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (socket != null)
                {
                    socket.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
