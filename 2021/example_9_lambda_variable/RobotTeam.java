import java.util.ArrayList;

public class RobotTeam implements Comparable<RobotTeam>  {
    RobotTeam( int teamID, String teamName, boolean canClimb, boolean canShootWell )
    {
       m_teamID = teamID;
       m_teamName = teamName;
       m_canClimb = canClimb;
       m_canShootWell = canShootWell;
    }

    @Override
    public String toString()
    {
       return "{\n" +
            "   \"teamNumber\":   " + String.valueOf(m_teamID)          + ",\n" +
            "   \"teamName\":     " + "\"" + m_teamName + "\""          + ",\n" +
            "   \"canClimb\":     " + String.valueOf(m_canClimb)        + ",\n" +
            "   \"canShootWell:\" " + String.valueOf(m_canShootWell)    + ",\n"  +
            "   \"score:\"        " + String.valueOf(score())           + "\n"  +            
        "}\n";
    }


    static ArrayList<RobotTeam> createTeamDatabase() {
        ArrayList<RobotTeam> teams = new ArrayList<RobotTeam>();
        teams.add(new RobotTeam(865,    "Warp 7",                   true, true));

        // Four random teams with cool sounding names.  
        // Capabilies are basically a truth table to get coverage of all states
        teams.add(new RobotTeam(1325,   "Inverse Paradox",          true, true));
        teams.add(new RobotTeam(8073,   "Electron Affinity",        true, false));
        teams.add(new RobotTeam(6865,   "Manitoulin Metal 6865",    false, true));        
        teams.add(new RobotTeam(4917,   "Sir Lancerbot",            false, false));   
        
        return teams;
    }


    public int score()
    {
        int teamScore = 0;
        if ( m_canClimb)  {
            teamScore += 50;        // Climbing is huge
        }      
        if ( m_canShootWell ) {
            teamScore += 25;        // Shooting is good too, but climbing is king
        }
        return teamScore;
    }    

    @Override
    public int compareTo(RobotTeam other)  {
        int myScore = score();
        int otherScore = other.score();

        if ( myScore < otherScore ) {
            return 1;
        }
        if ( myScore > otherScore ) {
            return -1;
        }              
        return 0;  // must be equal
    }

    private int m_teamID;
    private String m_teamName;
    private boolean m_canClimb;
    private boolean m_canShootWell;
}
