package goodCode;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class CalculateTax extends JFrame implements ActionListener {

    private static IncomeTaxFactory myTax;
    private static TaxMaster myTaxClient;

    private JLabel promptName;
    private JLabel promptProvince;
    private JLabel promptAddress;
    private JLabel promptIncome;
    private JTextField inputName;
    private JTextField inputProvince;
    private JTextField inputAddress;
    private JTextArea outputArea;
    private JTextField inputIncome;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    String gender;
    private ActionListener myActionHandler;

    public CalculateTax(){
        super("Calculate Tax");
        setLayout(new FlowLayout());
        /* myActionHandler handles the event of selecting a radio button */
        myActionHandler = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gender = ((JRadioButton) e.getSource()).getText();
            }
        };

        promptName = new JLabel("Enter Name");
        add(promptName);
        inputName = new JTextField(20);
        add(inputName);
        promptAddress = new JLabel("Enter Address");
        add(promptAddress);
        inputAddress = new JTextField(20);
        add(inputAddress);
        promptProvince = new JLabel("Enter Province");
        add(promptProvince);
        inputProvince = new JTextField(20);
        add(inputProvince);
        promptIncome = new JLabel("Enter Income");
        add(promptIncome);
        inputIncome = new JTextField(20);
        add(inputIncome);
        inputIncome.addActionListener(this);
        outputArea = new JTextArea(20, 30);
        add(outputArea);
        maleButton = new JRadioButton("male", false);
        femaleButton = new JRadioButton("female", false);
        add(maleButton);
        add(femaleButton);
        maleButton.addActionListener(myActionHandler);
        femaleButton.addActionListener(myActionHandler);
        setSize(400,550);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt){
        String province;
        double income;
        String name;
        String address;
        name = inputName.getText();
        address = inputAddress.getText();
        province = inputProvince.getText();
        income = Double.parseDouble(inputIncome.getText());

        Calendar cal;
        SimpleDateFormat sdf;
        cal = Calendar.getInstance();
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        String today = sdf.format(cal.getTime());

        if (province.equalsIgnoreCase("Ontario")){
            myTax = new OntarioTaxFactory();
        }
        else if (province.equalsIgnoreCase("Quebec")){
            myTax = new QuebecTaxFactory();
        }
        else {
            System.out.println("Not a valid province!");
            return;
        }

        myTaxClient = new TaxMaster(myTax);
        String outputTax = myTaxClient.generateLetter(name, gender, address, province, income, today);
        outputArea.setText(outputTax);
        inputName.setText("");
        inputAddress.setText("");
        inputProvince.setText("");
        inputIncome.setText("");
    }


    public static void main(String a[]){
        CalculateTax newFrame = new CalculateTax();
    }

}
