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
        for (int i = 0; i < composants.length; i++) {

        }
    }
    
}
