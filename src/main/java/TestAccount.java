public class TestAccount {
    public static void main(String[] args){

        Account account = new Account();

        account.name="Karl";
        account.number=123456;
        account.agency="1";
        account.balance=100;
        account.openingDate=java.time.LocalDate.now();

        account.printBalance(); //100
        account.toDeposit(100);
        account.printBalance(); //200
        account.toWithdraw(201);
        account.printBalance(); //150
        account.monthIncome(); //10%
        account.toPrintAccountData();
    }
}
