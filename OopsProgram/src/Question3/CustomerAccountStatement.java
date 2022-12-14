package Question3;

public class CustomerAccountStatement extends Customer {
	
	  private int CAID;
      private double amount;
      private double deposit_withdrawl;
      private String deposit_date;



    public CustomerAccountStatement(int custId, int accountno, String custname, String cust_dob,
              String cust_account_opening_date, String branch_Obj, int cAID, double amount, double deposit_withdrawl,
              String deposit_date) {
         super(custId, accountno, custname, cust_dob, cust_account_opening_date, branch_Obj);
          CAID = cAID;
          this.amount = amount;
          this.deposit_withdrawl = deposit_withdrawl;
          this.deposit_date = deposit_date;
      }





    public int getCAID() {
          return CAID;
      }





    public void setCAID(int cAID) {
          CAID = cAID;
      }





    public double getAmount() {
          return amount;
      }





    public void setAmount(double amount) {
          this.amount = amount;
      }





    public double getDeposit_withdrawl() {
          return deposit_withdrawl;
      }





    public void setDeposit_withdrawl(double deposit_withdrawl) {
          this.deposit_withdrawl = deposit_withdrawl;
      }





    public String getDeposit_date() {
          return deposit_date;
      }





    public void setDeposit_date(String deposit_date) {
          this.deposit_date = deposit_date;
      }



    @Override
      public String toString() {
          return "Customer_Account_Statement [CAID=" + CAID + ", amount=" + amount + ", deposit_withdrawl="
                  + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
      }

    public static void main(String[] args) {
  	  CustomerAccountStatement customerAccountStatement = new CustomerAccountStatement(101, 121020, "Ram",
                  "1/1/21", "1/1/22", "branch_Obj", 10, 5000.01, 500.01, "23/08/2021");
         System.out.println(customerAccountStatement);
	}
}
