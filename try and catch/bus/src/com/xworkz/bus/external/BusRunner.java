package com.xworkz.bus.external;

import com.xworkz.bus.internal.Bus;

public class BusRunner {
    public static void main(String[] args) {

        Bus bus = new Bus();

        bus.checkSpeed(120);
        bus.checkSeats(10);
        bus.checkRoute("Unknown");
        bus.checkType("FlyingBus");
        bus.checkPrice(15000000);
    }
}
