package ParametersAll;

public class Parameters {

	private int lvl = 0;
	private int exp = 0;
	private int maxHealPoints = 0;
	private int healPoints = 0;
	private int pAtack = 0;
	private int mAtack = 0;
	private int pDef = 0;
	private int mDef = 0;
	private int block = 0;
	private int parry = 0;
	private int critChance = 0;
	private int powerOfCrit = 0;
	private int speedAtack = 0;
	public Parameters() {}
	public Parameters(int healPoints, int pAtack, int lvl) {
		setHealPoints(healPoints);
		setPAtack(pAtack);
		setLvl(lvl);
	}
//name, healPoints, pAtack, mAtack, pDef, mDef, block, parry, 
//	critChens, powerOfCrit, speedAtack
	public Parameters(int healPoints, int pAtack, int lvl, int exp) {
		this(healPoints, pAtack, (lvl / 10 * 2), (lvl / 15  * 2 ), (lvl / 20 * 2), 0, 0, (lvl / 10 + 1), ( lvl / 10 + 120), 1);
		this.lvl = lvl;
		this.exp = exp;
	}

	public Parameters(int healPoints, int pAtack, int mAtack, int pDef, int mDef, int block, int parry, int critChens, int powerOfCrit, int speedAtack) {
		this.maxHealPoints = this.healPoints = healPoints;
		this.pAtack = pAtack;
		this.mAtack = mAtack;
		this.pDef = pDef;
		this.mDef = mDef;
		this.block = block;
		this.parry = parry;
		this.critChance = critChens;
		this.powerOfCrit = powerOfCrit;
		this.speedAtack = speedAtack;
	}
	public void changeHealPoints(int heal) {setHealPoints(getHealPoints() + heal);}
	public void changeHealPoints1(int heal) {    // хилл и + нанесение дамага
		healPoints += getHealPoints() + heal > getMaxHealPoints() ? (maxHealPoints - healPoints) : heal;
		if (healPoints < 0)
			healPoints = 0;
	}

	public void changeExp(int exp) { 
		setExp(getExp() + exp);
		calculateLvlUp();
	}

	private void calculateLvlUp() { 
		if (getExp() > expToNextLvl()) {
			exp -= expToNextLvl();
			lvl++;
			System.out.println("\n***** Lvl UP *****\n" +"***** " +getLvl() +" LVL *****");
			lvlUp();
			calculateLvlUp();
		}
	}

	public int expToNextLvl() {
		return lvl * lvl * lvl + (lvl * 10) * (8 * lvl) + 5;
	}

	private void lvlUp() {
		setMaxHealPoints(getMaxHealPoints() + ((getLvl() * 2) + 9 / 2));
		changeHealPoints(getMaxHealPoints());
		setPAtack(getPAtack() + (getLvl() / 6 + getLvl() / 7));
		setMAtack(getMAtack() + (getLvl() / 8 + getLvl() / 10) / 2);
		setPDef(getPDef() + (getLvl() % 3 == 0 ? 2 : (getLvl() / 4)));
		setMDef(getMDef() + (getLvl()  % 5 == 0 ? 1 : (getLvl() / 9)));
		setBlock(getBlock() + (getLvl() % 25 == 0 ? 1 : 0));
		setParry(getParry() + (getLvl() % 15 == 0 ? 1 : 0));
	}

	public void setLvl(int lvl) {this.lvl = lvl;}
	public void setExp(final int exp) {this.exp = exp;}
	public void setHealPoints(int healPoints) {this.healPoints =  healPoints;}
	public void setMaxHealPoints(int maxHealPoints) {this.maxHealPoints = maxHealPoints;}
	public void setPAtack(int pAtack) {this.pAtack = pAtack;}
	public void setMAtack(int mAtack) {this.mAtack = mAtack;}
	public void setPDef(int pDef) {this.pDef = pDef;}
	public void setMDef(int mDef) {this.mDef = mDef;}
	public void setBlock(int block) {this.block = block;}
	public void setParry(int parry) {this.parry = parry;}
	public void setCritChens(int critChens) {this.critChance = critChens;}
	public void setPowerOfCrit(int powerOfCrit) {this.powerOfCrit = powerOfCrit;}
	public void setSpeedAtack(int speedAtack) {this.speedAtack = speedAtack;}
	public int getLvl() {return lvl;}
	public int getExp() {return exp;}
	public int getHealPoints() {return healPoints;}
	public int getMaxHealPoints() {return maxHealPoints;}
	public int getPAtack() {return pAtack;}
	public int getMAtack() {return mAtack;}
	public int getPDef() {return pDef;}
	public int getMDef() {return mDef;}
	public int getBlock() {return block;}
	public int getParry() {return parry;}
	public int getCritChens() {return critChance;}
	public int getPowerOfCrit() {return powerOfCrit;}
	public int getSpeedAtack() {return speedAtack;}

}
