package Football_GIT1;

/**
 * Created by KaZimad on 06.01.14.
 */
public class comand {


    public class Comand {
        private String name;
        private int games;
        private int goals;
        private int fails;
        private int scores;

        public Comand (String name, int games,int goals, int fails, int scores) {
            this.name = name;
            this.games = games;
            this.goals = goals;
            this.fails = fails;
            this.scores = scores;
        }
        public String getName (){
            return name;
        }
        public int getGames(){
            return games;
        }
        public int getGoals(){
            return goals;
        }
        public int getFails(){
            return fails;
        }
        public int getScores(){
            return scores;
        }
    }

}
