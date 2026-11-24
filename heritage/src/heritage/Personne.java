package heritage;

public class Personne {
	private String nom;
	private int age;
	private String telephone;
	public Personne(String nom, int age) {

	this.nom = nom;
	this.age = age;
	}
	public String getNom() {
	return nom;
	}
	public int getAge() {
	return age;
	}
	@Override
	public String toString() {
	return "Nom : " + nom + ", âge : " + age + "telephone" + telephone ;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
