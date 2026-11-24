package heritage;

public class Bebe extends Personne {
private boolean porteCouche;
public Bebe(String nom, int age, boolean porteCouche) {
super(nom, age);
this.porteCouche = porteCouche;
}
@Override
public String toString() {
return super.toString()
+ ", porte une couche : " + porteCouche;
}
}
