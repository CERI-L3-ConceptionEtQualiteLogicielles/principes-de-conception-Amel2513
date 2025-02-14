package exo1;

//Solution 1 pour la qst 3
public class ServiceEnvoiPhotoAdapterObj implements EnvoiService{

    private ServiceEnvoiPhoto serviceEnvoiPhoto;  //Aggrégation

    //Constructeur
    public ServiceEnvoiPhotoAdapterObj(ServiceEnvoiPhoto serviceEnvoiPhoto) {
        this.serviceEnvoiPhoto = serviceEnvoiPhoto;
    }

    @Override
    public void envoi(Contact contact, String message) {
        serviceEnvoiPhoto.envoiPhoto(contact, message);
    }
}
