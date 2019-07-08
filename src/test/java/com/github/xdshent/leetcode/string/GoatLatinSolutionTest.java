package com.github.xdshent.leetcode.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoatLatinSolutionTest {

    private GoatLatinSolution goatLatinSolution;
    private String s;

    @Before
    public void setUp() throws Exception {
        goatLatinSolution = new GoatLatinSolution();
        s = "I speak Goat Latin";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void toGoatLatin() {
        String result = goatLatinSolution.toGoatLatin(s);
        String expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
        Assert.assertEquals(expected, result);

        s = "The quick brown fox jumped over the lazy dog";
        result = goatLatinSolution.toGoatLatin(s);
        expected = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
        Assert.assertEquals(expected, result);

        s = "";
        result = goatLatinSolution.toGoatLatin(s);
        expected = "";
        Assert.assertEquals(expected, result);

        s = null;
        result = goatLatinSolution.toGoatLatin(s);
        expected = null;
        Assert.assertEquals(expected, result);
    }
}