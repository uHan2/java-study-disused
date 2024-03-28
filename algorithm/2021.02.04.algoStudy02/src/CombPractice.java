import java.util.*;

public class CombPractice
{
    private int n;
    private int r;
    private int[] now; // 현재 조합
    private ArrayList<ArrayList<Integer>> result; // 모든 조합

    public ArrayList<ArrayList<Integer>> getResult()
    {
        return result;
    }

    public CombPractice(int n, int r)
    {
        this.n = n;
        this.r = r;
        this.now = new int[r];
        this.result = new ArrayList<ArrayList<Integer>>();
    }

    public void combination(int[] arr, int depth, int index, int target)
    {
        if (depth == r)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < now.length; i++)
            {
                temp.add(arr[now[i]]);
            }
            result.add(temp);
            return;
        }
        if (target == n) return;
        now[index] = target;
        combination(arr, depth + 1, index + 1, target + 1);
        combination(arr, depth, index, target + 1);
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 7, 9};
        int r = 3;
        CombPractice comb = new CombPractice(arr.length, r);
        comb.combination(arr, 0, 0, 0);
        ArrayList<ArrayList<Integer>> result = comb.getResult();
        System.out.println("모든 조합의 수: " + result.size());
        for (int i = 0; i < result.size(); i++)
        {
            for (int j = 0; j < result.get(i).size(); j++)
            {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}