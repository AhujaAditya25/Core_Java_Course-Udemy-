import java.util.ArrayList;

public class League<T extends Team> {

    private ArrayList<T> Teams_in_the_league = new ArrayList<>();

    public void AddTeams(T Team) {
        if (Teams_in_the_league.contains(Team)) {
            System.out.println("The team you are trying to add is already present.");
        } else {
            System.out.println("The team is added successfully");
            Teams_in_the_league.add(Team);
        }
    }
    public void PrintTeams(){
        for (int i = 0; i<Teams_in_the_league.size();i++){
            System.out.println("Teams in the league are: "+Teams_in_the_league.get(i).getTeamname());
        }
    }

}
