import java.io.*;
import java.util.*;

public class Main
{
    static char[][] starArr;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        starArr = new char[num][num];

        for(int i = 0 ; i < num ; i++)
        {
            Arrays.fill(starArr[i], ' ');
        }

        makeStar(0, 0, num);

        for(int i = 0; i < num ; i++)
        {
            System.out.println(starArr[i]);
        }
    }

    public static void makeStar(int X, int Y, int num)
    {
        int split = 0;

        if(num == 1)
        {
            starArr[X][Y] = '*';
            return;
        }

        split = num / 3;

        for(int i = 0 ; i < 3; i ++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                if(i == 1 && j == 1)
                {
                    continue;
                }
                makeStar(X + (split * i), Y + (split * j), split);
            }
        }
    }


}