package string_problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    //Implement Here

    public static void main(String[] args) {

        System.out.println(isAnagram("ARMY", "MARY"));

    }

    public static boolean isAnagram(String firstWord, String secondWord){

        if(!(firstWord.length() == secondWord.length())){
            return false;
        }

        char[] firstWordArray = firstWord.toCharArray();
        char[] secondWordArray = secondWord.toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);

        return Arrays.equals(firstWordArray, secondWordArray);



    }

}
