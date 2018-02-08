package factory;

import model.Creature;

public interface CreatureFactory {
	
	Creature create(String name);
	
}
