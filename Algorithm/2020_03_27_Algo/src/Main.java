import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        String[][] personArr = new String[tc][2];

        for (int i = 0; i < tc; i++)
        {
            StringTokenizer str = new StringTokenizer(br.readLine());
            personArr[i][0] = str.nextToken();
            personArr[i][1] = str.nextToken();
        }


        Comparator<String[]> customSort = new Comparator<String[]>()
        {
            public int compare(String[] person1, String[] person2)
            {
                return Integer.compare(Integer.parseInt(person1[0]), Integer.parseInt(person2[0]));
            }
        };

        Arrays.sort(personArr, customSort);

        for (int m = 0; m < tc; m++)
        {
            System.out.println(personArr[m][0] + " " + personArr[m][1]);
        }
    }
}