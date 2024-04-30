import javax.swing.*;
import java.awt.*;

public class ATM  extends JFrame {

    public static void main(String[] args) {

        new StartFrame();

    }
}

class StartFrame extends JFrame {
    StartFrame() {
        // tanzimat marboot be Frame
        setTitle("Start Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // label baraye entekhab zaban
        JLabel label = new JLabel("زبان خود را انتخاب کنید");
        label.setBounds(350, 200, 200, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        // dokme baraye zaban englisi
        JButton en = new JButton("English");
        en.setBounds(5, 240, 140, 60);
        en.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        en.addActionListener(e -> new PasswordFrame());
        add(en);

        // dokme baraye zaban farsi
        JButton per = new JButton("فارسی");
        per.setBounds(740, 240, 140, 60);
        per.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        per.addActionListener(e -> new PasswordFrame());
        add(per);
        setVisible(true);
    }
}

class PasswordFrame extends JFrame {
    PasswordFrame() {
        setTitle("Password Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("رمز خود را وارد کنید");
        label.setBounds(375, 200, 200, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(350, 240, 200, 30);
        add(passwordField);

        JButton ent = new JButton("ثبت");
        ent.setBounds(375, 480, 140, 60);
        ent.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        ent.addActionListener(e -> new ATMPage());
        add(ent);

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

class ATMPage extends JFrame {
    ATMPage() {
        setTitle("ATM Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton cashOut = new JButton("برداشت وجه");
        cashOut.setBounds(5, 150, 140, 60);
        cashOut.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(cashOut);

        JButton passChange = new JButton("تغییر رمز");
        passChange.setBounds(740, 150, 140, 60);
        passChange.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(passChange);

        JButton transfer = new JButton("کارت به کارت");
        transfer.setBounds(5, 350, 140, 60);
        transfer.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(transfer);

        JButton balance = new JButton("اعلام موجودی");
        balance.setBounds(740, 350, 140, 60);
        balance.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(balance);

        cashOut.addActionListener(e -> new CashOutPage());

        passChange.addActionListener(e -> new ChangePasswordPage());

        transfer.addActionListener(e -> new TransferPage());

        balance.addActionListener(e -> new BalancePage());

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

class CashOutPage extends JFrame {
    CashOutPage() {
        setTitle("Cash Out Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton num1 = new JButton("50000");
        num1.setBounds(5, 150, 140, 60);
        num1.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(num1);

        JButton num2 = new JButton("100000");
        num2.setBounds(740, 150, 140, 60);
        num2.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(num2);

        JButton num3 = new JButton("150000");
        num3.setBounds(5, 350, 140, 60);
        num3.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(num3);

        JButton num4 = new JButton("200000");
        num4.setBounds(740, 350, 140, 60);
        num4.setFont(new Font("Vazirmatn", Font.BOLD, 18));
        add(num4);

        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {
            dispose();
            new ATMPage();
        });
        add(back);

        num1.addActionListener(e -> new BalancePage.Success());

        num2.addActionListener(e -> new BalancePage.Success());

        num3.addActionListener(e -> new BalancePage.Success());

        num4.addActionListener(e -> new BalancePage.Success());

        setVisible(true);
    }
}

class ChangePasswordPage extends JFrame {
    ChangePasswordPage() {
        setTitle("Change Password Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("رمز جدید خود را وارد کنید");
        label.setBounds(350, 200, 300, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        // passwordField baraye vared kardan ramz
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(350, 240, 200, 30);
        add(passwordField);

        // dokme baraye varoud be safheye ATM
        JButton ent = new JButton("تایید");
        ent.setBounds(375, 480, 140, 60);
        ent.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(ent);

        // dokme baraye bargasht be safheye ghabl
        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {
            dispose();
            new ATMPage();
        });
        add(back);

        ent.addActionListener(e -> new BalancePage.Success());

        setVisible(true);

        // baqiye class ha be hamin tarz
    }
}

class TransferPage extends JFrame {
    TransferPage() {
        setTitle("Transfer Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("مبلغ مورد نظر خود را وارد کنید");
        label.setBounds(330, 200, 300, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

        JTextField textField = new JTextField();
        textField.setBounds(350, 240, 200, 30);
        add(textField);

        JLabel label2 = new JLabel("شماره کارت مقصد خود را وارد کنید");
        label2.setBounds(315, 280, 300, 30);
        label2.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(350, 320, 200, 30);
        add(textField2);

        JButton ent = new JButton("تایید");
        ent.setBounds(375, 480, 140, 60);
        ent.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(ent);

        JButton back = new JButton("بازگشت");
        back.setBounds(5, 15, 70, 30);
        back.setFont(new Font("Vazirmatn", Font.BOLD, 10));
        back.addActionListener(e -> {
            dispose();
            new ATMPage();
        });
        add(back);

        ent.addActionListener(e -> new BalancePage.Success());

        setVisible(true);
    }
}

class BalancePage extends JFrame {
    BalancePage() {
        setTitle("Balance Page");
        setSize(new Dimension(900, 600));
        getContentPane().setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("موجودی حساب شما 100000 تومان است");
        label.setBounds(300, 200, 400, 30);
        label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
        add(label);

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
    static class Success extends JFrame {
        Success() {
            setTitle("Success Page");
            setSize(new Dimension(900, 600));
            getContentPane().setBackground(Color.cyan);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JLabel label = new JLabel("عملیات با موفقیت انجام شد");
            label.setBounds(300, 200, 400, 30);
            label.setFont(new Font("Vazirmatn", Font.BOLD, 20));
            add(label);

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