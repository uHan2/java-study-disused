import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        int[][] pointArr = new int[tc][2];

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            pointArr[i][0] = Integer.parseInt(str.nextToken());
            pointArr[i][1] = Integer.parseInt(str.nextToken());
        }

        Comparator<int[]> customSort = new Comparator<int[]>()
        {
            public int compare(int[] point1, int[] point2)
            {
                if (point1[0] == point2[0])
                {
                    return Integer.compare(point1[1], point2[1]);
                } else
                {
                    return Integer.compare(point1[0], point2[0]);
                }
            }
        };

        Arrays.sort(pointArr, customSort);

        for (int i = 0; i < tc; i++)
        {
            System.out.println(pointArr[i][0] + " " + pointArr[i][1]);
        }


    }
}