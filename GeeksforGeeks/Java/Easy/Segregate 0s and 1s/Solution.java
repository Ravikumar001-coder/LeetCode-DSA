class Solution {
	void segregate0and1(int[] arr) {
		// code here
		int s = 0;
		int e = arr.length - 1;
		while (s<e) {
			if (arr[s] == 0)
				s++;
			else if (arr[e] != 0)
				e--;
			else {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
	}
}
