package com.github.xdshent.leetcode.hashtable;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsomorphicStringsSolutionTest {

    private IsomorphicStringsSolution isomorphicStringsSolution;
    private String s;
    private String t;

    @Before
    public void setUp() throws Exception {
        isomorphicStringsSolution = new IsomorphicStringsSolution();
        s = "egg";
        t = "add";
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isIsomorphic() {
        boolean result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertTrue(result);

        s = "foo";
        t = "bar";
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertFalse(result);

        s = "paper";
        t = "title";
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertTrue(result);

        s = "paler";
        t = "title";
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertFalse(result);

        s = "title";
        t = "paler";
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertFalse(result);

        s = "";
        t = "title";
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertFalse(result);

        s = "paper";
        t = "";
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertFalse(result);

        s = null;
        t = "title";
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertFalse(result);

        s = "paper";
        t = null;
        result = isomorphicStringsSolution.isIsomorphic(s, t);
        Assert.assertFalse(result);
    }
}