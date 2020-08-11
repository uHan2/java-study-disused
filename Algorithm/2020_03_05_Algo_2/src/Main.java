import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int tc = Integer.parseInt(br.readLine());
        int count = 0;

        int[][] apartmentRoom = new int[15][15];

        for(int i = 0 ; i < 15 ; i++)
        {
            for(int j = 0 ; j < 15 ; j++)
            {
                if(j == 0)
                {
                    apartmentRoom[i][j] = 1;
                }
            }
        }


        for(int i = 1 ; i < 15 ; i++)
        {
            apartmentRoom[14][i] += apartmentRoom[14][i-1] + 1 ;
        }

        for(int i = 13 ; i >= 0 ; i--)
        {
            int sum = 0;
            for(int j = 0 ; j < 15 ; j++)
            {
                sum += apartmentRoom[i+1][j];
                apartmentRoom[i][j] = sum;
            }
        }

        while(count < tc)
        {

            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());

            int index = 14 - floor;

            bw.write(apartmentRoom[index][ho-1] + "\n");
            count++;
        }

        bw.flush();
    }
}