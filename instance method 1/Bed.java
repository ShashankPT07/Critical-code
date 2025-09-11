 class Bed {

    public String brand = "SleepWell";
    public char size = 'Q'; 
    public boolean isComfortable = true;
    public int lengthInCm = 200;
    public long serialNumber = 9876543210L;
    public float heightInFeet = 2.5F;
    public double price = 15999.99;

    public String showBrand() {
        System.out.println(brand);
        return brand;
    }

    public char showSize() {
        System.out.println(size);
        return size;
    }

    public boolean showIsComfortable() {
        System.out.println(isComfortable);
        return isComfortable;
    }

    public int showLengthInCm() {
        System.out.println(lengthInCm);
        return lengthInCm;
    }

    public long showSerialNumber() {
        System.out.println(serialNumber);
        return serialNumber;
    }

    public float showHeightInFeet() {
        System.out.println(heightInFeet);
        return heightInFeet;
    }

    public double showPrice() {
        System.out.println(price);
        return price;
    }
}
