// Kevin McEnroe GD2
package com.dkit.oop;

import java.util.ArrayList;

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

        Property propertyA = new Property(2, "Bob Smith", "A99B100", 200000, 110);
        Property propertyB = new Property(3, "John McEvoy", "A77B300", 100000, 80);
        Property propertyC = new Property(4, "Andrew Baker", "A88B200", 250000, 150);

        ArrayList<Property> properties = new ArrayList<Property>();
        properties.add(propertyA);
        properties.add(propertyB);
        properties.add(propertyC);

        //Property[] inputProperties = properties.toArray(n -> new Property[n]);
        displayAllProperties(properties);

        ArrayList<Property> propertiesAboveMinSellingPrice = getPropertiesPriceAbove(properties, 150000);
        System.out.println("Properties above 150000 : " + propertiesAboveMinSellingPrice.toString());





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

    private void displayAllProperties(ArrayList<Property> properties) {
        for(Property property : properties){
            System.out.println(property.getPropertyID() + " : " + property.getOwner() + " : " + property.getPostcode() + " : " + property.getSellingPrice() + " : " + property.getArea() + " : " + property.getFacilities().toString());
        }
    }

    private ArrayList<Property>	getPropertiesPriceAbove(ArrayList<Property> properties, double minSellingPrice)
    {
        ArrayList<Property> applicableProperties = new ArrayList<Property>();
        for(Property property : properties){
            if(property.getSellingPrice() > minSellingPrice)
                applicableProperties.add(property);
        }
        return applicableProperties;
    }
}

