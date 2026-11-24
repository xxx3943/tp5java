package techstore;

public class OrdinateurDeBureau extends Ordinateur implements Garantissable{
	String alimentation;

	public OrdinateurDeBureau(int id, java.lang.String nom, double prix, double resolutionEcran,
			java.lang.String processeur, long ram, techstore.SystemeExploitation systemeExploitaion, long disqueDur,
			java.lang.String carteGraphique, java.lang.String alimentation) {
		super(id, nom, prix, resolutionEcran, processeur, ram, systemeExploitaion, disqueDur, carteGraphique);
		this.alimentation = alimentation;
	}

	public String getAlimentation() {
		return alimentation;
	}

	public void setAlimentation(String alimentation) {
		this.alimentation = alimentation;
	}

	@Override
	public int garantirAppareil() {
		return 1;
	}

	@Override
	public String toString() {
		return "OrdinateurDeBureau [alimentation=" + alimentation + "]";
	}
	
}
