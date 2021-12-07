public class RobotTeam {
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
            "   \"canShootWell:\" " + String.valueOf(m_canShootWell)    + "\n"  +
        "}\n";
    }

    private int m_teamID;
    private String m_teamName;
    private boolean m_canClimb;
    private boolean m_canShootWell;
}
