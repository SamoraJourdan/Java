package classwork;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setAccountNumber(1442354253);
        acc1.setCustName("Sam Jourdan");
        acc1.setEmail("sj33@gmail.com");
        acc1.setPhoneNum("0816789045");
        acc1.DepositFunds(5000);
        acc1.WithdrawFunds(10000);
        acc1.WithdrawFunds(4000);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tom", 100.00, "Tom@email.com");
        System.out.println(person3.getName());
    }

}
