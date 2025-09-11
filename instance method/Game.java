class Game {

    public int[] gameIds = {101, 102, 103, 104};

    public void showGameIds() {
        System.out.println(gameIds.length);
        for (int num = 0; num < gameIds.length; num++) {
            System.out.println("Game ID: " + gameIds[num]);
        }
    }
}