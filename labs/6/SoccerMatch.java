import java.util.Date;

public class SoccerMatch {
	Date startTime;
	Date endTime;
	String location;
	String home;
	String visitor;
	Player[] homePlayers = new Player[11];
	Player[] visitorPlayers = new Player[11];
	Goal[] homeGoals = new Goal[10];
	Goal[] visitorGoals = new Goal[10];
	
	SoccerMatch() {}
	
	SoccerMatch(Date startTime, String home, String visitor) {
		this.startTime = startTime;
		this.home = home;
		this.visitor = visitor;
	}
	
	void addHomePlayer(Player p) {
		for (int i = 0; i < 11; i++) {
			if (this.homePlayers[i] == null)
				this.homePlayers[i] = p;
		}
	}
	
	void addVisitorPlayer(Player p) {
		for (int i = 0; i < 11; i++) {
			if (this.visitorPlayers[i] == null)
				this.visitorPlayers[i] = p;
		}
	}
	
	String getWinner() {
		
		int totalHomeGoals = 0;
		int totalVisitorGoals = 0;
		for (int i = 0; i < 10; i++) {
			if (this.homeGoals[i] != null)
				totalHomeGoals++; 
			if (this.visitorGoals[i] != null)
				totalVisitorGoals++;
		}
		
		if (totalHomeGoals > totalVisitorGoals)
			return this.home;
		else if (totalVisitorGoals > totalHomeGoals)
			return this.visitor;
		else
			return "tie";
	}
	
	void addHomeGoal(Goal g) {
		for (int i = 0; i < 10; i++) 
			if (this.homeGoals[i] == null) {
				this.homeGoals[i] = g;
				break;
			}
		}
	
	void addVisitorGoal(Goal g) {
		for (int i = 0; i < 10; i++) 
			if (this.visitorGoals[i] == null) {
				this.visitorGoals[i] = g;
				break;
			}
	}
	
	Goal[] getHomeGoals() {
		return this.homeGoals;
	}
	
	Goal[] getVisitorGoals() {
		return this.visitorGoals;
	}
	
	
}
