import model.*;

public class Main {

	public static void main(String[] args) {

		// skapa creature
		// fr�n race
		// skapa en lista med abilities
		// skapa en lista med skills
		// skapa en t�rningsklass
		// skapa en creature komplett med attribut, skills, namn och rastillh�righet
		// skapa ett maven project
		// skapa springboot
		// testa med postman
		// se �ver relationer och annotationer i entyties
		// l�gg till random creature
		// l�gg till main character
		// create players character
		//
		//controll
		//view
		
		Type svartfolk = new Type();
		Race orch = new Race();
		
		Race troll = new Race();
		
		Creature gritus = new Creature(svartfolk, orch, "Gritus");
		Creature whitecap = new Creature(svartfolk, troll, "whitecap");
		
		
		
		System.out.println(gritus);
		System.out.println(whitecap);
		
		}
}
