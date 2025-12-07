// File: BankFacadeDemo.java
// Facade hides ATM operations

class CardValidator { void validate() { System.out.println("Card Validated"); } }
class PinChecker { void checkPin() { System.out.println("PIN Verified"); } }
class CashDispenser { void dispense() { System.out.println("Cash Dispensed"); } }

// Facade
class ATMFacade {
    CardValidator cv = new CardValidator();
    PinChecker pc = new PinChecker();
    CashDispenser cd = new CashDispenser();

    public void withdraw() {
        cv.validate();
        pc.checkPin();
        cd.dispense();
    }
}

public class BankFacadeDemo {
    public static void main(String[] args) {
        new ATMFacade().withdraw();
    }
}
