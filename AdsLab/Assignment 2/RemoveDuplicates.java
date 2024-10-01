public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;  
        }

        
        int uniqueIndex = 0;

        
        for (int i = 1; i < nums.length; i++) {
           
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;          
                nums[uniqueIndex] = nums[i];  
            }
        }

        
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1, 1, 2, 2, 3, 3}; 
        int newLength = removeDuplicates(nums);

        System.out.println("The new length of the array after removing duplicates is: " + newLength);
        System.out.print("The array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}