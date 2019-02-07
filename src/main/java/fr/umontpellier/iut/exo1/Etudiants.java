package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;


public class Etudiants {

    private String nom;
    private String prénom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;

    public Etudiants() {
    }

    public Etudiants(Etudiants e){
        this.nom = e.nom;
        this.prénom = e.prénom;
        this.dateNaissance = e.dateNaissance;
        this.adresseMail = e.adresseMail;
        this.adressePostale = e.adressePostale;
    }

    public Etudiants(String nom, String prénom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prénom = prénom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }

    @Override
    public String toString() {
        return "Etudiants{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresseMail='" + adresseMail + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }


}
