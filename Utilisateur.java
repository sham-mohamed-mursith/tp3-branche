public class Utilisateur {
    private String nom;
    private int id;

    public Utilisateur(String nom, int id){
        this.nom=nom;
        this.id=id;
    }

    public String getNom(){
        return this.nom;
    }
    public int getId(){
        return this.id;
    }
    
}


