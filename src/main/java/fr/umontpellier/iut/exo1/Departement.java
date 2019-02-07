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
        return "Departement{" +
                "spécialité='" + spécialité + '\'' +
                ", adresse='" + adresse + '\'' +
                ", listeetud=" + listeetud +
                '}';
    }

    public void inscrire(Etudiants etu, Departement dep){
        dep.listeetud.add(etu);
    }


}
