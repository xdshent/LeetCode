package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumIndexSumOfTwoListsSolutionTest {

    private MinimumIndexSumOfTwoListsSolution minimumIndexSumOfTwoListsSolution;
    private String[] list1;
    private String[] list2;

    @Before
    public void setUp() throws Exception {
        minimumIndexSumOfTwoListsSolution = new MinimumIndexSumOfTwoListsSolution();
        list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        list2 = new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findRestaurant() {
        String[] result = minimumIndexSumOfTwoListsSolution.findRestaurant(list1, list2);
        String[] expected = new String[]{"Shogun"};
        Assert.assertArrayEquals(expected, result);

        list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        list2 = new String[]{"KFC", "Shogun", "Burger King"};
        result = minimumIndexSumOfTwoListsSolution.findRestaurant(list1, list2);
        expected = new String[]{"Shogun"};
        Assert.assertArrayEquals(expected, result);

        list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        list2 = new String[]{"Tapioca Express", "Shogun", "Burger King"};
        result = minimumIndexSumOfTwoListsSolution.findRestaurant(list1, list2);
        expected = new String[]{"Tapioca Express", "Shogun"};
        Assert.assertArrayEquals(expected, result);

        list1 = new String[]{"Tapioca Express", "Burger King", "Shogun", "KFC"};
        list2 = new String[]{"Shogun", "Burger King", "Tapioca Express", "KFC"};
        result = minimumIndexSumOfTwoListsSolution.findRestaurant(list1, list2);
        expected = new String[]{"Shogun", "Burger King", "Tapioca Express"};
        Assert.assertArrayEquals(expected, result);

        list1 = new String[]{"TapiocaB Express", "Shogun", "KFC", "Burger King"};
        list2 = new String[]{"ShogunH", "Burger King", "Tapioca Express", "KFC"};
        result = minimumIndexSumOfTwoListsSolution.findRestaurant(list1, list2);
        expected = new String[]{"Burger King"};
        Assert.assertArrayEquals(expected, result);
    }
}