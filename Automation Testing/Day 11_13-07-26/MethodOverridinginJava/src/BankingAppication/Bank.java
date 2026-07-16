package BankingAppication;



class Banks {

    public void calculateInterest() {
        System.out.println("General Interest Calculation");
    }
}

class SBI extends Banks {

    @Override
    public void calculateInterest() {
        System.out.println("SBI Interest = 6.5%");
    }
}

class HDFC extends Banks {

    @Override
    public void calculateInterest() {
        System.out.println("HDFC Interest = 7%");
    }
}

public class  Bank {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        sbi.calculateInterest();

        HDFC hdfc = new HDFC();
        hdfc.calculateInterest();
    }
}