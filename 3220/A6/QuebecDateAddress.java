package goodCode;

public class QuebecDateAddress extends DateAddress {
    public String displayDateAddress(String address, String today) {
        return today + "\n\n" + address + "\nQuebec" + "\n\n";
    }
}
