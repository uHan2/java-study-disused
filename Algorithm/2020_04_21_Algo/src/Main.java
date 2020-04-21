import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[][] fibo = new long[41][2];

        fibo[0][0] = 1;
        fibo[0][1] = 0;
        fibo[1][0] = 0;
        fibo[1][1] = 1;

        for (int i = 2; i < 41; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                fibo[i][j] = fibo[i - 1][j] + fibo[i - 2][j];
            }
        }

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++)
        {
            int num = Integer.parseInt(br.readLine());
            bw.write(fibo[num][0] + " " + fibo[num][1] + "\n");
        }

        bw.flush();
    }
}