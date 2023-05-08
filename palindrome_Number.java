


import java.util.Arrays;



public class palindrome_Number 
{
    public static void main(String[] args) 
    {
        int x = 131;
        isPalindrome(x);
    }   

    public  static boolean isPalindrome(int x)
    {
        int j =0 ;

        String ConX = Integer.toString(x);
        
        char[] number = new char[ConX.length()];
        char[] checker = new char[ConX.length()];
        
      
        for(int i = 0; i< number.length ; i++)
        {
            number[i] = ConX.charAt(i);
            
        }
       
            for(int q = number.length-1; q >= 0; q--)
            {
                checker[j] = number[q];
                System.out.println("cheker:" + checker[j]);
                System.out.println("number:" + number[j]);
                
                j++;
            }   
        
            
            if(Arrays.equals(checker,number))
            {
                System.out.println("true"); 
                return true;
                
            }
            else
            {
                System.out.println("false");                
                return false;       
            }
            
            
    
    }
}
