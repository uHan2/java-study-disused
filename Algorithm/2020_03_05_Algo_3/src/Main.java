import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int burgerOne = Integer.parseInt(br.readLine());
        int burgerTwo = Integer.parseInt(br.readLine());
        int burgerThree = Integer.parseInt(br.readLine());
        int coke = Integer.parseInt(br.readLine());
        int cider = Integer.parseInt(br.readLine());

        int[] sumArr = {burgerOne + coke, burgerOne + cider, burgerTwo + coke, burgerTwo + cider,
                burgerThree + coke, burgerThree + cider};

        Arrays.sort(sumArr);

        System.out.print(sumArr[0] - 50);
    }
}