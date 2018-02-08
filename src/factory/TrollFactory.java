package factory;

import model.Race;

public class TrollFactory extends SvartfolksFactory{
	
	public TrollFactory() {
		super(new Race(SVARTFOLK, "Troll"));
	}
	
}
