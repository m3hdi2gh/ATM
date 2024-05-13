/*
 * ATM.java
 * Student name: Mehdi Gholami
 * Student ID: 40213426
 * Email: m3hdigholami@aut.ac.ir
 * Assignment: Second Assignment of Advance programing Course (Graphic and Class) - ATM Program
 * Description: A simple ATM GUI.
 */
// Importing the necessary libraries
import javax.swing.*;
import java.awt.*;

// Main class that extends JFrame for GUI
public class ATM  extends JFrame {
    // Main method
    public static void main(String[] args) {
        // Creating a new instance of StartFrame
        new StartFrame();
    }
}

// StartFrame class for the start page of the ATM
class StartFrame extends JFrame {
    // Constructor for StartFrame
    StartFrame() {
        // Setting up the frame
        setTitle("Start Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating and setting up a label
        JLabel label = new JLabel("زبان خود را انتخاب کنید");
        label.setBounds(350, 200, 200, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        // Creating and setting up a button for English language
        JButton en = new JButton("English");
        en.setBounds(5, 240, 140, 60);
        en.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        en.addActionListener(e -> new PasswordFrame());
        add(en);

        // Creating and setting up a button for Persian language
        JButton per = new JButton("فارسی");
        per.setBounds(740, 240, 140, 60);
        per.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        per.addActionListener(e -> new PasswordFrame());
        add(per);
        setVisible(true);
    }
}

// PasswordFrame class for the password page of the ATM
class PasswordFrame extends JFrame {
    // Constructor for PasswordFrame
    PasswordFrame() {
        // Setting up the frame
        setTitle("Password Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating and setting up a label
        JLabel label = new JLabel("رمز خود را وارد کنید");
        label.setBounds(375, 200, 200, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        // Creating and setting up a password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(350, 240, 200, 30);
        add(passwordField);

        // Creating and setting up a button for entering the password
        JButton ent = new JButton("ثبت");
        ent.setBounds(375, 480, 140, 60);
        ent.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        ent.addActionListener(e -> new ATMPage());
        add(ent);

        // Creating and setting up a button for going back
        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {
            dispose();
            new StartFrame();
        });
        add(back);

        setVisible(true);
    }
}

// ATMPage class for the main page of the ATM
class ATMPage extends JFrame {
    // Constructor for ATMPage
    ATMPage() {
        // Setting up the frame
        setTitle("ATM Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating and setting up a button for cash-out
        JButton cashOut = new JButton("برداشت وجه");
        cashOut.setBounds(5, 150, 140, 60);
        cashOut.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        cashOut.addActionListener(e -> new CashOutPage());
        add(cashOut);

        // Creating and setting up a button for changing the password
        JButton passChange = new JButton("تغییر رمز");
        passChange.setBounds(740, 150, 140, 60);
        passChange.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        passChange.addActionListener(e -> new ChangePasswordPage());
        add(passChange);

        // Creating and setting up a button for transferring money
        JButton transfer = new JButton("کارت به کارت");
        transfer.setBounds(5, 350, 140, 60);
        transfer.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        transfer.addActionListener(e -> new TransferPage());
        add(transfer);

        // Creating and setting up a button for checking the balance
        JButton balance = new JButton("اعلام موجودی");
        balance.setBounds(740, 350, 140, 60);
        balance.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        balance.addActionListener(e -> new BalancePage());
        add(balance);

        // Creating and setting up a button for going back
        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {

            dispose();
            new PasswordFrame();
        });
        add(back);

        setVisible(true);
    }
}

// CashOutPage class for the cash-out page of the ATM
class CashOutPage extends JFrame {
    // Constructor for CashOutPage
    CashOutPage() {
        // Setting up the frame
        setTitle("Cash Out Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating and setting up a button for cashing out 50000
        JButton num1 = new JButton("50000");
        num1.setBounds(5, 150, 140, 60);
        num1.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        num1.addActionListener(e -> new BalancePage.SuccessPage());
        add(num1);

        // Creating and setting up a button for cashing out 100000
        JButton num2 = new JButton("100000");
        num2.setBounds(740, 150, 140, 60);
        num2.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        num2.addActionListener(e -> new BalancePage.SuccessPage());
        add(num2);

        // Creating and setting up a button for cashing out 150000
        JButton num3 = new JButton("150000");
        num3.setBounds(5, 350, 140, 60);
        num3.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        num3.addActionListener(e -> new BalancePage.SuccessPage());
        add(num3);

        // Creating and setting up a button for cashing out 200000
        JButton num4 = new JButton("200000");
        num4.setBounds(740, 350, 140, 60);
        num4.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        num4.addActionListener(e -> new BalancePage.SuccessPage());
        add(num4);

        // Creating and setting up a button for going back
        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {

            dispose();
            new ATMPage();
        });
        add(back);

        setVisible(true);
    }
}

// ChangePasswordPage class for the change password page of the ATM
class ChangePasswordPage extends JFrame {
    // Constructor for ChangePasswordPage
    ChangePasswordPage() {
        // Setting up the frame
        setTitle("Change Password Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating and setting up a label
        JLabel label = new JLabel("رمز جدید خود را وارد کنید");
        label.setBounds(350, 200, 300, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        // Creating and setting up a password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(350, 240, 200, 30);
        add(passwordField);

        // Creating and setting up a button for entering the new password
        JButton ent = new JButton("تایید");
        ent.setBounds(375, 480, 140, 60);
        ent.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        ent.addActionListener(e -> new BalancePage.SuccessPage());
        add(ent);

        // Creating and setting up a button for going back
        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {

            dispose();
            new ATMPage();
        });
        add(back);

        setVisible(true);
    }
}

// TransferPage class for the transfer page of the ATM
class TransferPage extends JFrame {
    // Constructor for TransferPage
    TransferPage() {
        // Setting up the frame
        setTitle("Transfer Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating and setting up a label
        JLabel label = new JLabel("مبلغ مورد نظر خود را وارد کنید");
        label.setBounds(330, 200, 300, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        // Creating and setting up a text field for entering the amount
        JTextField textField = new JTextField();
        textField.setBounds(350, 240, 200, 30);
        add(textField);

        // Creating and setting up a label
        JLabel label2 = new JLabel("شماره کارت مقصد خود را وارد کنید");
        label2.setBounds(315, 280, 300, 30);
        label2.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label2);

        // Creating and setting up a text field for entering the destination card number
        JTextField textField2 = new JTextField();
        textField2.setBounds(350, 320, 200, 30);
        add(textField2);

        // Creating and setting up a button for entering the amount and the destination card number
        JButton ent = new JButton("تایید");
        ent.setBounds(375, 480, 140, 60);
        ent.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        ent.addActionListener(e -> new BalancePage.SuccessPage());
        add(ent);

        // Creating and setting up a button for going back
        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {

            dispose();
            new ATMPage();
        });
        add(back);

        setVisible(true);
    }
}

// BalancePage class for the balance page of the ATM
class BalancePage extends JFrame {
    // Constructor for BalancePage
    BalancePage() {
        // Setting up the frame
        setTitle("Balance Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating and setting up a label
        JLabel label = new JLabel("موجودی حساب شما 100000 تومان است");
        label.setBounds(300, 200, 400, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        // Creating and setting up a button for going back
        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {

            dispose();
            new ATMPage();
        });
        add(back);

        setVisible(true);
    }

    // SuccessPage class for the success page of the ATM
    static class SuccessPage extends JFrame {
        // Constructor for SuccessPage
        SuccessPage() {
            // Setting up the frame
            setTitle("Success Page");
            setSize(new Dimension(900, 600));
            getContentPane().setBackground(Color.cyan);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            // Creating and setting up a label
            JLabel label = new JLabel("عملیات با موفقیت انجام شد");
            label.setBounds(300, 200, 400, 30);
            label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
            add(label);

            // Creating and setting up a button for going back
            JButton back = new JButton("بازگشت");
            back.setBounds(5, 15, 70, 30);
            back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
            back.addActionListener(e -> {

                dispose();
                new ATMPage();
            });
            add(back);

            setVisible(true);
        }
    }
}