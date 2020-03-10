import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];


        ArrayList<Integer> num = new ArrayList<>();


        for(int i = 0 ; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(str.nextToken());
        }



        for(int i = 0; i < arr.length ; i++)
        {
            int add = 0;

            for(int j = i + 1; j < arr.length ; j++)
            {
                for(int k = j + 1; k < arr.length ; k++)
                {

                    add = arr[i] + arr[j] + arr[k];


                    if(add <= M)
                    {
                        num.add(add);
                    }
                }
            }

        }

        Collections.sort(num);


        System.out.print(num.get(num.size()-1));


    }
}