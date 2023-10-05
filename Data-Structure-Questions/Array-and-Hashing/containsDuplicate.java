import java.io.*;
class Solution {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[] = new int[l];

        for(int i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(arr));

    }
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}