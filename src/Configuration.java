public class Configuration {
    private final int MAX_COMPOSANTS = 20;
    private String description;
    private double prixMax;
    private Composant[] composants = new Composant[MAX_COMPOSANTS];
    private int nbrcompssants;

    public Configuration(String description, double prixMax, Composant[] composants){
        this.description = description;
        this.prixMax = prixMax;
        for (int i = 0; i < composants.length; i++) {
            this.composants[i] = composants[i];
            nbrcompssants++;
        }
    }
    public Configuration(Configuration originale){
        this.description = new String(originale.description);
        this.composants = new Composant[MAX_COMPOSANTS];
        this.prixMax = originale.prixMax;
        for (int i = 0; i < originale.composants.length; i++) {
            this.composants[i] = originale.composants[i];
            nbrcompssants++;
        }
    }
    public double calculerTotal(double taxe){
        double soustotal = 0;
        for (int i = 0; i < composants.length; i++) {
            if (composants[i] != null) {
                soustotal += composants[i].getPrix();
            }
        }
        return ((soustotal * taxe) + soustotal);
    }
    public Composant rechercher(String categorie){
        Composant composant;
        for (int i = 0; i < composants.length; i++) {
            if (composants[i] != null){
                if (composants[i].getCategorie().equalsIgnoreCase(categorie)) {
                    composant = composants[i];
                    return composant;
                }
            }
        }
        return null;
    }
    public boolean ajouter(Composant composant){
        double prixPc = 0;
        for (int i = 0; i < composants.length; i++) {
            if (composants[i] != null) {
                prixPc += composants[i].getPrix();
            }
        }
        if (prixPc >= prixMax){
            return false;
        }else {
            for (int i = 0; i < composants.length; i++) {
                if (composants[i] == null) {
                    composants[i] = composant;
                    nbrcompssants += 1;
                    break;
                }
            }
            return true;
        }
    }
    public boolean retirer(Composant composant){
        for (int i = 0; i < composants.length; i++) {
            if (composants[i] == composant){
                composants[i] = null;
                nbrcompssants -= 1;
                return true;
            }
        }
        return false;
    }
    public boolean remplacer(Composant composant){
        Composant aremplacee = rechercher(composant.getCategorie());
        if (aremplacee != null) {
            for (int i = 0; i < composants.length; i++) {
                if (composants[i] == aremplacee) {
                    composants[i] = composant;
                    return true;
                }
            }
        }else {
            return false;
        }
        return false;
    }

    public int getNbComposants() {
        return nbrcompssants;
    }

    public Composant[] getComposants() {
        return composants;
    }

    public String toString(){
        String composants = "";
        int compteur = 1;
        for (int i = 0; i < nbrcompssants; i++) {
            if (this.composants[i] != null) {
                composants += compteur + ": " + this.composants[i] + " (" + this.composants[i].getPrix() + ")\n";
                compteur ++;
            }
        }
        return description + "(" + prixMax + ") :\n" + composants;
    }
}
