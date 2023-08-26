package matriz;

	import java.util.Arrays;
	 
	public class ejemplo
	{
		   public static void main(String[] args)
		    {
		        int[] nums = {1, 2, 3, 4, 5};
		 
		        reverse(nums);
		        System.out.println(Arrays.toString(nums));
		    }
	    // Método de utilidad para intercambiar dos elementos nums[i] y nums[j] en la array
	    private static void swap(int[] nums, int i, int j)
	    {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	 
	    // Método de utilidad para invertir elementos de una array
	    public static void reverse(int[] nums)
	    {
	        for (int low = 0, high = nums.length - 1; low < high; low++, high--) {
	            swap(nums, low, high);
	        }
	    }
	 
	 
	}

