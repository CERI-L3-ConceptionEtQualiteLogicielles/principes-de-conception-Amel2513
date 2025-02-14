package exo1;

public class Main {
    public static void main(String[] args) {
        System.out.println("-> création d'un contact ");
        Contact contact1 = new Contact("moula","123456789" );
        System.out.println(contact1.getInfoContact());

        System.out.println("\n -> ajout d'un contact à l'annuaire ");
        Annuaire annuaire = new Annuaire();
        annuaire.ajouteContact(contact1);
        annuaire.afficheContacts();

        System.out.println("\n -> envoi d'un SMS");
        EnvoiService envoiSMS = new ServiceEnvoiSMS();
        envoiSMS.envoi(contact1,"Message SMS à envoyer");

        System.out.println("\n -> envoi d'un email ");
        EnvoiService envoiEmail = new ServiceEnvoiMail();
        envoiEmail.envoi(contact1,"Message email à envoyer");

        System.out.println("\n -> envoi d'une photo via l'adaptateur d'objet ");
        ServiceEnvoiPhoto serviceEnvoiPhoto = new ServiceEnvoiPhoto();
        EnvoiService envoiPhotoAdapterObj = new ServiceEnvoiPhotoAdapterObj(serviceEnvoiPhoto);
        envoiPhotoAdapterObj.envoi(contact1, "Message photo via adaptateur d'objet");


        System.out.println("\n -> envoi d'une photo via l'adaptateur de classe ");
        EnvoiService envoiPhotoAdapterClss = new ServiceEnvoiPhotoAdapterClss();
        envoiPhotoAdapterClss.envoi(contact1, "Message photo via adaptateur de classe");


        System.out.println("\n -> sauvegarde des contacts dans la base de données");
        Bdd bdd = new Bdd();
        bdd.sauvegardeEnBD();


        System.out.println("\n -> ajout et suppression de contacts");
        Contact contact2 = new Contact("amelii", "1347138947");
        annuaire.ajouteContact(contact2);
        annuaire.afficheContacts();

        annuaire.supprimeContact(contact1);
        System.out.println("\n -> Contacts actuels:");
        annuaire.afficheContacts();


        System.out.println("\n -> Choisir le format de contact");
        System.out.println("Format Texte: ");
        contact1.setFormatStrategy(new FormatTexte());
        System.out.println(contact1.getInfoContact());

        // Changer en format JSON
        contact1.setFormatStrategy(new FormatJson());
        System.out.println("\nFormat JSON: ");
        System.out.println(contact1.getInfoContact());

        // Changer en format XML
        contact1.setFormatStrategy(new FormatXML());
        System.out.println("\nFormat XML: ");
        System.out.println(contact1.getInfoContact());
    }
}

