package com.pluralsight;
import java.util.Scanner;
public class AddressBuilder {

    public static void main(String[] args) {

        //create StringBuilder and Scanner

        StringBuilder addressCombine = new StringBuilder();
        Scanner myScanner = new Scanner(System.in);
            //ask for billing information

            System.out.println("Please provide the following information");

            System.out.print("Full name : ");
                String fullName = myScanner.nextLine().trim();
            System.out.print("Billing Street : ");
                String billingStreet = myScanner.nextLine().trim();
            System.out.print("Billing City : ");
                String billingCity = myScanner.nextLine().trim();
            System.out.print("Billing State : ");
                String billingState = myScanner.nextLine().trim();
            System.out.print("Billing Zip : ");
                String billingZip = myScanner.nextLine().trim();

                //Ask for street information

            System.out.print("Shipping Street : ");
                String shippingStreet = myScanner.nextLine().trim();
            System.out.print("Shipping City : ");
                String shippingCity = myScanner.nextLine().trim();
            System.out.print("Shipping State : ");
                String shippingState = myScanner.nextLine().trim();
            System.out.print("Shipping Zip : ");
                String shippingZip = myScanner.nextLine().trim();
            addressCombine.append("Billing Address : \n");
            addressCombine.append(fullName + "\n");
            addressCombine.append(billingStreet + "\n");
            addressCombine.append(billingCity + ", " + billingState + " " + billingZip + "\n");
            addressCombine.append("Shipping Address : \n");
            addressCombine.append(shippingStreet + "\n");
            addressCombine.append(shippingCity + ", " + shippingState + " " + shippingZip + "\n");

            String myAddressBook = addressCombine.toString();
                System.out.println(myAddressBook);








    }


}
