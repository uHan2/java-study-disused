import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution
{
    public int solution(int[] priorities, int location)
    {
        int answer = 0;
        int count = 0;

        if (priorities.length == 1)
        {
            return 1;
        }

        List<Integer> priorityList = new ArrayList<>();
        List<Integer> locationList = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++)
        {
            priorityList.add(priorities[i]);
            locationList.add(i);
        }

        while (true)
        {
            if (priorityList.size() == 1)
            {
                return count + 1;
            }

            int pri = priorityList.get(0);
            int loc = locationList.get(0);

            priorityList.remove(0);
            locationList.remove(0);

            if (Collections.max(priorityList) > pri)
            {
                priorityList.add(pri);
                locationList.add(loc);
            } else
            {
                count++;

                if (location == loc)
                {
                    answer = count;
                    break;
                }
            }
        }


        return answer;

    }
}