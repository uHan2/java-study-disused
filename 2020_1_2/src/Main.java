public class Main
{
    public static void main(String[] args)
    {
        char[] cArr = new char[26];
        char a = 'A';

        for (int i = 0; i < cArr.length; i++, a++)
        {

            cArr[i] = a ;

            System.out.println(cArr[i]);
        }
    }
}
