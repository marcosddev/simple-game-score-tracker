public class Main {
    public static void main(String[] args) {

        int lives = 3;
        int score = 100;
        int level = 1;
        int coins = 5;
        
        lives -=2;
        coins +=3;
        lives++;
        level++;
        coins -=4;
        
        System.out.println("Game Status:");
        System.out.println("-----------");
        System.out.println("Lives: " + lives);
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
    }
}
