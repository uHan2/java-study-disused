import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int col = Integer.parseInt(str.nextToken());
        int row = Integer.parseInt(str.nextToken());

        int count = (col - 7) * (row - 7);
        int[] countArr = new int[count];



        char[][] chessPan = new char[col][row];

        char[][] cutChessPan = new char[8][8];

        char[][] blackPan = new char[8][8];
        char[][] whitePan = new char[8][8];

        for(int ro = 0 ; ro < 8 ; ro++)
        {
            for(int co = 0 ; co < 4 ; co++)
            {
                if(ro % 2 == 0)
                {
                    blackPan[ro][(2 * co)] = 'B';
                    blackPan[ro][(2 * co) + 1] = 'W';
                    whitePan[ro][(2 * co)] = 'W';
                    whitePan[ro][(2 * co) + 1] = 'B';
                }
                else if(ro % 2 != 0)
                {
                    blackPan[ro][(2 * co) + 1] = 'B';
                    blackPan[ro][(2 * co)] = 'W';
                    whitePan[ro][(2 * co) + 1] = 'W';
                    whitePan[ro][(2 * co) ] = 'B';
                }
            }
        }

        for(int o = 0; o < col ; o++)
        {
            String kan = br.readLine();
            for(int p = 0; p < row ; p++)
            {
                chessPan[o][p] = kan.charAt(p);
            }
        }

        int index = 0;
        int x, y, i, j = 0;
        int paint1 = 0;
        int paint2 = 0;

        for(x = 0; x <= col - 8 ; x++)
        {
            for(y = 0; y <= row - 8 ; y++)
            {
                for(i = x ; i < 8 + x ; i ++)
                {
                    for(j = y ; j < 8 + y ; j++)
                    {
                        int k = i - x;
                        int e = j - y;

                        cutChessPan[k][e] = chessPan[i][j];
                    }
                }


                for(int k = 0; k < 8 ; k++)
                {
                    for(int s = 0; s < 8 ; s++)
                    {
                        if(cutChessPan[k][s] != blackPan[k][s])
                        {
                            paint1++;
                        }
                        if(cutChessPan[k][s] != whitePan[k][s])
                        {
                            paint2++;
                        }
                    }
                }

                if(paint1 < paint2)
                {
                    countArr[index] = paint1;
                }

                else if(paint2 < paint1)
                {
                    countArr[index] = paint2;
                }
                else if(paint1 == paint2)
                {
                    countArr[index] = paint1;
                }

                paint1 = 0;
                paint2 = 0;

                index++;
            }
        }

        Arrays.sort(countArr);

        System.out.print(countArr[0]);
    }
}