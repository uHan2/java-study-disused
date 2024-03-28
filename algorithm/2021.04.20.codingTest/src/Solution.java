//import java.util.Arrays;
//
//class Solution
//{
//    public int solution(int n)
//    {
//        int answer = 0;
//
//        int[] doorArr = new int[n];
//
//        Arrays.fill(doorArr, -1);
//
//        for (int i = 1; i <= n; i++)
//        {
//            int index = i - 1;
//            while (index < n)
//            {
//                doorArr[index] *= -1;
//                index += i;
//            }
//
//            System.out.println(Arrays.toString(doorArr));
//        }
//
//        return answer;
//    }
//}

class Solution
{
    public int solution(int n)
    {
        return (int) (Math.sqrt(n));
    }
}