package be.bxlFormation;

public class Duree {
    private int minute;
    private int seconde;
    private int heure;
    private int jour;

    public Duree (int nbSeconde){
        this.seconde=nbSeconde;
    }
    public Duree(int minute, int seconde, int heure, int jour) {

        this.minute = minute;
        this.seconde = seconde;
        this.heure = heure;
        this.jour = jour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconde() {
        return seconde;
    }

    public int getHeure() {
        return heure;
    }

    public int getJour() {
        return jour;
    }

    public String getDuree(){
        return jour+":"+heure + ":"+minute+" :"+seconde;
    }

    public void SubDuree(Duree aSoustraire){

    }


    public void addDuree(Duree aAjouter){
     if(aAjouter.seconde<0 || aAjouter.minute<0 || aAjouter.heure<0 )
         System.err.println("duree invalide");

    }
}
