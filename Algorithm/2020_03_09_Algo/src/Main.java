import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.print(factorial(num));
    }

    public static int factorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        else if(num == 1)
        {
            return num;
        }
        else
        {
            return factorial(num - 1) * num;
        }
    }
}