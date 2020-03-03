import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int goJeongPay = Integer.parseInt(str.nextToken());
        int gaByeonPay = Integer.parseInt(str.nextToken());
        int price = Integer.parseInt(str.nextToken());

        if(price <= gaByeonPay)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print((goJeongPay / (price - gaByeonPay)) + 1);
        }
    }
}