public class TestAccount {
    public static void main(String[] args){

        Account account = new Account();

        account.name="Karl";
        account.number=123456;
        account.agency="1";
        account.balance=100;
        account.openingDate=java.time.LocalDate.now();

        System.out.println(account.name);
        System.out.println(account.openingDate);
        System.out.println(account.number);

        account.toPrintBalance(); //100
        account.toDeposit(100);
        account.toPrintBalance(); //200
        account.toWithdraw(201);
        account.toPrintBalance(); //150
        account.monthIncome(); //10%
    }
}
