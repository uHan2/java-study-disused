import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = i + 1;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0 ; i < arr.length ; i++)
        {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
