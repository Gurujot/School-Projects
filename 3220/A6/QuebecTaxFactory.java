package goodCode;

public class QuebecTaxFactory extends IncomeTaxFactory {

    public QuebecDateAddress createDateAddress() {
        return new QuebecDateAddress();
    }

    public QuebecTaxCalculator calculateTax() {
        return new QuebecTaxCalculator();
    }

    public QuebecLetterBody displayBodyLetter() {
        return new QuebecLetterBody();
    }

    public FrenchSalutation displaySalutation() {
        return new FrenchSalutation();
    }

    public FrenchDate dateFactory() {
        return new FrenchDate();
    }
}
