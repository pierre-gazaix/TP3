package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;


public class GestionEtudiants {
    public static void main(String[] args) {
        //throw new RuntimeException("Not yet implemented");

        LocalDate dateNaissance = LocalDate.of(2000, Month.FEBRUARY, 27);
        Etudiants lolo = new Etudiants("Gazaix", "Pierre", dateNaissance, "gazaixpierre@gmail.com", "10 avenue d'Unterschleissheim");
        Etudiants toto = lolo;

        System.out.println(toto.toString());
        System.out.println(lolo.toString());

    }
}