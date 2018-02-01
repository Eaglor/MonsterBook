package model;

public class Creature extends Race {
	private Type type;
	private Race race;
	private String abilities;
	private String profession;
	private String skills;

	public Creature() {
		this.race = race;
		this.abilities = abilities;
		this.profession = profession;
		this.skills = skills;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public String getAbilities() {
		return abilities;
	}

	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
