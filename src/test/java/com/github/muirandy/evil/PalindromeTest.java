package com.github.muirandy.evil;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void whenPalindrom_thenAccept() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("noon"));
    }
}
