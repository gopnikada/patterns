package Behavioral.ChainOfResp;

public class TenDispenser extends PaperCurrencyDispenser{
    public TenDispenser() {
        super();
    }

    @Override
    public void dispense(PaperCurrency currency) {
        if(currency != null){
            int amount = currency.getAmount();
            int remain = amount;
            if(amount >= 10){
                int count = amount/10;
                remain = amount%10;
                System.out.println(count + "x 10 $ dispenced");
            }
            if(remain > 0 && this.nextDispenser != null){
                this.nextDispenser.dispense(new PaperCurrency(remain));
            }

        }
    }
}
