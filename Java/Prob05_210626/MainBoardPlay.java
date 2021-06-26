package Prob05_210626;

public class MainBoardPlay  {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvancedLevel alevel = new AdvancedLevel();
        player.upgradeLevel(alevel);
        player.play(2);

        SuperLevel slevel = new SuperLevel();
        player.upgradeLevel(slevel);
        player.play(3);
    }
}
