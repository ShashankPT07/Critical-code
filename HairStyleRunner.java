class HairStyleRunner {
    public static void main(String[] args) {
        new HairStyle();
        new HairStyle(1);
        new HairStyle(1, "Bob Cut");
        new HairStyle(1, "Bob Cut", 'S');
        new HairStyle(1, "Bob Cut", 'S', false);
        new HairStyle(1, "Bob Cut", 'S', false, 12345L);
        new HairStyle(1, "Bob Cut", 'S', false, 12345L, 80.0);
        new HairStyle(1, "Bob Cut", 'S', false, 12345L, 80.0, 4.5f);
    }
}
