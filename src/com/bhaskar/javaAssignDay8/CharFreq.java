package com.bhaskar.javaAssignDay8;
import java.util.*;
import java.io.*;

/**
 * This program reads a file(input) and outputs
 * the no. of appearance of all characters in it
 * to a file(input). Hash map is used to maintain
 * an Integer index for every Character value
 */
public class CharFreq {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        System.out.println("Enter the location of input file");
        Scanner scan = new Scanner(System.in);
        InputStream inputStream       = new FileInputStream(scan.nextLine());
        Reader      inputStreamReader = new InputStreamReader(inputStream);

        int data = inputStreamReader.read();
        //data has ASCII value for each character it reads
        while(data != -1){
            char ch = (char) data;
            Integer freq = m.get(ch);
            m.put(ch, (freq == null) ? 1 : freq + 1);
            data = inputStreamReader.read();
        }
        inputStreamReader.close();
        System.out.println("Enter the location of output file");
        //If the file is nonexistent then a new file is created
        PrintWriter out = new PrintWriter(new FileOutputStream(scan.nextLine()));
        out.println(m);
        out.close();
        scan.close();
    }
}
