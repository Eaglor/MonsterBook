import factory.CreatureFactory;
import factory.OrchFactory;
import factory.TrollFactory;
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
		
		Type svartfolk = new Type("Svartfolk");
		Race orch = new Race(svartfolk, "Orch");
		
		Race troll = new Race(svartfolk, "Troll");
		
		Creature gritus = new Creature(orch, "Gritus");
		Creature krutus = new Creature(troll, "Krutus");
		
		System.out.println(gritus);
		System.out.println(krutus);
		
		//alt. Factory
		CreatureFactory orchFactory = new OrchFactory();
		CreatureFactory trollFactory = new TrollFactory();
		
		Creature vredfolk = orchFactory.create("Vredfolk");
		Creature storhamre = trollFactory.create("Storhamre");
		
		System.out.println(vredfolk);
		System.out.println(storhamre);
		
		}
}
