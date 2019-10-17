public class EnglishLetters
{
    //variables
    private String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"} ;
    private String[] symbols = {" ", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "{", "}", ";", ":", "<", ">", ",", "?", "[", "]", "."} ;
    private String nonEnc[] = new String[456976] ; //non randomized possible combinations, basically aaaa to zzzz
    private String yyyEnc[] = new String[456976] ; //randomized possible combinations, aaaa to zzzz but in a different order
    private int counter ; //just a counter
    //-----------------------------------------------------------------------------------------------------------------------------------------
    public EnglishLetters() //an empty constructor
    {
        possibleCombinations() ;
    }
    void possibleCombinations() //gives the possible combinations of my encryption, from aaaa to zzzz per letter
    {
        for(int i = 0 ; i < 26 ; i ++)
        {
            for(int j = 0 ; j < 26 ; j ++)
            {
                for(int k = 0 ; k < 26  ; k ++)
                {
                    for(int l = 0 ; l < 26 ; l ++)
                    {
                        nonEnc[counter] = letters[i] + letters[j] + letters[k] + letters[l] ;
                        counter ++ ;
                    }
                }
            }
        }
        randomCombinations() ;
    }
    void randomCombinations()
    {
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
    }
    void encryptText(String oldPhrase)
    {
        String newPhrase = "" ;
        int userCounter = 0 ;
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
    }
    void printyyyEnc()
    {
        for (int i = 0 ;  i < yyyEnc.length ; i ++)
        {
            System.out.println(i + 1 + " " + yyyEnc[i]) ;
        }
    }

    void print(){
    	for (int i=0; i<5; i++){
    		System.out.println(i);
    	}
    }
}
//this project is closed for now, i cannot make my encryption strong enough
//with the tools that i want to use :( 