import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class example_7 {
    public static void main(String[] args ) {
        System.out.println("Example 7, Pre Lambda\n");

        List<RobotTeam> teams = RobotTeam.createTeamDatabase();
        Collections.sort(teams, new Comparator<RobotTeam>() {
            @Override
            public int compare(RobotTeam o1, RobotTeam o2) {
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
        });

        System.out.println(teams);
    }
}
