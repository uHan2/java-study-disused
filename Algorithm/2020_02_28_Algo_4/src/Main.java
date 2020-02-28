import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        String num = br.readLine();

        for(int i = 0 ; i < count ; i++)
        {


            sum += (int)num.charAt(i) - 48;
        }

        System.out.print(sum);
    }
}