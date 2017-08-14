package com.bhaskar.javaAssignment2;

import java.util.Scanner;
/*
 *Program detects the presence of all alphabets (case insensitive)
 * This uses a Scanner to read each character of string input &
 * reserves a byte array element for each alphabet's presence(1) or absence(0)
 */

public class AllAlpahabets {
    public static void main(String[] args) {
        System.out.println("Enter the string to be checked for");
        try{
            Scanner scan=new Scanner(System.in);
            byte[] isPresent = new byte[52];
            //each element accounts for the presence/absence of an alphabet
            String inputString=scan.nextLine();
            for(int i=0;i<inputString.length();i++) {
                char currentCharacter = inputString.charAt(i);
                if(currentCharacter>='a'&&currentCharacter<='z'){
                    if(isPresent[currentCharacter-'a']!=1){
                        isPresent[currentCharacter-'a']=1;
                    }
                }
                if(currentCharacter>='A'&&currentCharacter<='Z'){
                    if(isPresent[currentCharacter-'A'+26]!=1){
                        isPresent[currentCharacter-'A'+26]=1;
                    }
                }
            }
            for(int i=0;i<52;i++){
                if(isPresent[i]==0){
                    System.out.println("Given string does not contain all the alphabets a-z (case insensitive)");
                    break;
                }
                if(i==51){
                    System.out.println("Given string contains all the alphabets a-z (case insensitive)");
                }
            }
            scan.close();
            //Time complexity = O(n); where n = length of the string(input)
            //Space complexity = O(1)
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
