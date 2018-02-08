package factory;

import model.Creature;
import model.Race;
import model.Type;

public abstract class SvartfolksFactory implements CreatureFactory {
	
	protected static Type SVARTFOLK = new Type("Svartfolk");

	private Race race;
	
	public SvartfolksFactory(Race race) {
		this.race = race;
	}

	@Override
	public Creature create(String name) {
		return new Creature(race, name);
	}

}
