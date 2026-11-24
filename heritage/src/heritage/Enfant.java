package heritage;

public class Enfant extends Personne {
private String nomEcole;
public Enfant(String nom, int age, String nomEcole) {
super(nom, age);
this.nomEcole = nomEcole;
}
@Override
public String toString() {
return super.toString()
+ ", école : " + nomEcole;

}
}
