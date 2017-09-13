public class Main implements Runnable {
    static int goals = 0;
    static int team1 = 0;
    static int team2 = 0;
    static int rounds = 50;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Main()).start();
        game(1);

        Thread.sleep(50);
        System.out.println("team1 "+String.valueOf(team1)+ "\nTeam2 "+String.valueOf(team2));
        if(team1==team2)System.out.println("Draw");
        if(team1>team2)System.out.println("team1 Win");
        if(team1<team2)System.out.println("team2 Win");
    }

    @Override
    public void run() {
        game(2);
    }

    public static void game(int team){
        while(goals<rounds){
            if(team == 1)team1++;else team2++;
            goals++;
            System.out.println("team: "+ String.valueOf(team)+" goal in round "+String.valueOf(goals));

        }
        System.out.println("team: "+ String.valueOf(team)+" finish ");

    }

}
