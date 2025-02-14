package exo1;

//Solution 2 pour la qst 3
public class ServiceEnvoiPhotoAdapterClss extends ServiceEnvoiPhoto implements EnvoiService{
    @Override
    public void envoi(Contact contact, String message) {
        envoiPhoto(contact, message);
    }
}
