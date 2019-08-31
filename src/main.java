import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        EnglishLetters newWord = new EnglishLetters() ;
        for(int i = 0 ; i < 456976 ; i ++)
        {
            System.out.println(yyyEnc[i]) ;
        }
        System.out.println("COUNTER V2 : " + counter) ;
        String newPhrase = "";
        int userCounter = 0 ;
        Scanner x = new Scanner(System.in) ;
        System.out.println("type your text below: ") ;
        String oldPhrase = x.nextLine() ;
        counter = 0 ;
        while(true)
        {
            int place ;
            for(int i = 0 ; i < 26 ; i ++)
            {
                if(counter < oldPhrase.length())
                {
                    if(letters[i].equals(oldPhrase.substring(counter, counter + 1)) || letters[i].toUpperCase().equals(oldPhrase.substring(counter, counter + 1)))
                    {
                        place = 26 * userCounter  + i ;
                        counter ++ ;
                        newPhrase += yyyEnc[place] ;
                    }
                }
                else if(counter == oldPhrase.length())
                {
                    if(letters[i].equals(oldPhrase.substring(counter)) || letters[i].toUpperCase().equals(oldPhrase.substring(counter)))
                    {
                        place = 26 * userCounter  + i ;
                        counter ++ ;
                        newPhrase += yyyEnc[place] ;
                    }
                }
            }
            userCounter += 26 ;
            if(userCounter  == 17576)
            {
                userCounter = 0 ;
            }
            if(oldPhrase.length() == counter)
            {
                break ;
            }
            System.out.println(userCounter) ;
        }
        System.out.println(newPhrase) ;
    }
}