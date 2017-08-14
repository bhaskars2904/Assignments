package com.bhaskar.javaAssignment3;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

/*
 *Pings a given host and computes the median of the time taken to ping.
 * This program uses a Runtime and Process to write terminal ping
 * command.
 */

public class Pinghost {
    public static void main(String[] args) {

        System.out.println("Enter the host ip");
        Scanner scan = new Scanner(System.in);
        String ip = scan.next();
        System.out.println("Enter the number of times the server to be pinged");
        int count = scan.nextInt();
        String timeString;
        int sizeOfArray = count;
        float[] time = new float[sizeOfArray];

        String pingCmd = "ping " + ip + " -c" + count;                          //string of ping command

        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(pingCmd);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String inputLine = in.readLine();                                   //reads irrelevant first line

            for (int i = 0; (inputLine = in.readLine()) != null && count >0; i++) {
                timeString = inputLine.substring(inputLine.lastIndexOf('=') + 1, inputLine.lastIndexOf(' '));
                //extracting the substring containing time//
                time[i] = Float.parseFloat(timeString);
                count--;
            }
            in.close();
            scan.close();

            Arrays.sort(time);
            //sort time data to compute median//
            if(sizeOfArray%2 == 0){
                System.out.println("\n" + "The median is " + (time[sizeOfArray/2]+time[(sizeOfArray/2)-1])/2 + " ms");
            }
            else{
                System.out.println("\n" + "The median is " + time[sizeOfArray/2] + " ms");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
