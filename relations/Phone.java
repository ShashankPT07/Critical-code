class Phone {
    public String batteryType;
    public Battery battery;

    public Phone(Battery battery) {
        this.batteryType = battery.type;
        this.battery = battery;
    }

    public void displayPhone() {
        battery.displayBattery();
    }
}
