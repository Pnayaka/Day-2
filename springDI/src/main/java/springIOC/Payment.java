package springIOC;

public class Payment {
	
	Payment(){}
	
	private UPIPay UPIPayment;
	
	String action;
	
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public UPIPay getPerson() {
		return UPIPayment;
	}

	public Payment(UPIPay UPIPayment) {
		this.UPIPayment = UPIPayment;
	}

	public void setPerson(UPIPay UPIPayment) {
		this.UPIPayment = UPIPayment;
	}

	@Override
	public String toString() {
		return "Payment [Payment=" + UPIPayment + ", action=" + action + ", type=" + type + ", getType()=" + getType()
				+ ", getAction()=" + getAction() + ", getPerson()=" + getPerson() + "]";
	}

}
