/* Q - Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice. */ 
/* Solutions -   

Solution 1 -  Brute force approach 
Consider every pair of elements and check if their sum equals the target. 
This can be done using nested loops, where the outer loop iterates from the first element 
to the second-to-last element, and the inner loop iterates from the next element
to the last element. However, this approach has a time complexity of O(n^2).

Solution 2 - Using HashMaps
We can iterate through the array once, and for each element, 
check if the target minus the current element exists in the hash table.
This basically means check if complement of current number is present in hash table.
If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.
*/

// Solution 1 - Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}

//Solution 2 - Using HashMaps
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indPos = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                indPos[0] = map.get(complement);
                indPos[1] = i;
            }
            map.put(nums[i], i);
        }
    return indPos;
    }
}
