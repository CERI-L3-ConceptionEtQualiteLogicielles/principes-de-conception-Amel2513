package exo1;

public class FormatJson implements FormatStrategy{
    @Override
    public String formatter(Contact contact) {
        return "{ \"nom\": \"" + contact.getNom() + "\", \"numero\": \"" + contact.getNumero() + "\" }";
    }
}
