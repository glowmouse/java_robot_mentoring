import java.util.List;
import java.util.Collections;

public class example_5 {
    public static void main(String[] args ) {
        System.out.println("Example 5, Scoring + Sorting\n");

        List<RobotTeam> teams = RobotTeam.createTeamDatabase();
        Collections.sort(teams);

        System.out.println(teams);
    }
}
