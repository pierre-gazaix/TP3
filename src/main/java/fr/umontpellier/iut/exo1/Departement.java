package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {

    private String spécialité;
    private String adresse;
    private ArrayList<Etudiants> listeetud;

    public Departement(String adresse, String spécialité) {
        this.adresse = adresse;
        this.spécialité = spécialité;
        this.listeetud = new ArrayList<Etudiants>();
    }

    public String toString() {
        String s = "";
        s += "------------  [ " + this.spécialité + " - " + this.adresse + " ]  ------------ \n";
        for(int i = 0; i < this.listeetud.size(); i++){
            s += i+1  + "-" + this.listeetud.get(i).toString() + "\n";
        }
        return s;
    }

    public void inscrire(Etudiants etu){

        this.listeetud.add(etu);
    }

    public void desinscrire(Etudiants etu){

        this.listeetud.remove(etu);
    }


}
