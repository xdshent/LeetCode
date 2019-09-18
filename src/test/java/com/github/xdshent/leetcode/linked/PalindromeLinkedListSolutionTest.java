package com.github.xdshent.leetcode.linked;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeLinkedListSolutionTest {

    private PalindromeLinkedListSolution palindromeLinkedListSolution;
    private SinglyLinkedNode head;

    @Before
    public void setUp() throws Exception {
        palindromeLinkedListSolution = new PalindromeLinkedListSolution();
        head = new SinglyLinkedNode(1);
        head.next = new SinglyLinkedNode(2);
        head.next.next = new SinglyLinkedNode(1);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPalindrome() {
        boolean result = palindromeLinkedListSolution.isPalindrome(head);
        Assert.assertTrue(result);

        head = new SinglyLinkedNode(1);
        head.next = new SinglyLinkedNode(2);
        head.next.next = new SinglyLinkedNode(2);
        head.next.next.next = new SinglyLinkedNode(1);
        result = palindromeLinkedListSolution.isPalindrome(head);
        Assert.assertTrue(result);

        head = new SinglyLinkedNode(1);
        head.next = new SinglyLinkedNode(2);
        head.next.next = new SinglyLinkedNode(3);
        result = palindromeLinkedListSolution.isPalindrome(head);
        Assert.assertFalse(result);

        head = new SinglyLinkedNode(1);
        result = palindromeLinkedListSolution.isPalindrome(head);
        Assert.assertTrue(result);

        head = null;
        result = palindromeLinkedListSolution.isPalindrome(head);
        Assert.assertTrue(result);
    }
}