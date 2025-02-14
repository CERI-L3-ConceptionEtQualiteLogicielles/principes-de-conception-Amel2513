package exo1;

//Elle n'implémente plus le ContactService
public class Contact  {
    //Le contact ne gère pas la liste des contacts(single Responsibility)
    //private static List<Contact> lesContacts = new ArrayList<>();
    private String nom;
    private String numero;
    private FormatStrategy format = new FormatTexte();//Qst 4: formt txt pr dft

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
        //this.format = format;
        //L'ajout d'une instance de conatct à la liste ne se fait pas dans le constructeur (principe KISS)
        //lesContacts.add(this);
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setFormatStrategy(FormatStrategy format) {this.format = format;} //Qst 4

    //modifiée pour respecter le principe DRY (il y'a toString déjà)
    /*public String getInfoContact() {
        return(toString());
    }*/
    //qst 4
    public String getInfoContact() {
        return format.formatter(this);
    }



    //Le contact n'a pas à gérer l'ajout et la suppression (single Responsibility)
    /*public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }
    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }*/

    //Le contact n'a pas à gérer l'affichage de la liste des contacts (single Responsibility)
    /*public void afficheContacts() {
        for (Contact contact : lesContacts) {
            //pas besoin de réécrire toute la phrase: on utilise toString (principe DRY)
            System.out.println(contact);
        }
    }*/
    //Méthode sauvegardeEnBD() éliminé, elle est dans l'interface GestionBdd

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Numéro: " + getNumero();
    }
}

