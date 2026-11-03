
public class Exp26_1 {

	public static void main(String[] args) {
		Warrior warrior=new Warrior();
		Mage mage=new Mage();
		
		warrior.name="アーサー";
		warrior.hp=120;
		
		mage.name="メル";
		mage.hp=80;
		
		Warrior.payGold+=500;
		
		warrior.showStatus();
		mage.showStatus();
		System.out.println();
		warrior.showGold();
		mage.showGold();
	}

}
