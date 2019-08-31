import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        //System In
        Scanner x = new Scanner(System.in) ;
        System.out.println("type your text below: ") ;
        String oldPhrase = x.nextLine() ;
        //Main Object
        EnglishLetters newWord = new EnglishLetters() ;
        newWord.encryptText(oldPhrase) ;
    }
}