public class SoccerTeam extends Player {
    private  int jersey;
    public SoccerTeam(String playername,int jersey) {
        super(playername);
        this.jersey = jersey;
    }


    public void playerDetails(){
        System.out.println(getPlayername()+" with no. "+jersey+" has been selected in the team.");
    }

}
