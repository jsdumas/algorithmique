package voterStrategy;

public interface StrategieVote {
    void initialiseVotes();

    void ajouteVote(Vote vote);

    boolean getResultat();
}
