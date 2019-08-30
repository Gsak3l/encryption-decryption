import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        String arrEnglishLetters[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "d", "y", "z"} ;
        int counter = 0 ;
        System.out.print("String total = {");
        for (int i = 0 ; i < 26 ; i ++)
        {
            for (int j = 0 ; j < 26 ; j ++)
            {
                for (int k = 0 ; k < 26 ; k ++)
                {
                    counter ++ ;
                    System.out.print('"' + arrEnglishLetters[i] + arrEnglishLetters[j] + arrEnglishLetters[k] + '"' + ", ");
                }
            }
        }
    }
}
