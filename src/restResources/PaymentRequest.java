package restResources;

public class PaymentRequest {
	 
    private int userId;
    private String itemId;
    private double discount;
    private String user;
    private String pass;
 
    public String getItemId() {
        return itemId;
    }
 
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
 
    public double getDiscount() {
        return discount;
    }
 
    public void setDiscount(double discount) {
        this.discount = discount;
    }
 
    public int getUserId() {
        return userId;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
 
}