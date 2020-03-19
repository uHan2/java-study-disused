import java.io.*;
import java.util.*;

public class Main
{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n ;
    static int m ;


    static int[] arr;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());

        arr = new int[m];

        check(0);

        bw.flush();

    }

    public static void check(int count) throws IOException
    {

        if(count == m)
        {
            for(int i = 0; i < m ; i++)
            {
                bw.write(arr[i] + " ");
            }
            bw.newLine();

            return;
        }

        for(int i = 1 ; i <= n ; i++)
        {
            arr[count] = i;
            check(count+1);
        }

    }
}