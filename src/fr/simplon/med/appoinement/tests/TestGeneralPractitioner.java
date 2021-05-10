package fr.simplon.med.appoinement.tests;
import fr.simplon.med.appoinement.model.GeneralPractitioner;

public class TestGeneralPractitioner {
    public static void main(String[] args) {
        System.out.println("__________________________ Médecins ______________________________");
        GeneralPractitioner melanie = new GeneralPractitioner("Malalaniche", "Mélanie", "02.28.03.17.28");
        GeneralPractitioner edmond = new GeneralPractitioner("Bosapin", "Edmond", "+33 2 17 18 19 20");
        GeneralPractitioner djemila = new GeneralPractitioner("Table", "Djémila", "03-04-05-06-07");

        melanie.print();
        System.out.println("------------------------------------------------------------------");
        edmond.print();
        System.out.println("------------------------------------------------------------------");
        djemila.print();

        System.out.println("--------------- Changement du numéro de ce médecin ---------------");
        djemila.setPhoneNumber("07-06-05-04-03");
        System.out.printf("Nouveau numéro du Dr %s : %s%n", djemila.getLastName(), djemila.getPhoneNumber());

        System.out.println("-------------- Changement du prix de la consultation -------------");
        GeneralPractitioner.setRate(23);
        melanie.print();
        System.out.println("------------------------------------------------------------------");
        edmond.print();
        System.out.println("------------------------------------------------------------------");
        djemila.print();
    }
}
