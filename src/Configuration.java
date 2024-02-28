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
            soustotal += composants[i].getPrix();
        }
        return ((soustotal * taxe) + soustotal);
    }
    public Composant rechercher(String categorie){
        Composant composant;
        for (int i = 0; i < composants.length; i++) {
            if (composants[i].getCategorie().equals(categorie)) {
                composant = composants[i];
                return composant;
            }
        }
        return null;
    }
    public boolean ajouter(Composant composant){
        double prixPc = 0;
        for (int i = 0; i < composants.length; i++) {
            prixPc += composants[i].getPrix();
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
    public String toString(){
        String composants = "";
        for (int i = 0; i < nbrcompssants; i++) {
            composants += (i + 1) + ": " + this.composants[i] + " (" + this.composants[i].getPrix() + ")\n";
        }
        return description + "(" + prixMax + ") :\n" + composants;
    }
}
