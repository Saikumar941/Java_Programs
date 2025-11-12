public class SecondLargest 
{
    public static void main(String[] args) 
 {
        int[] arr = {100, 55, 20, 8, 15};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) 
      {
            if (n > first) 
           {
                second = first;
                first = n;
            } 
                else if (n > second && n != first) 
            {
                second = n;
            }
        }

        System.out.println("Second Largest Number: " + second);
    }
}
