package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {

    private String spécialité;
    private String adresse;
    private ArrayList<Etudiants> listeetud;

    public Departement(String adresse, String spécialité) {
        this.adresse = adresse;
        this.spécialité = spécialité;
    }

    public String toString() {
        String s = "";
        s += "------------  [ " + this.spécialité + " - " + this.adresse + " ]  ------------ \n";
        int x = this.listeetud.size();
        for(int i = 0; i<x; i++){
            s += i + "-" + this.listeetud.get(i).toString() + "\n";
        }
        return s;
    }

    public void inscrire(Etudiants etu, Departement dep){
        dep.listeetud.add(etu);
    }

    public void desinscrire(Etudiants etu, Departement dep){
        dep.listeetud.remove(etu);
    }


}
