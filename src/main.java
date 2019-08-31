import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        //prepei na ftiaksw ta symbols
        //figure out what i was thinking with userCounter variable
        String one [] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"} ;
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"} ;
        String[] symbols = {" ", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "{", "}", ";", ":", "<", ">", ",", "?", "[", "]", "."} ;
        String nonEnc[] = new String[456976] ;
        String yyyEnc[] = new String[456976] ;
        int counter = 0 ;
        for(int i = 0 ; i < 26 ; i ++)
        {
            for(int j = 0 ; j < 26 ; j ++)
            {
                for(int k = 0 ; k < 26  ; k ++)
                {
                    for(int l = 0 ; l < 26 ; l ++)
                    {
                        String tempString = one[i] + one[j] + one[k] + one[l] ;
                        nonEnc[counter] = tempString ;
                        counter ++ ;
                    }
                }
            }
        }
        System.out.println("COUNTER : " + counter) ;
        counter = 0 ;
        while(counter != 456976)
        {
            int num = (int)(1+ Math.random() * 456975) ;
            if(nonEnc[num].equals("DONE!"))
            {
                continue ;
            }
            else
            {
                yyyEnc[counter] = nonEnc[num] ;
                counter ++ ;
            }
        }
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