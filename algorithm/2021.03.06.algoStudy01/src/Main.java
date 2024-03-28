import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        int start = 1;
        int end = arr.get(n - 1) - arr.get(0);
        int result = 0;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            int value = arr.get(0);
            int count = 1;

            for (int i = 1; i < n; i++)
            {
                if (arr.get(i) >= value + mid)
                {
                    value = arr.get(i);
                    count ++;
                }
            }

            if (count >= c)
            {
                start = mid + 1;
                result = mid;
            } else
            {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}
