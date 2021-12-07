import java.util.Comparator;

class RobotTeamComparator implements Comparator<RobotTeam> {

    @Override
    public int compare( RobotTeam o1, RobotTeam o2 )
    {
        int o1Score = o1.score();
        int o2Score = o2.score();       

        if ( o1Score < o2Score ) {
            return 1;
        }
        if ( o1Score > o2Score ) {
            return -1;
        }              
        return 0;  // must be equal
    }
}
