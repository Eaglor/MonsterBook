package model;

//Tog bort arvet Type i.o.m. att det blev problem med att skapa ett Type-värde som kan anropas till alla ras-klasser med samma Type.
public class Race{

	private Type type;
	private String race;
	private String raceDescription;
	private String raceSkill;

	public Race(Type type, String race) {
		this.type = type;
		this.race = race;
//		this.raceDescription = raceDescription;
//		this.raceSkill = raceSkill;
	}

	public Type getType() {
		return type;
	}
	
	//TypeName tillgänglig via Race istället
	public String getTypeName() {
		return type.getTypeName();
	}
	
	public void setType(Type type) {
		this.type = type;
	}

	public String getRaceName() {
		return race;
	}

	public void setRaceName(String race) {
		this.race = race;
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
