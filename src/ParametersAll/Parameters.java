package ParametersAll;

public class Parameters {
	private BasicParameters basicParameters;
	private int lvl;
	private int exp;
	private int maxHealPoints;
	private int healPoints;
    private int maxPAttack;
	private int minPAttack;
	private int maxMAttack;
    private int minMAttack;
	private int pDef;
	private int mDef;
	private int block;
	private int parry;
	private int critChance;
	private int powerOfCrit;
	private int speedAttack;

	public Parameters() {
		this.basicParameters = BasicParameters.newBuilder().strength(5).
                                constitution(5).dexterity(5).intelligence(5).
                                    knowlege(5).wisdom(5).luck(5).build();
        this.lvl = 0;
        this.exp = 0;
        calculateParametersFromBasic();
	}
	public Parameters(BasicParameters basicParameters) {
		this.basicParameters = basicParameters;
		calculateParametersFromBasic();
	}

	private void calculateParametersFromBasic() {
        this.maxHealPoints = 10 + basicParameters.getConstitution()*10 +
                            (basicParameters.getConstitution() % 10 == 0 ? 10 : 0) + lvl * 5;
        this.healPoints = maxHealPoints;
        this.maxPAttack = basicParameters.getStrength() / 2;
		this.minPAttack = maxPAttack / 2 + maxPAttack / 2;
		this.maxMAttack = basicParameters.getIntelligence() / 3;
		this.minMAttack = maxMAttack / 3 + maxMAttack / 3;
		this.critChance = (basicParameters.getDexterity() / 10) * (basicParameters.getLuck() / 5);
		this.powerOfCrit = basicParameters.getDexterity() / 4 * (basicParameters.getLuck() / 20);
		this.speedAttack = 1;
		this.pDef = 1;
		this.mDef = 1;
		this.block = 1;
		this.parry = 1;

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
//			lvlUp();
			calculateLvlUp();
		}
	}

	public int expToNextLvl() {
		return lvl * lvl * lvl + (lvl * 10) * (8 * lvl) + 5;
	}

/**	private void lvlUp() {
		setMaxHealPoints(getMaxHealPoints() + ((getLvl() * 2) + 9 / 2));
		changeHealPoints(getMaxHealPoints());
		setPAtack(getPAtack() + (getLvl() / 6 + getLvl() / 7));
		setMAtack(getMAtack() + (getLvl() / 8 + getLvl() / 10) / 2);
		setPDef(getPDef() + (getLvl() % 3 == 0 ? 2 : (getLvl() / 4)));
		setMDef(getMDef() + (getLvl()  % 5 == 0 ? 1 : (getLvl() / 9)));
		setBlock(getBlock() + (getLvl() % 25 == 0 ? 1 : 0));
		setParry(getParry() + (getLvl() % 15 == 0 ? 1 : 0));
	}*/
	public BasicParameters getBasicParameters() {
		return basicParameters;
	}

	public void setBasicParameters(BasicParameters basicParameters) {
		this.basicParameters = basicParameters;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getMaxHealPoints() {
		return maxHealPoints;
	}
	public void setMaxHealPoints(int maxHealPoints) {
		this.maxHealPoints = maxHealPoints;
	}
	public int getHealPoints() {
		return healPoints;
	}
	public void setHealPoints(int healPoints) {
		this.healPoints = healPoints;
	}
	public int getMaxPAttack() {
		return maxPAttack;
	}
	public void setMaxPAttack(int maxPAttack) {
		this.maxPAttack = maxPAttack;
	}
	public int getMinPAttack() {
		return minPAttack;
	}
	public void setMinPAttack(int minPAttack) {
		this.minPAttack = minPAttack;
	}
	public int getMaxMAttack() {
		return maxMAttack;
	}
	public void setMaxMAttack(int maxMAttack) {
		this.maxMAttack = maxMAttack;
	}
	public int getMinMAttack() {
		return minMAttack;
	}
	public void setMinMAttack(int minMAttack) {
		this.minMAttack = minMAttack;
	}
	public int getpDef() {
		return pDef;
	}
	public void setpDef(int pDef) {
		this.pDef = pDef;
	}
	public int getmDef() {
		return mDef;
	}
	public void setmDef(int mDef) {
		this.mDef = mDef;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getParry() {
		return parry;
	}
	public void setParry(int parry) {
		this.parry = parry;
	}
	public int getCritChance() {
		return critChance;
	}
	public void setCritChance(int critChance) {
		this.critChance = critChance;
	}
	public int getPowerOfCrit() {
		return powerOfCrit;
	}
	public void setPowerOfCrit(int powerOfCrit) {
		this.powerOfCrit = powerOfCrit;
	}
	public int getSpeedAttack() {
		return speedAttack;
	}
	public void setSpeedAttack(int speedAttack) {
		this.speedAttack = speedAttack;
	}
}
