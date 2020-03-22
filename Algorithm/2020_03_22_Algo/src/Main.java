import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        List<String> wordArr = new ArrayList<>();

        for(int i = 0 ; i < tc ; i++)
        {
            String tmp = br.readLine();

            if(!wordArr.contains(tmp))
            {
                wordArr.add(tmp);
            }
        }

        Comparator<String> lengthSort = new Comparator<String>()
        {
            public int compare(String s1, String s2)
            {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Collections.sort(wordArr);
        Collections.sort(wordArr,lengthSort);

        for(int i = 0; i < wordArr.size() ; i++)
        {
            System.out.println(wordArr.get(i));
        }
    }
}