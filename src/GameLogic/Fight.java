package GameLogic;
import WorldObjeckt.AnimateObj.*;
import Utilits.Rand;

public class Fight {
	public static void blow(Creature first, Creature second) {
		if (chanceOfDodget(second.getParameters().getParry()))
			System.out.println(first.getName() +" промахнулся по " +second.getName());
		else {
			second.getParameters().changeHealPoints(-(CalculationDamage.givesDamage(first, second)));
		//	damage = (int) (damage * 2.5);
			System.out.println(first.getName() +" попал по " +second.getName() +" и нанес " +CalculationDamage.givesDamage(first, second));
			System.out.println(first.getName() +" " +first.getParameters().getHealPoints());
		}
		if(first.getParameters().getHealPoints() > 0 && second.getParameters().getHealPoints() > 0)
			blow(second, first);
		else
			System.out.println(first.getParameters().getHealPoints() > 0 ? first.getName() : second.getName());
	}
	
	public static boolean chanceOfDodget(int parry) {return Rand.getRandWithNull(1000) + 1 <= parry;}
}
