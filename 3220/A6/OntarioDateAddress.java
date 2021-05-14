package goodCode;

public class OntarioDateAddress extends DateAddress {
    public String displayDateAddress(String address, String today) {
        return today + "\n\n"+address+"\nOntario\n\n";
    }
}