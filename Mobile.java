package techstore;
public class Mobile extends AppareilInformatique implements Garantissable{
	double appareilPotoArriere;
	double appareilPhotoFrontal;
	int nbSim;
	long capaciteBatterie;
	public Mobile(int id, java.lang.String nom, double prix, double resolutionEcran, java.lang.String processeur,
			long ram, techstore.SystemeExploitation systemeExploitaion, double appareilPotoArriere,
			double appareilPhotoFrontal, int nbSim, long capaciteBatterie) {
		super(id, nom, prix, resolutionEcran, processeur, ram, systemeExploitaion);
		this.appareilPotoArriere = appareilPotoArriere;
		this.appareilPhotoFrontal = appareilPhotoFrontal;
		this.nbSim = nbSim;
		this.capaciteBatterie = capaciteBatterie;
	}
	public double getAppareilPotoArriere() {
		return appareilPotoArriere;
	}
	public void setAppareilPotoArriere(double appareilPotoArriere) {
		this.appareilPotoArriere = appareilPotoArriere;
	}
	public double getAppareilPhotoFrontal() {
		return appareilPhotoFrontal;
	}
	public void setAppareilPhotoFrontal(double appareilPhotoFrontal) {
		this.appareilPhotoFrontal = appareilPhotoFrontal;
	}
	public int getNbSim() {
		return nbSim;
	}
	public void setNbSim(int nbSim) {
		this.nbSim = nbSim;
	}
	public long getCapaciteBatterie() {
		return capaciteBatterie;
	}
	public void setCapaciteBatterie(long capaciteBatterie) {
		this.capaciteBatterie = capaciteBatterie;
	}
	@Override
	public int garantirAppareil() {
		if (getPrix()>1000.0) {
			return 2;
		}
		else {
			return 1;
		}		
	}
	@Override
	public String toString() {
		return "Mobile [appareilPotoArriere=" + appareilPotoArriere + ", appareilPhotoFrontal=" + appareilPhotoFrontal
				+ ", nbSim=" + nbSim + ", capaciteBatterie=" + capaciteBatterie + "]";
	}
	
}
