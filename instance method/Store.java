class Store {

    public String[] storeNames = {"MegaMart", "FreshShop", "DailyNeeds", "EcoStore"};

    public void printStoreNames() {
        System.out.println(storeNames.length);
        for (int num = 0; num < storeNames.length; num++) {
            System.out.println("Store Name: " + storeNames[num]);
        }
    }
}


