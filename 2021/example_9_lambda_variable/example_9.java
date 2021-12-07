import java.util.List;
import java.util.Comparator;

public class example_9 {
    public static void main(String[] args ) {
        System.out.println("Example 9, Comparator as a variable\n");

        List<RobotTeam> teams = RobotTeam.createTeamDatabase();
        final Comparator<RobotTeam> scoreCompare = ( RobotTeam o1, RobotTeam o2 ) ->
            o1.score() == o1.score() 
            ? 0
            : ( o1.score() < o2.score() ? 1 : -1 );

        teams.sort( scoreCompare );

        System.out.println(teams);
    }
}
