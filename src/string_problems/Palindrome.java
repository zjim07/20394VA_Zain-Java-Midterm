package string_problems;

public class Palindrome {

    /*
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */

    // Implement here

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    public static boolean isPalindrome(String word){

        char[] wordArray = new char[word.length()];
        char[] reverseWord = new char[word.length()];
        String reversedWord = "";

        for(int i = 0; i < wordArray.length; i++){

            wordArray[i] = word.charAt(i);

        }

        int count = 0;

        for(int i = wordArray.length; i > 0; i--){

            if(count < wordArray.length){

                reverseWord[count] = wordArray[i - 1];
                count++;

            }

        }

        reversedWord = String.valueOf(reverseWord);

        if(word.equals(reversedWord)) {
            return true;
        } return false;


    }

}
