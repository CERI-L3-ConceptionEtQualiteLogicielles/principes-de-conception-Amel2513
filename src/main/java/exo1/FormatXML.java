package exo1;

public class FormatXML implements FormatStrategy {
    @Override
    public String formatter(Contact contact) {
        return "<contact>\n\t<nom>" + contact.getNom() + "</nom>\n\t<numero>" + contact.getNumero() + "</numero>\n</contact>";
    }
}
