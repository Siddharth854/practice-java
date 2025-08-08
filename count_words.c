#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char s[1000];
    printf("Enter the string: ");
    fgets(s, sizeof(s), stdin);

    int count = 0;
    int inWord = 0;

    for (int i = 0; s[i] != '\0'; i++) {
        if (!isspace(s[i])) {
            if (!inWord) {
                count++;
                inWord = 1;
            }
        } else {
            inWord = 0;
        }
    }

    printf("Number of words: %d\n", count);
    return 0;
}
