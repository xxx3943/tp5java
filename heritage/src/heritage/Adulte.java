package heritage;

public class Adulte extends Personne implements Identifiabl  {
private String profession;
public Adulte(String nom, int age, String profession) {
super(nom, age);
this.profession = profession;
}
@Override
public String toString() {
return super.toString()
+ ", profession : " + profession;
}
@Override
public void afficherIdentite() {
System.out.println("Adulte : " + getNom());
}
}
