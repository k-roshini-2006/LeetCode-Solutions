class Solution
{
    static String minWindow(String s,String t)
    {
        int a[]=new int[256];
        int i;
        for(i=0;i<t.length();i++)
        a[t.charAt(i)]++;
        int left=0;
        int right=0;
        int si=-1;
        int cu=0;
        int n=t.length();
        int length=Integer.MAX_VALUE;
        while(right<s.length())
        {
          if(a[s.charAt(right)]>0)
          {
            cu++;
          }
            a[s.charAt(right)]--;

          while(cu==n)
          {
              a[s.charAt(left)]++;

              if(a[s.charAt(left)]>0)
              cu-=1;
            if(right-left+1<length)
            {
                length=right-left+1;
                si=left;
            }
              left++;

          }
          right+=1;
        }
        return si==-1?"":s.substring(si,si+length);
    }
}