package com.Bridgelabz.Day9Assignments;

public class UC1 {


        public static void main(String[] args)
        {
            int present = 1;
            double empCheck = Math.floor(Math.random() * 10) % 2;

            if (empCheck == present)
            {

                System.out.println("Employee is Present");

            }
            else
            {

                System.out.println("Employee is Absent");
            }
        }
    }

}
