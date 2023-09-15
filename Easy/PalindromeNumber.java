// Q - Given an integer x, return true if x is a palindrome, and false otherwise.
/* Solution - A simple approach can be to reverse the entire input number and check if the reversed number is equal to the original number.
If they are the same, then the number is a palindrome.*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // If number is negative it cannot be a palindrome number
        }

        int reversed = 0; 
        int temp = x; // Create a temporary variable to store value

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit; //Multiplying the reversed digit place with 10 and adding the last digit of temp
            temp /= 10; //Dividing the temp variable by 10 to remove a digits place every time
        }

        return (reversed == x); //Checking if the number obtained on reversing is equal to given integer x
    }
}
