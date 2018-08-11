package lti.pojo;


import javax.persistence.*;

@Entity //mandatory
@Table(name="cust")
@SequenceGenerator(sequenceName="cust_seq", name="myseq")

@NamedQuery(name="getAllCust", query="from Customer")

public class Customer {

	@Id //mandatory
	@Column(name="cust_id")
	@GeneratedValue(generator="myseq") //to auto-generate values
	private int custId;
	@Column(name="cust_name",length =30)
	private String custName;
	@Column(name="cr_limit")
	private double creditLimit;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}
