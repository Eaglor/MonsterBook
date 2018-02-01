package model;

public class Type {
	private String typeName;
	private String typeDescription;
	private String typePerks;
	private String typeWeakness;
	private String typeSkill;

	public Type() {
		this.typeName = typeName;
		this.typeDescription = typeDescription;
		this.typePerks = typePerks;
		this.typeWeakness = typeWeakness;
		this.typeSkill = typeSkill;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
