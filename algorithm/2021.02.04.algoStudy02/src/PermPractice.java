import java.util.ArrayList;

public class PermPractice
{
    /**
     * 순열 예제
     */
    private int n;
    private int r;
    private int[] now;
    private ArrayList<ArrayList<Integer>> result;

    static int[] arr = {1, 3, 5, 7, 9};

    public PermPractice(int n, int r)
    {
        this.n = n;
        this.r = r;
        this.now = new int[r];
        this.result = new ArrayList<ArrayList<Integer>>();
    }

    public ArrayList<ArrayList<Integer>> getResult()
    {
        return result;
    }

    public void swap(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void permutaion(int depth)
    {
        if (depth == r)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < now.length; i++)
            {
                temp.add(now[i]);
            }

            result.add(temp);
            return;
        }

        for (int i = depth; i < n; i++)
        {
            swap(depth, i);
            now[depth] = arr[depth];
            permutaion(depth + 1);
            swap(depth, i);
        }


    }

    public static void main(String[] args)
    {
        int r = 3;
        PermPractice p = new PermPractice(arr.length, r);
        p.permutaion(0);
        ArrayList<ArrayList<Integer>> result = p.getResult();
        System.out.println("모든 순열의 수: " + result.size());

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