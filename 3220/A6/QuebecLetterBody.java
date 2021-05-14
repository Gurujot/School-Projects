package goodCode;

public class QuebecLetterBody extends LetterBody {
    public String generateLetterBody(double taxPayable) {
            return "Votre taxe est $" + taxPayable + "\n\n" + "Sincerement votre";
    }
}
