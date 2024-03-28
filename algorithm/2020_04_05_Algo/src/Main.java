import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    static List<Integer> fibo = new ArrayList<>();
    static int index = 2;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int peopleNum = Integer.parseInt(br.readLine());

        fibo.add(0);
        fibo.add(1);
        fibo(peopleNum);
        fibo.remove(fibo.size() - 1);

        System.out.print(calChicken(peopleNum));

    }

    public static void fibo(int peopleNum)
    {

        while (fibo.get(index - 1) < peopleNum)
        {
            fibo.add(fibo.get(index - 1) + fibo.get(index - 2));
            index++;
        }
    }

    public static int calChicken(int peopleNum)
    {
        int count = 1;
        int sum = 0;

        while (peopleNum != 0)
        {
            if (peopleNum >= fibo.get(fibo.size() - count))
            {
                peopleNum -= fibo.get(fibo.size() - count);

                sum += fibo.get((fibo.size() - count - 1));

                count++;
            } else
            {
                count++;
            }
        }
        return sum;
    }
}