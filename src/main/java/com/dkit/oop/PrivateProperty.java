// Kevin McEnroe GD2
package com.dkit.oop;

import java.util.Objects;

public class PrivateProperty extends Property
{
    int numBeds;
    String propertyType;


    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area) {
        super(propertyID, owner, postcode, sellingPrice, area);
        this.numBeds = numBeds;
        this.propertyType = propertyType;
    }

    public PrivateProperty(int propertyID, String owner, String postcode, double area, int numBeds,
                           String propertyType) {
        super(propertyID, owner, postcode, area);
        this.numBeds = numBeds;
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyID=" + super.getPropertyID() +
                ", owner='" + super.getOwner() + '\'' +
                ", postcode='" + super.getPostcode() + '\'' +
                ", sellingPrice=" + super.getSellingPrice() +
                ", area=" + super.getArea() +
                ", facilities=" + super.getFacilities().toString() +
                ", numBeds=" + this.numBeds +
                ", propertyType=" + this.propertyType +
                '}';
    }

    public int getNumBeds() {
        return numBeds;
    }

    public String getPropertyType() {
        return propertyType;
    }
/* Equals should be dealt with by calling the super class and reaching into the object's owner and propertyID values
    These values should be compared against the same values in the comparison object
    If both values are in fact equal, return true. If this is not the case, return false.

    Hashcode should generate a series of characters informed by the object's own identifier and the super class.
    This Hashcode is expected be the same for all instances as they direct to the same point in memory
    */

    public double calculateTax()
    {
        double areaMultiplier = 2.2;
        double bedroomMultiplier = 25;
        double tax = (this.getArea() * areaMultiplier) + (this.getNumBeds() * bedroomMultiplier);
        return tax;
    }
}
