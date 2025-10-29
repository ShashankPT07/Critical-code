package com.xworkz.crackers.bridge;

import com.xworkz.crackers.internal.*;

public interface Type {
    CrackerInfo CrackerName(CrackerInfo crackerInfo);
    CrackerBrand Brand(CrackerBrand crackerBrand);
    CrackerPrice Price(CrackerPrice crackerPrice);
    CrackerQuantity Quantity(CrackerQuantity crackerQuantity);
    CrackerType Type(CrackerType crackerType);
}
