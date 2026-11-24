package techstore;
public class ComposantStockage  extends Article implements Garantissable {
	    int capacite;

		public ComposantStockage(int id, String nom, double prix, int capacite) {
			super(id, nom, prix);
			this.capacite = capacite;
		}

		public int getCapacite() {
			return capacite;
		}

		public void setCapacite(int capacite) {
			this.capacite = capacite;
		}

		@Override
		public int garantirAppareil() {
			if (capacite<=500) {
				return 1;
			}
			else {
				return 2;
			}
		}
		@Override
		public String toString() {
			return "ComposantStockage [capacite=" + capacite + "]";
		}
}
