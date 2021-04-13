import java.time.LocalDate;

public class Account {
    String name;
    int number;
    String agency;
    double balance;
    Date openingDate = new Date();

    void toWithdraw(double quantity){
        if(quantity <= 0 || quantity > balance)
            System.out.println("Quantity NOT permited");
        else
            balance -= quantity;
    }

    void toDeposit(double deposit){
        if(deposit <= 0)
            System.out.println("Quantity NOT valid");
        else
            balance += deposit;
    }

    void monthIncome(){
        System.out.println("Monthly income = " + balance*0.1);
    }

    void printBalance(){
        System.out.println("Account balance = " + balance);
    }

    String toPrintAccountData(){
        String data = "Name: " + this.name + "\n" +
                "Account: " + number + "\n" +
                "Agency: " + agency + "\n" +
                "Balance: " + balance + "\n" +
                "Opened since: " + openingDate.formatDate();
        return data;
    }
}
