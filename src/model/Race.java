package model;

public class Race {

	private Type type;
	private String raceName;
	private String raceDescription;
	private String raceSkill;

	public Race() {
		this.type = type;
		this.raceName = raceName;
		this.raceDescription = raceDescription;
		this.raceSkill = raceSkill;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
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

}
