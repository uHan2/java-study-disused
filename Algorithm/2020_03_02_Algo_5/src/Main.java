import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        String remains = null;

        remains = word.replaceAll("c=","a")
                .replaceAll("c-","a")
                .replaceAll("dz=","a")
                .replaceAll("d-","a")
                .replaceAll("lj","a")
                .replaceAll("nj","a")
                .replaceAll("s=","a")
                .replaceAll("z=","a");

        int remainsCount = remains.length();

        System.out.print(remainsCount);
    }
}