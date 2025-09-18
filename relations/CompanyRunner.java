class CompanyRunner {
    public static void main(String[] args) {
        CEO ceo = new CEO("Elon Musk");
        Company company = new Company(ceo);
        company.displayCompany();
    }
}
