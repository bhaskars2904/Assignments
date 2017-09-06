package com.bhaskar.javaAssignment4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * This program computes the window for form date
 * KYC form of Gruber Healthcare. This uses Gregorian
 * Calendar and dd-MM-yyyy date format for i/o.
 */
public class KYCform {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");             //set date format
        System.out.println("Enter the input");
        Scanner scan = new Scanner(System.in);
        int numOfInputs = scan.nextInt();
        for(int i = 0; i < numOfInputs; i++){
            try {
                String signUpString = scan.next();
                Date signUpDate = dateFormat.parse(signUpString);
                String currentString = scan.next();
                Date currentDate = dateFormat.parse(currentString);
                //reading date from input into Date object
                Calendar calSignup = Calendar.getInstance();
                Calendar calCurrent = Calendar.getInstance();
                calSignup.setTime(signUpDate);
                calCurrent.setTime(currentDate);
                //assigning the created Date object to Calendar for manipulation
                if(!calCurrent.after(calSignup)){
                    System.out.println("No range");
                }
                else{
                    calSignup.add(Calendar.DATE,-30);
                    while(calSignup.before(calCurrent)){
                        calSignup.add(Calendar.YEAR, 1);
                    }
                    calSignup.add(Calendar.YEAR, -1);
                    //to compute 30 days prior to anniversary date for current year
                    calSignup.add(Calendar.DATE, 60);

                    if(calSignup.after(calCurrent)){                    //current date in +-30 day window
                        calSignup.add(Calendar.DATE, -60);
                        System.out.println(dateFormat.format(calSignup.getTime())+" "+dateFormat.format(calCurrent.getTime()));
                    }
                    else{
                        calSignup.add(Calendar.DATE, -60);          //current date out of +-30 day window
                        System.out.print(dateFormat.format(calSignup.getTime())+" ");
                        calSignup.add(Calendar.DATE, 60);
                        System.out.println(dateFormat.format(calSignup.getTime()));
                    }

                }

            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }
}
