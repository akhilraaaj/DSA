class reverseString {
    public String reverseStr(String s, int k)
    {
        char rev[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            int start=i, end=Math.min(i+k-1,rev.length-1);
            reverse(rev,start,end);
        }
        return String.valueOf(rev);
    }

    public void reverse(char[] rev, int i, int j)
    {
        while(i<=j)
        {
            char temp=rev[i];
            rev[i]=rev[j];
            rev[j]=temp;
            i++;
            j--;
        }
    }
}