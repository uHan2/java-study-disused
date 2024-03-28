import java.util.LinkedList;
import java.util.Queue;

class Solution
{
    public int solution(int bridge_length, int weight, int[] truck_weights)
    {
        int answer = 0;
        int curBridgeWeight = 0;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++)
        {
            while (true)
            {
                if(q.isEmpty())
                {
                    q.add(truck_weights[i]);
                    curBridgeWeight += truck_weights[i];
                    answer++;
                    break;
                } else if(q.size() == bridge_length)
                {
                    curBridgeWeight -= q.poll();
                } else
                {
                    if(curBridgeWeight + truck_weights[i] > weight)
                    {
                        q.add(0);
                        answer++;
                    }
                    else
                    {
                        q.add(truck_weights[i]);
                        answer++;
                        curBridgeWeight += truck_weights[i];
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}