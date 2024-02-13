public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    
    public static int gamesPlayed;
    public static int totalGoalsScored; 

    public SoccerTeam() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        gamesPlayed++;
        totalGoalsScored += (myScore+otherScore);
        if (myScore>otherScore) {
            this.wins += 1;
            other.losses += 1;
        }
        else if (myScore<otherScore) {
            this.losses += 1;
            other.wins += 1;
        }
        else if (myScore == otherScore) {
            this.ties += 1;
            other.ties += 1;
        }
    }

    public int getTeamPoints() {
        int f = 0;
        f += this.ties;
        f += 3*(this.wins);
        return f;
    }

    public void resetPoints() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0; 
    }

    public void startTournament() {
        gamesPlayed = 0;
        totalGoalsScored = 0;
    }

    public static int getTotalGamesPlayed() {
        return gamesPlayed;
    }

    public static int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public static void main(String[] args) {
        SoccerTeam TeamA = new SoccerTeam();
        SoccerTeam TeamB = new SoccerTeam();
        SoccerTeam TeamC = new SoccerTeam();
        SoccerTeam TeamD = new SoccerTeam();
        TeamA.startTournament();
        TeamA.played(TeamC, 1, 9);
        TeamD.played(TeamB, 19, 4);
        TeamB.played(TeamB, 18, 3);
        TeamC.played(TeamA, 15, 1);
        TeamD.played(TeamA, 20, 20);
        System.out.println("Team A Tournament 1 points: " + TeamA.getTeamPoints());
        System.out.println("Team B Tournament 1 points: " + TeamB.getTeamPoints());
        System.out.println("Team C Tournament 1 points: " + TeamC.getTeamPoints());
        System.out.println("Team D Tournament 1 points: " + TeamD.getTeamPoints());
        System.out.println("Total Tournament 1 Games Played: " + getTotalGamesPlayed());
        System.out.println("Total Tournament 1 Goals Scored: " + getTotalGoalsScored());

        System.out.println();
        TeamA.resetPoints();
        TeamB.resetPoints();
        TeamC.resetPoints();
        TeamD.resetPoints();


        TeamA.startTournament();
        TeamC.played(TeamB, 7, 16);
        TeamD.played(TeamA, 18, 6);
        TeamB.played(TeamC, 25, 0);
        TeamA.played(TeamB, 30, 12);
        TeamD.played(TeamD, 10, 10);
        TeamC.played(TeamB, 0, 0);
        System.out.println("Team A Tournament 2 points: " + TeamA.getTeamPoints());
        System.out.println("Team B Tournament 2 points: " + TeamB.getTeamPoints());
        System.out.println("Team C Tournament 2 points: " + TeamC.getTeamPoints());
        System.out.println("Team D Tournament 2 points: " + TeamD.getTeamPoints());
        System.out.println("Total Tournament 2 Games Played: " + getTotalGamesPlayed());
        System.out.println("Total Tournament 2 Goals Scored: " + getTotalGoalsScored());
    }

}