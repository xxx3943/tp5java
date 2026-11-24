package techstore;
public class OrdinateurProtable extends Ordinateur implements Garantissable {
	long capaciteBatterie;

	public OrdinateurProtable(int id, java.lang.String nom, double prix, double resolutionEcran,
			java.lang.String processeur, long ram, techstore.SystemeExploitation systemeExploitaion, long disqueDur,
			java.lang.String carteGraphique, long capaciteBatterie) {
		super(id, nom, prix, resolutionEcran, processeur, ram, systemeExploitaion, disqueDur, carteGraphique);
		this.capaciteBatterie = capaciteBatterie;
	}

	public long getCapaciteBatterie() {
		return capaciteBatterie;
	}

	public void setCapaciteBatterie(long capaciteBatterie) {
		this.capaciteBatterie = capaciteBatterie;
	}

	@Override
	public int garantirAppareil() {
		return 2;
	}

	@Override
	public String toString() {
		return "OrdinateurProtable [capaciteBatterie=" + capaciteBatterie + "]";
	}
	
	
}
