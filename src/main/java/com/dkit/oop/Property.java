// Kevin McEnroe GD2
package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;

    private ArrayList<String> facilities = new ArrayList<String>();

    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
    }

    public Property(int propertyID, String owner, String postcode, double area)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = 0;
        this.area = area;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        Property compareProperty = (Property)obj;
        if(this.propertyID == compareProperty.propertyID && this.owner == compareProperty.owner)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyID=" + propertyID +
                ", owner='" + owner + '\'' +
                ", postcode='" + postcode + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", facilities=" + facilities +
                '}';
    }

    /*6.	Add a method calculateTax() to calculate and return the yearly property tax for a property. This is calculated as the area in square metres multiplied by 2.2 and added to a fixed basic property charge of €15.
*/
    public double calculateTax()
    {
        int propertyCharge = 15;
        double areaMultiplier = 2.2;
        double tax = (this.area * areaMultiplier) + propertyCharge;
        return tax;
    }

    public void addFacility(String facility)
    {
        this.facilities.add(facility);
    }

    public void removeFacility(String facility)
    {
        this.facilities.remove(facility);
    }

    public ArrayList<String> getFacilities() {
        return facilities;
    }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

}
