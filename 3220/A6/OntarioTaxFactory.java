package goodCode;

public class OntarioTaxFactory extends IncomeTaxFactory{

    public OntarioDateAddress createDateAddress() {
        return new OntarioDateAddress();
    }

    public OntarioTaxCalculator calculateTax() {
        return new OntarioTaxCalculator();
    }

    public OntarioLetterBody displayBodyLetter() {
        return new OntarioLetterBody();
    }

    public EnglishSalutation displaySalutation() {
        return new EnglishSalutation();
    }

    public EnglishDate dateFactory() {
        return new EnglishDate();
    }
}
