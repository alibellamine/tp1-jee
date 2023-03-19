package couplagefaible;

public class voyage {
    public static void main(String[] args){

        voiture v = new voiture();

        v.setMoteur(new moteur());

        v.rouler();
        System.out.println("bon voyage");
    }
}
