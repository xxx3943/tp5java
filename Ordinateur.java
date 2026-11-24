package techstore;
public abstract class Ordinateur extends AppareilInformatique{
  long disqueDur;
  String carteGraphique;

  public Ordinateur(int id, java.lang.String nom, double prix, double resolutionEcran, java.lang.String processeur,long ram, techstore.SystemeExploitation systemeExploitaion, long disqueDur, java.lang.String carteGraphique) {
	super(id, nom, prix, resolutionEcran, processeur, ram, systemeExploitaion);
	this.disqueDur = disqueDur;
	this.carteGraphique = carteGraphique;
}

  public long getDisqueDur() {
	return disqueDur;
  }
 
  public void setDisqueDur(long disqueDur) {
	this.disqueDur = disqueDur;
  }
String getCarteGraphique() {
	return carteGraphique;
  }
 
  public void setCarteGraphique(String carteGraphique) {
	this.carteGraphique = carteGraphique;
  }

  @Override
  public String toString() {
	return "Ordinateur [disqueDur=" + disqueDur + ", carteGraphique=" + carteGraphique + "]";
  }
  
  
  
}