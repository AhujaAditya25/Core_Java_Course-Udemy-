public class Main {
    public static void main(String[] args) {
        SoccerTeam Allisson = new SoccerTeam("Allisson",1);
        SoccerTeam VirgilvanDijk = new SoccerTeam("Virgil van Dijk",4);
        SoccerTeam Firmino = new SoccerTeam("Firmino",9);
        SoccerTeam SadioMane = new SoccerTeam("Sadio Mane",10);
        SoccerTeam MoSalah = new SoccerTeam("Mo Salah",11);


        Team<SoccerTeam>LiverpoolFC = new Team<>("LiverpoolFC");
        LiverpoolFC.Addplayers(Allisson);
        LiverpoolFC.Addplayers(VirgilvanDijk);
        LiverpoolFC.Addplayers(Firmino);
        LiverpoolFC.Addplayers(SadioMane);
        LiverpoolFC.Addplayers(MoSalah);

        LiverpoolFC.TotalPlayers();

        League<Team>PremierLeague = new League<>();
        PremierLeague.AddTeams(LiverpoolFC);
        PremierLeague.PrintTeams();
    }
}
