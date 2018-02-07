package model;

public class Type {
	private String type;
	private String typeDescription;
	private String typePerks;
	private String typeWeakness;
	private String typeSkill;

	public Type(String type) {
		this.type = type;
//		this.typeDescription = typeDescription;
//		this.typePerks = typePerks;
//		this.typeWeakness = typeWeakness;
//		this.typeSkill = typeSkill;
	}

	public String getTypeName() {
		return type;
	}

	public void setTypeName(String typeName) {
		this.type = typeName;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public String getTypePerks() {
		return typePerks;
	}

	public void setTypePerks(String typePerks) {
		this.typePerks = typePerks;
	}

	public String getTypeWeakness() {
		return typeWeakness;
	}

	public void setTypeWeakness(String typeWeakness) {
		this.typeWeakness = typeWeakness;
	}

	public String getTypeSkill() {
		return typeSkill;
	}

	public void setTypeSkill(String typeSkill) {
		this.typeSkill = typeSkill;
	}
	
}
