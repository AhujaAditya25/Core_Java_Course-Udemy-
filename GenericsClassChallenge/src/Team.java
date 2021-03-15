import java.util.ArrayList;

public class Team<T extends Player> {
    private String Teamname;

    public Team(String teamname) {
        this.Teamname = teamname;
    }

    public String getTeamname() {
        return Teamname;
    }

    public ArrayList<T>team= new ArrayList<>();

public void Addplayers(T player){
    if (team.contains(player)){
        System.out.println("The player you are trying to add, has been added previously.\n" +
                " Players can't be added twice.");
    }
    else team.add(player);
    System.out.println("Player added successfully.");
 }

 public void TotalPlayers(){
     System.out.println("The team currently has players by numbers mentioned below: ");
     System.out.println(team.size());
 }


}
