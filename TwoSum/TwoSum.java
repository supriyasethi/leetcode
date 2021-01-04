//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

class Solution {
    int sum;
    int[] index = new int[2];
    public int[] twoSum(int[] nums, int target) {
        outerloop:
        for(int i=0; i < nums.length; i++) {
            for (int j=0; j < nums.length;) {
                if(i==j) {
                    j++;
                } else {
                sum = nums[i] +  nums[j];
                if(sum == target) {
                    index[0] = i;
                    index[1] = j;
                    break outerloop;
                } j++;
                }
            } System.out.println(index[0]);
        } return (index);
    }
}