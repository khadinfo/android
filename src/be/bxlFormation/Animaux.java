package be.bxlFormation;

import java.time.LocalDate;

public class Animaux {
    private String nom;
    private int age;
    private double poids;
    private char sexe;
    private double taille;
    private int ageHumain;
    private LocalDate dateArrive;
    private double probalitéDeces;

    public Animaux(String nom, int age, double poids, char sexe, double taille, int ageHumain, LocalDate dateArrive,double probalitéDeces) {
        this.nom = nom;
        setAge(age);
        setPoids(poids);
        this.sexe = sexe;
        setTaille(taille);
        setAgeHumain(ageHumain);
        this.dateArrive = dateArrive;
        this.probalitéDeces=probalitéDeces;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double getPoids() {
        return poids;
    }

    public char getSexe() {
        return sexe;
    }

    public double getTaille() {
        return taille;
    }

    public int getAgeHumain() {
        return ageHumain;
    }

    public LocalDate getDateArrive() {
        return dateArrive;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setAgeHumain(int ageHumain) {
        this.ageHumain = ageHumain;
    }

    public void crier(){
        System.out.println(nom +" crie");
    }

    public double getProbalitéDeces() {
        return probalitéDeces;
    }
}
