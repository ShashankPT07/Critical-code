 class HairStyle {
    public HairStyle() {
        System.out.println("There is a hairstyle");
    }

    public HairStyle(int styleId) {
        styleId = 301;
        System.out.println("Style ID: " + styleId);
    }

    public HairStyle(int styleId, String styleName) {
        styleName = "Curly";
        System.out.println("Style Name: " + styleName);
    }

    public HairStyle(int styleId, String styleName, char hairType) {
        hairType = 'C'; 
        System.out.println("Hair Type: " + hairType);
    }

    public HairStyle(int styleId, String styleName, char hairType, boolean isTrending) {
        isTrending = true;
        System.out.println("Is Trending: " + isTrending);
    }

    public HairStyle(int styleId, String styleName, char hairType, boolean isTrending, long popularityScore) {
        popularityScore = 9999L;
        System.out.println("Popularity Score: " + popularityScore);
    }

    public HairStyle(int styleId, String styleName, char hairType, boolean isTrending, long popularityScore, double price) {
        price = 75.50;
        System.out.println("Price: + price);
    }

    public HairStyle(int styleId, String styleName, char hairType, boolean isTrending, long popularityScore, double price, float rating) {
        rating = 4.8f;
        System.out.println("Customer Rating: " + rating);
    }
}
