package sample.activemq;

import java.io.Serializable;

public class Account implements Serializable {

	float amt;

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}
	
	
}
