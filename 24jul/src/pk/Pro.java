package pk;

public class Pro {

	public static void main(String[] args) {
		BankAccount act = new BankAccount(5250, 750000);
		
		Transaction t1 = new Transaction(act, 10000, Transaction.MODE_WITHDRAW);
		Transaction t2 = new Transaction(act, 12000, Transaction.MODE_WITHDRAW);
		Transaction t3 = new Transaction(act, 20000, Transaction.MODE_WITHDRAW);
		Transaction t4 = new Transaction(act, 40000, Transaction.MODE_WITHDRAW);
		Transaction t5 = new Transaction(act, 55000, Transaction.MODE_WITHDRAW);
		Transaction t6 = new Transaction(act, 1000, Transaction.MODE_WITHDRAW);
		Transaction t7 = new Transaction(act, 8000, Transaction.MODE_WITHDRAW);
		Transaction t8 = new Transaction(act, 800000, Transaction.MODE_WITHDRAW);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		

	}

}
