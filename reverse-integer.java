class Solution {
    public int reverse(int x) 
    {
        long rev=0;
        while(x!=0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }    
        if(rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE)
            return (int)rev; 
         else
             return 0;
    }
}
