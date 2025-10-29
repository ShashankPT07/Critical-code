package com.xworkz.crackers.external;

import com.xworkz.crackers.bridge.*;
import com.xworkz.crackers.internal.*;

public class CrackerRunner {
    public static void main(String[] args) {
        Cracker cracker = new CrackerImpl();
        cracker.CrackerName(new CrackerInfo("Sparklers", 150));
        cracker.Brand(new CrackerBrand(1001, "Standard Fireworks"));
        cracker.Price(new CrackerPrice(200, "Sparklers"));
        cracker.Quantity(new CrackerQuantity("Sparklers", 20));
        cracker.Type(new CrackerType("Light", "Sparklers"));
        System.out.println("---------------------------------");

        Brand brand = new BrandImpl();
        brand.CrackerName(new CrackerInfo("Flower Pots", 300));
        brand.Brand(new CrackerBrand(1002, "Sony Fireworks"));
        brand.Price(new CrackerPrice(400, "Flower Pots"));
        brand.Quantity(new CrackerQuantity("Flower Pots", 10));
        brand.Type(new CrackerType("Ground", "Flower Pots"));
        System.out.println("---------------------------------");

        Price price = new PriceImpl();
        price.CrackerName(new CrackerInfo("Rockets", 500));
        price.Brand(new CrackerBrand(1003, "Ajanta Fireworks"));
        price.Price(new CrackerPrice(700, "Rockets"));
        price.Quantity(new CrackerQuantity("Rockets", 5));
        price.Type(new CrackerType("Aerial", "Rockets"));
        System.out.println("---------------------------------");

        Quantity quantity = new QuantityImpl();
        quantity.CrackerName(new CrackerInfo("Atom Bombs", 600));
        quantity.Brand(new CrackerBrand(1004, "Ananda Fireworks"));
        quantity.Price(new CrackerPrice(900, "Atom Bombs"));
        quantity.Quantity(new CrackerQuantity("Atom Bombs", 15));
        quantity.Type(new CrackerType("Sound", "Atom Bombs"));
        System.out.println("---------------------------------");

        Type type = new TypeImpl();
        type.CrackerName(new CrackerInfo("Chakkars", 250));
        type.Brand(new CrackerBrand(1005, "Kaleeswari Fireworks"));
        type.Price(new CrackerPrice(350, "Chakkars"));
        type.Quantity(new CrackerQuantity("Chakkars", 25));
        type.Type(new CrackerType("Spinning", "Chakkars"));
        System.out.println("---------------------------------");
    }
}

