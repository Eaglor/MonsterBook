package model.control;

import model.Creature;

public interface UI {
	
	public static void UI() {
		
	}
	
	public static void printHeader() {
		System.out.println("Name    Race    Type   ");
	}
	
	public static void printCreature(Creature creature) {
		System.out.println(creature.getName() + " " +
		creature.getRaceName() + " " +
		creature.getTypeName());
	} 
	
}
