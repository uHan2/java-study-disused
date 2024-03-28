import java.util.ArrayList;
import java.util.List;

class Solution
{
    public int solution(int[] absolutes, boolean[] signs)
    {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++)
        {
            if (signs[i])
            {
                list.add(absolutes[i]);
            } else
            {
                list.add(absolutes[i] * -1);
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            answer += list.get(i);
        }

        return answer;
    }
}