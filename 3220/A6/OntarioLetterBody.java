package goodCode;

public class OntarioLetterBody extends LetterBody {
    public String generateLetterBody(double taxPayable) {
    	return "Your tax is $" + taxPayable + "\n\n" + "Yours sincerely";
    }
}
