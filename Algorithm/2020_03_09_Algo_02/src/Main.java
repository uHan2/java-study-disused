import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(fibo(num));
    }

    public static int fibo(int num)
    {
        if(num <= 1)
        {
            return num;
        }
        else
        {
            return fibo(num - 1) + fibo(num-2);
        }
    }
}