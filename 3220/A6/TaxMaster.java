package goodCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TaxMaster {
    private DateAddress dateAddress;
    private Salutation salutation;
    private LetterBody letterBody;
    private TaxCalculator taxCalculator;
    private MyDate myDate;

    public TaxMaster(IncomeTaxFactory incomeTax) {
        dateAddress = incomeTax.createDateAddress();
        myDate = incomeTax.dateFactory();
        salutation = incomeTax.displaySalutation();
        letterBody = incomeTax.displayBodyLetter();
        taxCalculator = incomeTax.calculateTax();
    }

    public String generateLetter(String name, String gender, String address, String province, double income, String today) {

        String day = myDate.toString(today);
        String date = dateAddress.displayDateAddress(address, day);
        String salut = salutation.salutationGenerator(name, gender);
        Double tax = taxCalculator.calculateTax(income);
        String letter = letterBody.generateLetterBody(tax);
       
        String output = date + salut + letter;
        return output;
    }
}
