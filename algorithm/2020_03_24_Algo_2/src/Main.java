import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc1 = Integer.parseInt(br.readLine());
        int[] nArr = new int[tc1];

        StringTokenizer str1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < nArr.length; i++)
        {
            nArr[i] = Integer.parseInt(str1.nextToken());
        }

        int tc2 = Integer.parseInt(br.readLine());
        int[] mArr = new int[tc2];

        StringTokenizer str2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < mArr.length; i++)
        {
            mArr[i] = Integer.parseInt(str2.nextToken());
        }

        Arrays.sort(nArr);

        for (int i = 0; i < mArr.length; i++)
        {
            int left = findLeftIndex(nArr, mArr[i], 0, nArr.length);
            int right = findRightIndex(nArr, mArr[i], 0, nArr.length);

            bw.write(right - left + " ");
        }

        bw.flush();

    }

    public static int findLeftIndex(int[] arr, int num, int left, int right)
    {
        int index = ((left + right) / 2);

        if (left >= right)
        {
            return index;
        }

        if (arr[index] >= num)
        {
            return findLeftIndex(arr, num, left, index);
        } else
        {
            return findLeftIndex(arr, num, index + 1, right);
        }
    }

    public static int findRightIndex(int[] arr, int num, int left, int right)
    {
        int index = ((left + right) / 2);

        if (left >= right)
        {
            return index;
        }

        if (arr[index] <= num)
        {
            return findRightIndex(arr, num, index + 1, right);
        } else
        {
            return findRightIndex(arr, num, left, index);
        }

    }
}