import java.util.ArrayList;
import java.util.List;

class Solution
{
    public int[] solution(int n)
    {
        int[] answer = {};
        int[][] arr = new int[n][n];
        List<Integer> list = new ArrayList<>();
        int max = (n * (n + 1)) / 2;
        int count = 1;

        int i = 0, j = 0;
        while (count <= max)
        {
            while (i < n && arr[i][j] == 0)        // 밑으로
            {
                arr[i][j] = count;
                count++;
                i++;
            }

            i--;
            j++;

            while (j < n && arr[i][j] == 0)        // 오른쪽으로
            {
                arr[i][j] = count;
                count++;
                j++;
            }

            j--;
            i--;
            j--;

            while (i > 0 && j > 0 && arr[i][j] == 0)        // 대각선 위로
            {
                arr[i][j] = count;
                count++;
                i--;
                j--;
            }

            i++;
            j++;
            i++;
        }

        for (int k = 0; k < arr.length; k++)
        {
            for (int l = 0; l < arr[k].length; l++)
            {
                if (arr[k][l] != 0) list.add(arr[k][l]);
            }
        }

        answer = list.stream().mapToInt(m -> m).toArray();

        return answer;
    }
}