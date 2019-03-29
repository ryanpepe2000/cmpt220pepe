
public class Player {
	String name;
	int goals;
	String team;
	
	Player(){}
	
	Player(String name, int goals, String team){
		this.name = name;
		this.goals = goals;
		this.team = team;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getTeam() {
		return this.team;
	}
	
	void setTeam(String team) {
		this.team = team;
	}
	
	int getGoals() {
		return this.goals;
	}
	
	void setGoals(int goals) {
		this.goals = goals;
	}
	
}
