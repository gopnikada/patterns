package Behavioral.ChainOfResp;

public class ATMWithdrawal {
    protected static PaperCurrencyDispenser hundredDispenser = new HundredDispenser();
    protected static PaperCurrencyDispenser fiftyDispenser = new FiftyDispenser();
    protected static PaperCurrencyDispenser tenDispenser = new TenDispenser();
    protected static PaperCurrencyDispenser dispenserChain;
    static {
        hundredDispenser.setNextDispenser(fiftyDispenser);
        fiftyDispenser.setNextDispenser(tenDispenser);
        dispenserChain = hundredDispenser;
    }

    public static void withdraw(PaperCurrency currency) {
        if (currency != null) {
            dispenserChain.dispense(currency);
        }
    }

}
