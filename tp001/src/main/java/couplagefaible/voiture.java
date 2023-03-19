package couplagefaible;

public class voiture implements ivoiture {
    private imoteur moteur ;

    public void rouler(){
        moteur.demarrer();
        System.out.println("la voiture roule correctement!");
    }

    public void setMoteur(imoteur m){
        this.moteur = m;
    }
}
