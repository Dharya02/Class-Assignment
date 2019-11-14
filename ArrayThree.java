//find count of sub array having sum greater than or equals to given no. k permitting following constraint (i)no use of any other data structure
//(ii)Running time complexability & same code can not exceed O(1). 


import java.util.*;
public class ArrayThree
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();
        a = a-k+1;
        int count=(a*(a+1))/a;
        System.out.println(count);

    }
}