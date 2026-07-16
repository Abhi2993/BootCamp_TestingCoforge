package AbstractionTestDemo;


abstract class Banks {

    public void deposit() {
        System.out.println("Money Deposited");
    }

    public void withdraw() {
        System.out.println("Money Withdrawn");
    }

    abstract void calculateInterest();
}

class SBI extends Banks {

    @Override
    void calculateInterest() {
        System.out.println("SBI Interest = 6.5%");
    }
}

class HDFC extends Banks {

    @Override
    void calculateInterest() {
        System.out.println("HDFC Interest = 7%");
    }
}

public class Bank{

    public static void main(String[] args) {

        SBI sbi = new SBI();
        sbi.deposit();
        sbi.withdraw();
        sbi.calculateInterest();

    }
}