
public class GameCharacter {
	String name;
	int hp;
	static int payGold=1000;
	
	void showStatus() {
		System.out.println(this.name+"/HP："+this.hp);
	}
	
	void showGold() {
		System.out.println("パーティの所持金："+payGold+"G");
	}
}
