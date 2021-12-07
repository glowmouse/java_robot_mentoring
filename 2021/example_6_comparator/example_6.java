import java.util.List;
import java.util.Collections;

public class example_6 {
    public static void main(String[] args ) {
        System.out.println("Example 6, Sorting using a Comparator\n");

        List<RobotTeam> teams = RobotTeam.createTeamDatabase();
        Collections.sort(teams, new RobotTeamComparator() );

        System.out.println(teams);
    }
}
