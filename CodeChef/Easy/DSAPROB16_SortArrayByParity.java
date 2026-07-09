import java.util.*;

public class Main {
    public static void sortArrayByParity(int[] nums) {
        // Write your code here
        int i=0, j=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                 int temp=nums[j];
                for(int k=j; k>i;k--){
                    if(j!=0){
                    nums[k]=nums[k-1];
                    }
                }
                nums[i]=temp;
                i++;
            }
            j++;
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        sortArrayByParity(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}