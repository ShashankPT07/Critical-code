class PhoneRunner {
    public static void main(String[] args) {
        Battery battery = new Battery("Li-Ion 4000mAh");
        Phone phone = new Phone(battery);
        phone.displayPhone();
    }
}