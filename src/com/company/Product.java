package com.company;

public class Product {
    String ProductName;
    String RecipientCountry;
    String SenderCountry;
    double Weight;
    double Barcode;

    public Product ( String ProductName,String RecipientCountry, String SenderCountry,
                     double Weight, double Barcode) {
    }

    public String getInfo()  {

        return " The product's name " + ProductName + " " + RecipientCountry
                + " " + SenderCountry + " " + " Product weight " + " " + Weight
                + " " + " Barcode product" + " " + Barcode;
    }
}
