import java.util.List;

public class example_8 {
    public static void main(String[] args ) {
        System.out.println("Example 8, Full Lambdas\n");

        List<RobotTeam> teams = RobotTeam.createTeamDatabase();

        teams.sort( (RobotTeam o1, RobotTeam o2 ) ->
            o1.score() == o1.score() 
                ? 0
                : ( o1.score() < o2.score() ? 1 : -1 )
        );

        System.out.println(teams);
    }
}
