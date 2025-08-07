#include <stdio.h>
#include <string.h>
#include <stdbool.h>

// Function to check if a substring is a palindrome
bool isPalindrome(const char *s, int low, int high) {
    while (low < high) {
        if (s[low] != s[high]) {
            return false;
        }
        low++;
        high--;
    }
    return true;
}

// Function to find the longest palindromic substring
void longestPalindrome(char *s, char *result) {
    int n = strlen(s);
    int maxLen = 1;
    int start = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int len = j - i + 1;
            if (len > maxLen && isPalindrome(s, i, j)) { 
                start = i;
                maxLen = len;
            }
        }
    }

    // Copy the longest palindrome into result
    strncpy(result, s + start, maxLen);
    result[maxLen] = '\0';  // Null-terminate the result string
}

int main() {
    char s[] = "babad";
    char result[100];  // Ensure this is big enough to hold the result

    longestPalindrome(s, result);
    printf("Longest Palindromic Substring: %s\n", result);

    return 0;
}

