import java.util.ArrayList;

public class example_3 {
    public static void main(String[] args ) {
        System.out.println("Example 3, Using an ArrayList\n");

        ArrayList<RobotTeam> teams = RobotTeam.createTeamDatabase();
        System.out.println(teams);
    }
}
