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
                        String tempString = letters[i] + letters[j] + letters[k] + letters[l] ;
                        nonEnc[counter] = tempString ;
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
                nonEnc[num] = "DONE!" ;
                counter ++ ;
            }
        }
        printyyyEnc() ;
    }
    void printyyyEnc()
    {
        for (int i = 0 ;  i < yyyEnc.length ; i ++)
        {
            System.out.println(i + 1 + " " + yyyEnc[i]) ;
        }
    }
}
