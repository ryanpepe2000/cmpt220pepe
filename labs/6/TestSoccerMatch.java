import java.util.Date;
import java.util.Scanner;

public class TestSoccerMatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of the home team: ");
		String homeTeam = input.nextLine();
		
		System.out.println("Enter the name of the visitor team: ");
		String visitorTeam = input.nextLine();
		
		// Creates a new soccer match object at the current date and time (Real Madrid vs Barcelona)
		SoccerMatch match = new SoccerMatch(new Date(), homeTeam, visitorTeam);
		
		// Populates both teams with 11 players with null data fields
		for (int i = 0; i < 11; i++)
			match.addHomePlayer(new Player());
		for (int i = 0; i < 11; i++)
			match.addVisitorPlayer(new Player());
		
		// Adds goals for the team which the user enters
		String cont = "y";
		
		
		// User-Controlled Loop that adds goal to a team and saves which player scored and when
		for (boolean stopper = true; stopper;) {
			System.out.println("Enter the name of the team who scored a goal: ");
			String team = readString();
	
			
			if (team.contentEquals(homeTeam)) {
				System.out.println("Which player in the list scored the goal (0-10): ");
				int player = input.nextInt();
				System.out.println("At what minute was the goal scored: ");
				int min = input.nextInt();
				match.addHomeGoal(new Goal(min, match.homePlayers[player]));
				
			}
			
			else if (team.contentEquals(visitorTeam)) {
				System.out.println("Which player in the list scored the goal (0-10): ");
				int player = input.nextInt();
				System.out.println("At what minute was the goal scored: ");
				int min = input.nextInt();
				match.addVisitorGoal(new Goal(min, match.visitorPlayers[player]));
				
			}
			
			// Asks the user if he would like to enter more goals or terminate the program
			while (true) {
				System.out.println("Would you like to enter another goal (y/n): ");
				cont = input.next();
				if (cont.contentEquals("n")) {
					stopper = false;
					break;
				} else if (cont.contentEquals("y")) { 
					stopper = true;
					break;
				} else {
					continue;
				}
			}	
		}
		
		input.close();
		// Prints the winner
		System.out.println("The winner of the match is: " + match.getWinner());
	}
	
	private static String readString() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
		
		
		
	}

}
