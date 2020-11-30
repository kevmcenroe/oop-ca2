// Kevin McEnroe GD2
package com.dkit.oop;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name:
 * <p>
 * Your GitHub link:
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");

        String[] facilities = {
                "mains water",
                "electricity",
                "freehold",
                "private access"
        };

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130);
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());

        System.out.println("Tax for p1 = " + p1.calculateTax());
        System.out.println("p1 facilities = " + p1.getFacilities().toString());
        p1.addFacility("electricity");
        System.out.println("p1 facilities with electricity added = " + p1.getFacilities().toString());
        p1.removeFacility("electricity");
        System.out.println("p1 facilities with electricity removed = " + p1.getFacilities().toString());

        System.out.println("Q2 - tests");


        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

