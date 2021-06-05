public class Main
{
    public static void main(String[] args) throws Exception
    {
        Solution solution = new Solution();
        int[] food_times = {3, 1, 2};
        long k = 5;
        System.out.println(solution.solution(food_times, k));

    }

    static class Solution
    {
        public int solution(int[] food_times, long k)
        {
            int index = 0;
            long sec = 0;

            for (int i = 0; i < k; i++)
            {
                food_times[index]--;
                sec++;
                index++;

                if (index >= food_times.length) index = 0;

                if (food_times[index] == 0)
                {
                    while (food_times[index] == 0)
                    {
                        index++;
                        if (index >= food_times.length) index = 0;
                    }
                }

                if (sec == k)
                {
                    if (food_times[index] == 0)
                    {
                        while (food_times[index] == 0)
                        {
                            index++;
                            if (index >= food_times.length) index = 0;
                        }
                        return index + 1;
                    } else
                    {
                        return index + 1;
                    }
                }
            }
            return -1;
        }
    }
}
