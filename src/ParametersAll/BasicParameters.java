package ParametersAll;

/**
 * Created by nimtego_loc on 27.11.2016.
 */

public class BasicParameters {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int knowledge;
    private int luck;

    private BasicParameters() {

    }

    public static Builder newBuilder() {return new BasicParameters().new Builder();}

    public class Builder {
        private Builder(){

        }
        public Builder setStrength(final int strength) {
            BasicParameters.this.strength = strength;
            return this;
        }
        public Builder setDexterity(final int dexterity) {
            BasicParameters.this.dexterity = dexterity;
            return this;
        }
        public Builder setConstitution(final int constitution) {
            BasicParameters.this.constitution = constitution;
            return this;
        }
        public Builder setIntelligence(final int intelligence) {
            BasicParameters.this.intelligence = intelligence;
            return this;
        }
        public Builder setWisdom(final int wisdom) {
            BasicParameters.this.wisdom = wisdom;
            return this;
        }
        public Builder setKnowlege(final int knowledge) {
            BasicParameters.this.knowledge = knowledge;
            return this;
        }
        public Builder setLuck(final int luck) {
            BasicParameters.this.luck = luck;
            return this;
        }
        public BasicParameters build() {return BasicParameters.this;}
    }
    public int getStrength() {return strength;}
    public void setStrength(int strength) {this.strength = strength;}
    public int getDexterity() {return dexterity;}
    public void setDexterity(int dexterity) {this.dexterity = dexterity;}
    public int getConstitution() {return constitution;}
    public void setConstitution(int constitution) {this.constitution = constitution;}
    public int getIntelligence() {return intelligence;}
    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
    public int getWisdom() {return wisdom;}
    public void setWisdom(int wisdom) {this.wisdom = wisdom;}
    public int getKnowledge() {return knowledge;}
    public void setKnowledge(int knowledge) {this.knowledge = knowledge;}
    public int getLuck() {return luck;}
    public void setLuck(int luck) {this.luck = luck;}
}
