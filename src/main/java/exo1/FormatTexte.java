package exo1;

public class FormatTexte implements FormatStrategy {
    @Override
    public String formatter(Contact contact) {
        return contact.toString();
    }
}
