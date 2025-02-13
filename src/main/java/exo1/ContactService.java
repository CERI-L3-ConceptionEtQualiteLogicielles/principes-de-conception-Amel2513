package exo1;
//l'envoie d'email et de sms est un comportement un peu isolé des comportement de ContactService, vaut mieux le mettre dans une autre interface
public interface ContactService {
    void ajouteContact(Contact contact);
    void supprimeContact(Contact contact);
    void afficheContacts();
}