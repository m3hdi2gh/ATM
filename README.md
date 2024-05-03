# :bank: ATM Project

The second exercise of the advanced programming course (Spring 2024)

This simple ATM (Automated Teller Machine) application is written in Java. The application simulates the basic operations of an ATM such as cash withdrawal, balance inquiry, money transfer, and password change.

## :star2: Features

- :globe_with_meridians: **Language Selection**: The application supports both English and Persian languages.
- :lock: **Password Authentication**: Users must enter their password to access the ATM services.
- :money_with_wings: **Cash Withdrawal**: Users can withdraw cash in predefined amounts.
- :moneybag: **Balance Inquiry**: Users can check their account balance.
- :credit_card: **Money Transfer**: Users can transfer money to another account.
- :key: **Password Change**: Users can change their password.

## :file_folder: Code Structure

The application is divided into several classes, each representing a different frame in the application:

- `ATM`: This is the main class that starts the application.
- `StartFrame`: This class represents the initial frame where users can select their preferred language.
- `PasswordFrame`: This class represents the frame where users must enter their password.
- `ATMPage`: This class represents the main ATM frame where users can choose the operation they want to perform.
- `CashOutPage`: This class represents the frame where users can withdraw cash.
- `ChangePasswordPage`: This class represents the frame where users can change their password.
- `TransferPage`: This class represents the frame where users can transfer money to another account.
- `BalancePage`: This class represents the frame where users can check their account balance.

## :rocket: Running the Application

To run the application, simply execute the `ATM` class. The application uses Java Swing for the GUI, so make sure you have the Java Development Kit (JDK) installed on your machine.

## :bulb: Future Improvements

- Add a database to store user information and transaction history.
- Implement more ATM services such as deposit, mini statement, etc.
- Improve the GUI design and user experience.
