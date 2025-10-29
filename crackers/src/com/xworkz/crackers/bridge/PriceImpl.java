package com.xworkz.crackers.bridge;


import com.xworkz.crackers.internal.*;

public class PriceImpl implements Price {
    @Override
    public CrackerInfo CrackerName(CrackerInfo crackerInfo) {
        System.out.println("This is subclass: " + CrackerInfo.name + " - " + CrackerInfo.cost);
        return crackerInfo;
    }

    @Override
    public CrackerBrand Brand(CrackerBrand crackerBrand) {
        System.out.println("This is 2nd subclass: " + CrackerBrand.brandId + " - " + CrackerBrand.brandName);
        return crackerBrand;
    }

    @Override
    public CrackerPrice Price(CrackerPrice crackerPrice) {
        System.out.println("This is 3rd subclass: " + CrackerPrice.price + " - " + CrackerPrice.name);
        return crackerPrice;
    }

    @Override
    public CrackerQuantity Quantity(CrackerQuantity crackerQuantity) {
        System.out.println("This is 4th subclass: " + CrackerQuantity.name + " - " + CrackerQuantity.quantity);
        return crackerQuantity;
    }

    @Override
    public CrackerType Type(CrackerType crackerType) {
        System.out.println("This is 5th subclass: " + CrackerType.type + " - " + CrackerType.name);
        return crackerType;
    }
}
