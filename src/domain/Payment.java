package domain;

import java.util.Date;

public class Payment {

	public  String PAY_ID ;
	 public String POLCY_ID;
	 public  float PAY_AMT;
	 public String PAY_MOD;
	  public long PAY_PHONE;
	  public Date PAY_NEXT_DT;
	  public Date PAY_DT;
	  public String CUSTOMER_ID ;
	  public String PAY_DIR_REG;
	  public int PAY_COUNT ;
	public String getPAY_ID() {
		return PAY_ID;
	}
	public void setPAY_ID(String pAY_ID) {
		PAY_ID = pAY_ID;
	}
	public String getPOLCY_ID() {
		return POLCY_ID;
	}
	public void setPOLCY_ID(String pOLCY_ID) {
		POLCY_ID = pOLCY_ID;
	}
	public float getPAY_AMT() {
		return PAY_AMT;
	}
	public void setPAY_AMT(float pAY_AMT) {
		PAY_AMT = pAY_AMT;
	}
	public String getPAY_MOD() {
		return PAY_MOD;
	}
	public void setPAY_MOD(String pAY_MOD) {
		PAY_MOD = pAY_MOD;
	}
	public long getPAY_PHONE() {
		return PAY_PHONE;
	}
	public void setPAY_PHONE(long pAY_PHONE) {
		PAY_PHONE = pAY_PHONE;
	}
	public Date getPAY_NEXT_DT() {
		return PAY_NEXT_DT;
	}
	public void setPAY_NEXT_DT(Date pAY_NEXT_DT) {
		PAY_NEXT_DT = pAY_NEXT_DT;
	}
	public Date getPAY_DT() {
		return PAY_DT;
	}
	public void setPAY_DT(Date pAY_DT) {
		PAY_DT = pAY_DT;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getPAY_DIR_REG() {
		return PAY_DIR_REG;
	}
	public void setPAY_DIR_REG(String pAY_DIR_REG) {
		PAY_DIR_REG = pAY_DIR_REG;
	}
	public int getPAY_COUNT() {
		return PAY_COUNT;
	}
	public void setPAY_COUNT(int pAY_COUNT) {
		PAY_COUNT = pAY_COUNT;
	}
	  
}
