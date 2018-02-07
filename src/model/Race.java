package model;

public class Race extends Type {

	private Type type;
	private String race;
	private String raceDescription;
	private String raceSkill;

	public Race() {
		this.type = type;
		this.race = race;
//		this.raceDescription = raceDescription;
//		this.raceSkill = raceSkill;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getRaceName() {
		return race;
	}

	public void setRaceName(String raceName) {
		this.race = raceName;
	}

	public String getRaceDescription() {
		return raceDescription;
	}

	public void setRaceDescription(String raceDescription) {
		this.raceDescription = raceDescription;
	}

	public String getRaceSkill() {
		return raceSkill;
	}

	public void setRaceSkill(String raceSkill) {
		this.raceSkill = raceSkill;
	}
	
	@Override
	public String toString() {
		return race;
	}

}
