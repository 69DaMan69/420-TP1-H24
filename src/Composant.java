public class Composant {
    private final String CATÉGORIE;
    private String marque;
    private String nom;
    private double prix;
    private double rabais;
    Composant(String catégorie, String marque, String nom, double prix){
        CATÉGORIE = catégorie;
        this.marque = marque;
        this.nom = nom;
        this.prix = prix;
        rabais = 0;
    }
    public Composant copier(){
        Composant c = new Composant(CATÉGORIE, marque, nom, prix);
        return c;
    }
    public boolean estIdentique(Composant autre){
        if (CATÉGORIE.equals(autre.CATÉGORIE)&& marque.equals(autre.marque) && nom.equals(autre.nom)){
            return true;
        }else {
            return false;
        }
    }
    public double getPrix(){
        return prix-(prix*rabais);
    }

    public String getCategorie() {
        return CATÉGORIE;
    }

    public String toString(){
        return "["+CATÉGORIE+"] "+marque+" "+ nom;
    }
}
