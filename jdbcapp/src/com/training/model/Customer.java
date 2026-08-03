package jdbcapp.model;

//POJO class
public class Customer {
	private Integer cutsomerId;
	private String name;
	private String mailId;
	private String contact;
	private String accountType;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer cutsomerId, String name, String mailId, String contact, String accountType) {
		this.cutsomerId = cutsomerId;
		this.name = name;
		this.mailId = mailId;
		this.contact = contact;
		this.accountType = accountType;
	}
	public Integer getCutsomerId() {
		return cutsomerId;
	}
	public void setCutsomerId(Integer cutsomerId) {
		this.cutsomerId = cutsomerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Customer [Cutsomer Id=" + cutsomerId + ", Customer name=" + name + ", Customer email=" + mailId + ", Customer contact=" + contact
				+ ", accountType=" + accountType + "]";
	}
	
	
	
}
