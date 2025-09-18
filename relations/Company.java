class Company {
    public String ceoName;
    public CEO ceo;

    public Company(CEO ceo) {
        this.ceoName = ceo.name;
        this.ceo = ceo;
    }

    public void displayCompany() {
        ceo.ceoDetails();
    }
}