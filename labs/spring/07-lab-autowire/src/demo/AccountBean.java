package demo;

public class AccountBean {

	CreditCardBean card;

	

	public CreditCardBean getCard() {
		return card;
	}

	
/**
	public AccountBean(CreditCardBean card)
	{
		this.card= card;
	}
	
	**/
	
	public void setCard(CreditCardBean card) {
		this.card = card;
	}
	
	
	public void disp()
	{
		System.out.println("In Account Bean, card no : "+ card.getNo());
	}
}
