import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        String[] minArr = new String[row];

        for(int i = 0; i < row; i++)
        {
            String s = br.readLine();
            String[] arr = s.split(" ");

            Arrays.sort(arr);

            minArr[i] = arr[0];
        }

        Arrays.sort(minArr);
        System.out.println(minArr[row-1]);
    }
}
