import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    private BufferedWriter bw;

    public static void main(String[] args) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            if(a != 0 && b != 0)
            {
                int sum = a + b;
                bw.write(sum + "\n");
            }else if (a == 0 && b == 0)
            {
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}
