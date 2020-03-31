import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++)
        {
            String ps = br.readLine();

            int point = 0;

            for (int j = 0; j < ps.length(); j++)
            {
                if (ps.charAt(j) == ('('))
                {
                    point++;
                } else if (ps.charAt(j) == (')'))
                {
                    point--;
                }

                if (point < 0)
                {
                    bw.write("NO");
                    bw.newLine();
                    break;
                }
            }

            if (point == 0)
            {
                bw.write("YES");
                bw.newLine();
            } else if (point > 0)
            {
                bw.write("NO");
                bw.newLine();
            }

        }

        bw.flush();
    }
}