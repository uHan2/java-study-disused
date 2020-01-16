import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];

        for (int i = 0; i < a; i++)
        {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        for (int i = 0; i < a; i++)
        {
            if (arr[i] < b)
            {
                bw.write(arr[i] + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
