 class Restaurant {

    public String name = "Food Haven";
    public char grade = 'A';
    public boolean isOpen = true;
    public int numberOfStaff = 25;
    public long annualCustomers = 500000L;
    public float averageMealPrice = 249.99F;
    public double totalRevenue = 12500000.75;

    public String showName() {
        System.out.println(name);
        return name;
    }

    public char showGrade() {
        System.out.println(grade);
        return grade;
    }

    public boolean showIsOpen() {
        System.out.println(isOpen);
        return isOpen;
    }

    public int showNumberOfStaff() {
        System.out.println(numberOfStaff);
        return numberOfStaff;
    }

    public long showAnnualCustomers() {
        System.out.println(annualCustomers);
        return annualCustomers;
    }

    public float showAverageMealPrice() {
        System.out.println(averageMealPrice);
        return averageMealPrice;
    }

    public double showTotalRevenue() {
        System.out.println(totalRevenue);
        return totalRevenue;
    }
}
