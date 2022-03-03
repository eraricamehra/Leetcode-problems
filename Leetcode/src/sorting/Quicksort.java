package sorting;

public class Quicksort {
	public int[] sortArray(int[] nums) {
        quicksort(nums,0, nums.length -1);
        for (int l =0 ; l<=nums.length-1; l++) {
			System.out.print(nums[l] + " , ");
		}
        return nums;
    }

	void quicksort(int[] nums, int start, int end) {
		if (start < end) {
			int pi = partition(nums, start, end);
			quicksort(nums, start, pi - 1);
			quicksort(nums, pi + 1, end);
		}
	}

	public int partition(int[] nums, int start, int end) {
		int pi = start;
		int pivot = nums[end];
		for (int i = start; i < end; i++) {
			if (nums[i] <= pivot) {
				swap(nums, i, pi);
				pi++;
			}
		}
		swap(nums , pi, end);
		return pi;
	}

	public void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
