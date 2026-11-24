package techstore;
public  class Peripherique extends Article{
  String technologieDeConnexion;
  String interfaceAvecOrdinateur;
  public Peripherique(int id, String nom, double prix, String technologieDeConnexion, String interfaceAvecOrdinateur) {
	super(id, nom, prix);
	this.technologieDeConnexion = technologieDeConnexion;
	this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
}
  public String getTechnologieDeConnexion() {
	return technologieDeConnexion;
  }
  public void setTechnologieDeConnexion(String technologieDeConnexion) {
	this.technologieDeConnexion = technologieDeConnexion;
  }
  public String getInterfaceAvecOrdinateur() {
	return interfaceAvecOrdinateur;
  }
  public void setInterfaceAvecOrdinateur(String interfaceAvecOrdinateur) {
	this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
  }
  @Override
  public String toString() {
	return "Peripherique [technologieDeConnexion=" + technologieDeConnexion + ", interfaceAvecOrdinateur="
			+ interfaceAvecOrdinateur + "]";
  }
  
}