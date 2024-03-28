import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char[] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();

        Arrays.sort(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= '9') sum += (arr[i] - '0');
            else list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.print(sum);
    }
}
