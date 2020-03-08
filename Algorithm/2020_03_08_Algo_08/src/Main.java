import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];

        while(true)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());

            for(int i = 0; i < 3 ; i++)
            {
                arr[i] = Integer.parseInt(str.nextToken());
            }

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
            {
                break;
            }
            else
            {
                Arrays.sort(arr);

                if((int)Math.pow(arr[2], 2) == (int)Math.pow(arr[0],2) + (int)Math.pow(arr[1],2))
                {
                    bw.write("right" + "\n");
                }
                else
                {
                    bw.write("wrong" + "\n");
                }
            }

        }

        bw.flush();

    }
}