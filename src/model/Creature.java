package model;

import java.util.HashMap;

public class Creature extends Race {
	private Type type;
	private Race race;
	private String name;
	private String abilities;
	private String profession;
	private String skills;
	private String creature;

	public Creature(Type type, Race race, String name) {
		this.type = type;
		this.race = race;
		this.name = name;
		// this.abilities = abilities;
		// this.profession = profession;
		// this.skills = skills;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String creatureName) {
		this.name = creatureName;
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

	@Override
	public String toString() {
		return name;
	}

	public boolean checkIfCreatedCreatureExcist(Creature creature) {
		if (creature == null) {
			creature = creature;
			return true;
		} else {
			return false;
		}
	}
}
