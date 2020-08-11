import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Integer> selfarr = new ArrayList<Integer>();
        ArrayList<Integer> selfarr2 = new ArrayList<Integer>();
        ArrayList<Integer> checkarr = new ArrayList<Integer>();
        ArrayList<Integer> checkarr_copy = new ArrayList<Integer>();

        int count = 1;

        for(int i = 0; i < 10000 ; i++)
        {

            selfarr.add(selfValid(count));

            count++;
        }

        for(int i = 1; i <= 10000 ; i++)
        {
            checkarr.add(i);
        }

        checkarr_copy.addAll(checkarr);

        for(int i = 0 ; i < 10000 ; i++)
        {
            for(int j = 0 ; j < 10000 ; j++)
            {
                if(checkarr.get(j).equals(selfarr.get(i)))
                {
                    checkarr_copy.remove((checkarr.get(j)));
                }

            }
        }


        for(int i = 0; i < checkarr_copy.size() ; i++)
        {
            System.out.println(checkarr_copy.get(i));
        }


    }


    public static int selfValid(int num)
    {
        if(num >= 1 && num <= 9)
        {
            num = num + (num % 10);
        }

        else if(num >= 10 && num <= 99)
        {
            num = num + (num / 10) + (num % 10);
        }

        else if(num >= 100 && num <= 999)
        {
            num = num + (num / 100) + (num % 10) + ((num % 100) / 10);
        }

        else if(num >= 1000 && num <= 9999)
        {
            num = num + (num / 1000) + (num % 10) + ((num % 100) / 10) + ((num%1000) / 100);
        }

        return num;
    }
}

