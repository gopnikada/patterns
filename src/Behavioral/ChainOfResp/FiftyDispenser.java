package Behavioral.ChainOfResp;

public class FiftyDispenser extends PaperCurrencyDispenser{
    public FiftyDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if(currency != null){
            int amount = currency.getAmount();
            int remain = amount;
            if(amount >= 50){
                int count = amount/50;
                remain = amount%50;
                System.out.println(count + "x 50$ dispenced");
            }
            if(remain > 0 && this.nextDispenser != null){
                this.nextDispenser.dispense(new PaperCurrency(remain));
            }

        }
    }
}
