package be.bxlFormation;

import java.time.LocalDate;

public class Chien extends Animaux{

    private String race;
    private String couleurColier;
    private boolean dresser;

    public Chien(String nom, int age, double poids, char sexe, double taille, int ageHumain, LocalDate dateArrive, String race, String couleurColier, boolean dresser) {
        super(nom,age,poids,sexe,taille,ageHumain,dateArrive,1);
        this.race = race;
        this.couleurColier = couleurColier;
        this.dresser = dresser;
    }

    public String getRace() {
        return race;
    }

    public String getCouleurColier() {
        return couleurColier;
    }

    public boolean isDresser() {
        return dresser;
    }

    public void setCouleurColier(String couleurColier) {
        this.couleurColier = couleurColier;
    }

    public void setDresser(boolean dresser) {
        this.dresser = dresser;
    }
}
