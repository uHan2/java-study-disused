import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        for(char alpha = 'a' ; alpha <= 'z' ; alpha++)
        {
            System.out.print(word.indexOf(alpha) + " ");
        }
    }
}