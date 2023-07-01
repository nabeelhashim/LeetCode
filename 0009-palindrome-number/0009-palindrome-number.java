class Solution {
    public boolean isPalindrome(int x) {
        int checkPalindrome = 0;
        int inputNumber = x;
        if(String.valueOf(x).charAt(0) == '-') {
            return false;
        }
        while(x != 0) {
            int lastDigit = x%10;
            checkPalindrome = (checkPalindrome*10)+lastDigit;
            x=x/10;
        }
        if(checkPalindrome == inputNumber) {
            return true;
        } else {
            return false;
        }
    }
}