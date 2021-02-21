/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1daycode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nhatnguyendang
 */
public class day5prob14 {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int [] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int []result = new int[2];
        day5prob14 prob = new day5prob14();
        System.out.println(result[0] + " " + result[1]);
    }
    
}
