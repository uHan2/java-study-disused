import java.util.PriorityQueue;

class Solution
{
    public int solution(int[] scoville, int K)
    {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++)
        {
            pq.add(scoville[i]);
        }

        while (K > pq.peek())
        {
            if (pq.size() == 1)
            {
                return -1;
            }
            int first = pq.poll();
            int second = pq.poll();

            int mix = first + (second * 2);
            answer++;

            pq.add(mix);

        }

        return answer;
    }
}