import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    static int n = 0;
    static int m = 0;
    static int[] numArr = null;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());

        numArr = new int[m];

        recursive(0);

        bw.flush();

    }

    public static void recursive(int count) throws IOException
    {
        if (count == m)
        {
            for (int i = 0; i < m; i++)
            {
                bw.write(numArr[i] + " ");
            }
            bw.newLine();

            return;
        }

        for (int i = 1; i <= n; i++)
        {
            if (count > 0 && numArr[count - 1] > i)
            {
                continue;
            }
            numArr[count] = i;
            recursive(count + 1);

        }

    }
}