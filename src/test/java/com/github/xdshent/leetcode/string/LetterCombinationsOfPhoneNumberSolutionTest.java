package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author xdshen
 */
public class LetterCombinationsOfPhoneNumberSolutionTest {

    private LetterCombinationsOfPhoneNumberSolution letterCombinationsOfPhoneNumberSolution;
    private String digits;

    @Before
    public void setUp() throws Exception {
        letterCombinationsOfPhoneNumberSolution = new LetterCombinationsOfPhoneNumberSolution();
        digits = "23";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void letterCombinations() {
        List<String> result = letterCombinationsOfPhoneNumberSolution.letterCombinations(digits);
        String[] expected = new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        digits = "234";
        result = letterCombinationsOfPhoneNumberSolution.letterCombinations(digits);
        System.out.println(result);
        expected = new String[]{"adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"};
        assertArrayEquals(expected, result.toArray(new String[0]));

        digits = "";
        result = letterCombinationsOfPhoneNumberSolution.letterCombinations(digits);
        System.out.println(result);
        expected = new String[]{};
        assertArrayEquals(expected, result.toArray(new String[0]));
    }
}