package com.bhaskar.javaAssignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
/*
 *This program returns cannonical path of
 * files matching a given pattern
 * inside a given home folder.
 */
public class FilewithPattern {
    public static void main(String[] args){
        boolean morepattern = true;
        byte flag=0;
        System.out.println("Enter the path to folder to search for files");
        Scanner scanner = new Scanner(System.in);
        String folderPath = scanner.next();
        File folder = new File(folderPath);
        if (folder.isDirectory()) {                                                     //check for directory
            File[] listOfFiles = folder.listFiles();
            if (listOfFiles.length < 1)                                                 //check for empty directory
                System.out.println("There is no File inside Folder");
            else{
                while(morepattern) {
                    System.out.println("Do you want to enter the pattern(Y/N)");
                    String ispattern=scanner.next();
                    if(ispattern.equalsIgnoreCase("N"))
                        break;
                    System.out.println("Enter the pattern to scan for");
                    String patternScan=scanner.next();
                    Pattern filePattern = Pattern.compile(patternScan);
                    for (File file : listOfFiles) {
                        if (!file.isDirectory()){
                            try{
                                if (filePattern.matcher(file.getName()).matches()) {
                                    System.out.println(file.getCanonicalPath());
                                    flag=1;
                                }
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    }
                    if(flag==0){
                        System.out.println("No match found");
                    }
                }
            }
        }
        else{
            System.out.println("There is no Folder at given path :" + folderPath);
        }
        scanner.close();
    }
}
