package Behavioral.ChainOfResp;

public class HundredDispenser extends PaperCurrencyDispenser{
    public HundredDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if(currency != null){
            int amount = currency.getAmount();
            int remain = amount;
            if(amount >= 100){
                int count = amount/100;
                remain = amount%100;
                System.out.println(count + "x 100$ dispenced");
            }
            if(remain > 0 && this.nextDispenser != null){
                this.nextDispenser.dispense(new PaperCurrency(remain));
            }

        }
    }
}
