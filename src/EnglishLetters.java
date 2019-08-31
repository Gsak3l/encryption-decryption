public class EnglishLetters
{
    private String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"} ;
    private String[] symbols = {" ", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "{", "}", ";", ":", "<", ">", ",", "?", "[", "]", "."} ;
    String nonEnc[] = new String[456976] ;
    private int counter ;
    void possibleCombinations()
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
    }
}
