
public class Goal {
	int minute;
	Player player;
	
	Goal(){}
	
	Goal(int minute, Player player){
		this.minute = minute;
		this.player = player;
	}
	
	int getMinute() {
		return this.minute;
	}
	
	void setMinute(int minute) {
		this.minute = minute;
	}
	
	Player getPlayer() {
		return this.player;
	}
	
	void setPlayer(Player player) {
		this.player = player;
	}
}
