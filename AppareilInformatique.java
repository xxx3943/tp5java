package techstore;
public abstract class AppareilInformatique extends Article implements Garantissable {
double resolutionEcran;
String processeur;
long ram;
SystemeExploitation systemeExploitaion;
public AppareilInformatique(int id,String nom,double prix,double resolutionEcran,String processeur,long ram,SystemeExploitation systemeExploitaion) {
super(id, nom, prix);
this.resolutionEcran = resolutionEcran;
this.processeur = processeur;
this.ram = ram;
this.systemeExploitaion = systemeExploitaion;
}

public double getResolutionEcran() {
	return resolutionEcran;
}

public void setResolutionEcran(double resolutionEcran) {
	this.resolutionEcran = resolutionEcran;
}

public String getProcesseur() {
	return processeur;
}

public void setProcesseur(String processeur) {
	this.processeur = processeur;
}

public long getRam() {
	return ram;
}

public void setRam(long ram) {
	this.ram = ram;
}

public SystemeExploitation getSystemeExploitation() {
	return getSystemeExploitation();
}

public void setSystemeExploitation(SystemeExploitation systemeExploitation) {
	this.systemeExploitaion = systemeExploitation;
}


@Override
public String toString() {
	return "AppareilInformatique [resolutionEcran=" + resolutionEcran + ", processeur=" + processeur + ", ram=" + ram
			+ ", SystemeExploitation=" + systemeExploitaion + "]";
}

@Override
public abstract int garantirAppareil();

}