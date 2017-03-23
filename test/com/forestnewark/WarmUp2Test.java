package com.forestnewark;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 *"Has271"
 *Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus
 * 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from
 * the correct value.
 */
public class WarmUp2Test {

    @Test
    /**
     * has271() returns true when given the array of {2,7,1}
     */
    public void has271ReturnsTrueWhenGivenBaseAnswerArray() {
        assertThat(WarmUp2.has271(new int[]{2,7,1}), equalTo(true));
    }

    @Test
    /**
     * has271() returns false when given an empty array
     */
    public void has271ReturnsFalseWhenGivenEmptyArray() {
        assertThat(WarmUp2.has271(new int[] {}),equalTo(false));
    }

    @Test
    /**
     * has271() returns false when given an array with less than 3 elements
     */
    public void has271ReturnsFalseWhenGivenArrayWithLessThanThreeElements() {
        assertThat(WarmUp2.has271(new int[] {2}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {2,7}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {2,7,1}),equalTo(true));
    }

    @Test
    /**
     * has271() returns true if literal "2,7,1" pattern exist in array
     */
    public void has271ReturnsTrueIfLiteralPatternExists() {
        assertThat(WarmUp2.has271(new int[] {2,7,1}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {0,2,7,1}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2,7,1,0}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {0,2,2,7,1,0}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2,0,7,1}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {0,2,2,2,0,7,1}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {2,7,9,1}),equalTo(false));
    }

    @Test
    /**
     * has271 returns true if relative "2,7,1" pattern (x, x+5,x-1) exist in array
     */
    public void has271ReturnsTrueIfRelativePatternExists() {
        assertThat(WarmUp2.has271(new int[] {3,8,2}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {0,4,9,3}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {1,6,0,0}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {0,2,3,8,2,0}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2,0,7,1}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {0,2,2,2,0,7,1}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {2,7,9,1}),equalTo(false));
    }

    @Test
    /**
     * has271 returns true if relative "2,7,1" where "1" can be within range +2/-2
     */
    public void has271ReturnsTrueIfRelativePattenrsExistsWithNumberInRange() {
        assertThat(WarmUp2.has271(new int[] {2,7,-1}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2,7,3}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {0,2,3,8,0,0}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {0,2,3,8,4,0}),equalTo(true));
    }

    @Test
    /**
     * has271 should pass for all codingbat test
     */
    public void has271ReturnsCorrectValueForAllCodingBatTest() {
        assertThat(WarmUp2.has271(new int[] {1, 2, 7, 1}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {1, 2, 8, 1}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {2, 7, 1}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {3, 8, 2}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2, 7, 3}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2, 7, 4}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {2, 7, -1}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2, 7, -2}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {4, 5, 3, 8, 0}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2, 7, 5, 10, 4}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2, 7, -2, 4, 9, 3}),equalTo(true));
        assertThat(WarmUp2.has271(new int[] {2, 7, 5, 10, 1}),equalTo(false));
        assertThat(WarmUp2.has271(new int[] {2, 7, -2, 4, 10, 2}),equalTo(false));


    }



}
