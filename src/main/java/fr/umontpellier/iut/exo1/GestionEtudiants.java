package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;


public class GestionEtudiants {
    public static void main(String[] args) {
        //throw new RuntimeException("Not yet implemented");

        LocalDate dateNaissance = LocalDate.of(2000, Month.FEBRUARY, 27);
        Etudiants lolo = new Etudiants("Gazaix", "Pierre", dateNaissance, "gazaixpierre@gmail.com", "10 avenue d'Unterschleissheim");
        Etudiants toto = lolo;
        Etudiants roro = new Etudiants("Roro", "Pierre", dateNaissance, "gazaixpierre@gmail.com", "10 avenue d'Unterschleissheim");
        Etudiants momo = new Etudiants("Momo", "Pierre", dateNaissance, "gazaixpierre@gmail.com", "10 avenue d'Unterschleissheim");
        Departement monDepInfo = new Departement("A l'IUT", "Informatique");

        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(roro);
        monDepInfo.inscrire(momo);
        monDepInfo.desinscrire(toto);

        System.out.println(monDepInfo.toString());

    }
}
