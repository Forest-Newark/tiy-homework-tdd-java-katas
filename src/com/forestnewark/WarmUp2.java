package com.forestnewark;

/**
 * "Has271"
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus
 * 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from
 * the correct value.
 */

public class WarmUp2 {

    public static boolean has271(int[] nums) {
        if (nums.length < 3) {
            return false;
        } else {
            for (int x = 0; x <= nums.length - 3; x++) {
                if (nums[x + 1] == nums[x] + 5 && (nums[x + 2] >= nums[x] - 3 && nums[x + 2] <= nums[x] + 1)) {
                    return true;
                }
            }
            return false;
        }

    }

}
