import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(str.nextToken());
        int y = Integer.parseInt(str.nextToken());
        int w = Integer.parseInt(str.nextToken());
        int h = Integer.parseInt(str.nextToken());

        int[] caseArr = {w-x, h-y, x, y};

        Arrays.sort(caseArr);

        bw.write(caseArr[0] + "");

        bw.flush();

    }
}