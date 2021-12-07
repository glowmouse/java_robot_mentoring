public class RobotTeam {
    RobotTeam( int teamID, String teamName, boolean canClimb, boolean canShootWell )
    {
       m_teamID = teamID;
       m_teamName = teamName;
       m_canClimb = canClimb;
       m_canShootWell = canShootWell;
    }

    private int m_teamID;
    private String m_teamName;
    private boolean m_canClimb;
    private boolean m_canShootWell;
}
