package com.forestnewark;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * "mapAB4 "
 * Modify and return the given map as follows: if the keys "a" and "b" have values that have different
 * lengths, then set "c" to have the longer value. If the values exist and have the same length, change
 * them both to the empty string in the map.
 */
public class Map1Test {

    @Test
    /**
     * mapAB4 should return a map (it maybe empty but not null)
     */
    public void mapAB4ReturnsAMap() {
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("a", "aa");
        assertThat(Map1.mapAB4(testMap), notNullValue());
    }

    @Test
    /**
     * mapAB4 should return an empty HashMap if given an empty HashMap
     */
    public void mapAB4ReturnsEmptyMapIfGivenEmptyMap() {
        HashMap<String, String> testMap = new HashMap<>();
        assertThat(Map1.mapAB4(testMap).size(), equalTo(0));
    }

    @Test
    /**
     * mapAB4 should return the HashMap unchanged if it does not have an "a" or "b" key
     */
    public void mapAB4ReturnsMapUnchangedIfNoAORBKeys() {


        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("key", "value");
                put("anotherKey", "anotherValue");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("key", "value");
                put("anotherKey", "anotherValue");

            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "value");
                put("anotherKey", "anotherValue");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "value");
                put("anotherKey", "anotherValue");

            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("key", "value");
                put("b", "anotherValue");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("key", "value");
                put("b", "anotherValue");

            }
        }));

    }

    @Test
    /**
     * If the values for "a" and "b" keys have the same length then set their values to ""
     * return the hashmap with the adjusted values for "a" and "b" keys
     */
    public void mapAB4ReturnsHashMapWithEmptyValuesforAAndBIfTheyLengthIsSame() {
        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "value");
                put("b", "value");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "");
                put("b", "");

            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "valueLonger");
                put("b", "value");

            }
        }), not(equalTo(new HashMap<String, String>() {
            {
                put("a", "");
                put("b", "");

            }
        })));

    }


    @Test
    /**
     * Given a map with the keys "a", "b", and "c"
     * When value of "a" is longer than value of "b"
     * Returns map where the value of c is set to the value "a"
     */
    public void mapAB4ReturnsMapWithValueOfCSetToValueOfA() {
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("a", "aaa");
        testMap.put("b", "bb");
        testMap.put("c", "c");
        HashMap<String, String> resultMap = new HashMap<>();
        resultMap.put("a", "aaa");
        resultMap.put("b", "bb");
        resultMap.put("c", "aaa");

        assertThat(Map1.mapAB4(testMap), equalTo(resultMap));
    }

    @Test
    /**
     * Given a map with the keys "a", "b", and "c"
     * When value of "b" is longer than value of "a"
     * Returns map where the value of c is set to the value "b"
     */
    public void mapAB4ReturnsMapWithValueOfCSetToValueOfB() {
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("a", "aa");
        testMap.put("b", "bbb");
        testMap.put("c", "c");
        HashMap<String, String> resultMap = new HashMap<>();
        resultMap.put("a", "aa");
        resultMap.put("b", "bbb");
        resultMap.put("c", "bbb");

        assertThat(Map1.mapAB4(testMap), equalTo(resultMap));
    }


    @Test
    /**
     * mapAB4 passes all coding bat test (Holy shit that is a lot of lines)
     */
    public void mapAB4PassesAllCodingBatTest() {

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "aaa");
                put("b", "bb");
                put("c", "cake");
            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "aaa");
                put("b", "bb");
                put("c", "aaa");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "aa");
                put("b", "bbb");
                put("c", "cake");
            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "aa");
                put("b", "bbb");
                put("c", "bbb");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "aa");
                put("b", "bbb");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "aa");
                put("b", "bbb");
                put("c", "bbb");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "aaa");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "aaa");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {

                put("b", "bbb");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("b", "bbb");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "aaa");
                put("b", "bbb");
                put("c", "cake");
            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "");
                put("b", "");
                put("c", "cake");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "a");
                put("b", "b");
                put("c", "cake");
            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "");
                put("b", "");
                put("c", "cake");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "");
                put("b", "b");
                put("c", "cake");
            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "");
                put("b", "b");
                put("c", "b");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "a");
                put("b", "");
                put("c", "cake");
            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "a");
                put("b", "");
                put("c", "a");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {

                put("c", "cat");
                put("d", "dog");
            }
        }), equalTo(new HashMap<String, String>() {
            {

                put("c", "cat");
                put("d", "dog");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {

                put("ccc", "ccc");
            }
        }), equalTo(new HashMap<String, String>() {
            {

                put("ccc", "ccc");
            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {

                put("c", "a");
                put("d", "b");
            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("c", "a");
                put("d", "b");

            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {

            }
        }), equalTo(new HashMap<String, String>() {
            {

            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("a", "");
                put("z", "zz");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("a", "");
                put("z", "zz");

            }
        }));

        assertThat(Map1.mapAB4(new HashMap<String, String>() {
            {
                put("b", "");
                put("z", "zz");

            }
        }), equalTo(new HashMap<String, String>() {
            {
                put("b", "");
                put("z", "zz");

            }
        }));


    }


}
