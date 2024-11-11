package Player;

import java.util.Random;

import main.Unit;

public class User extends Unit{
	private int power;
	
	public User(int hp, int mp, int level, int exp, int position) {
		super(hp, mp, level, exp, position);
	}
	
	public void attack(Unit monster) {
		Random ran = new Random();
		power = ran.nextInt(this.level*2)+1;
		monster.setHp(monster.getHp() - power);
		if(monster.getHp() < 0)
			monster.setHp(0);
		
		System.out.println("플레이어가 "+power+"만큼 공격!");
	}
}
