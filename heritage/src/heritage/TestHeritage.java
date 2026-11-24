package heritage;

public class TestHeritage {
	public static void main(String[] args) {
		Adulte a1 = new Adulte("Amine", 35, "Ingénieur");
		Enfant e1 = new Enfant("Sami", 10, "École primaire");
		Bebe b1 = new Bebe("Lina", 1, true);
		System.out.println(a1.getNom());
		System.out.println(e1.getNom());
		System.out.println(b1.getNom());
		a1.afficherIdentite();
		
		}
}
