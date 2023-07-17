import java.util.*;
class Solution
{
    public void countbit(int number)
    {
        int count=0;
        while(number>0)
        {
            if((number%2)==1)
            {
                count++;
            }
            number/=2;
        }
        System.out.println(count);
    }
}

class BitCount
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Solution solution =new Solution();
        solution.countbit(n);
    }
}
