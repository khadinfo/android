package be.bxlFormation;

import java.time.LocalDate;

public class Oiseaux extends Animaux{
    private String lieuDeVie;
    private String couleur;

    public Oiseaux(String nom, int age, double poids, char sexe, double taille, int ageHumain, LocalDate dateArrive,String lieuDeVie, String couleur) {
        super(nom,age,poids,sexe,taille,ageHumain,dateArrive,3);
        this.lieuDeVie = lieuDeVie;
        this.couleur=couleur;
    }

    public String getLieuDeVie() {
        return lieuDeVie;
    }

    public String getCouleur() {
        return couleur;
    }

}
