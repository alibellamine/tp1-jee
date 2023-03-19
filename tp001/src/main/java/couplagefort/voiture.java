package couplagefort;

public class voiture {
    moteur m;
    void bouger(){
        m= new moteur();
        m.demarrer();
        System.out.println("vitesse 10km/h");
    }
}
