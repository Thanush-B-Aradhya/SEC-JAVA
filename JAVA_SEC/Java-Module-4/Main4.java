// Parent class
class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

// Subclass 1
class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Paid using Credit Card.");
    }
}

// Subclass 2
class UPIPayment extends Payment {
    void pay() {
        System.out.println("Paid using UPI.");
    }
}

// Subclass 3
class NetBankingPayment extends Payment {
    void pay() {
        System.out.println("Paid using Net Banking.");
    }
}

public class Main4 {
    public static void main(String[] args) {

        // Polymorphic reference
        Payment p;

        p = new CreditCardPayment();
        p.pay();   // Calls CreditCardPayment.pay()

        p = new UPIPayment();
        p.pay();   // Calls UPIPayment.pay()

        p = new NetBankingPayment();
        p.pay();   // Calls NetBankingPayment.pay()
    }
}
