package be.bxlFormation;

import java.time.LocalDate;

public class Chat extends Animaux {
    private String personnalité;
    private int taillePoils;
    private boolean ongleCoupé;

    public Chat(String nom, int age, double poids, char sexe, double taille, int ageHumain, LocalDate dateArrive,String personnalité, int taillePoils, boolean ongleCoupé) {
        super(nom,age,poids,sexe,taille,ageHumain,dateArrive,0.5);
        this.personnalité = personnalité;
        setTaillePoils(taillePoils);
        setOngleCoupé(ongleCoupé);
    }

    public String getPersonnalité() {
        return personnalité;
    }

    public int getTaillePoils() {
        return taillePoils;
    }

    public boolean isOngleCoupé() {
        return ongleCoupé;
    }

    public void setTaillePoils(int taillePoils) {
        this.taillePoils = taillePoils;
    }

    public void setOngleCoupé(boolean ongleCoupé) {
        this.ongleCoupé = ongleCoupé;
    }
}
