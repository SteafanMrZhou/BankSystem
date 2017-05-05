package bankSystemDemo;

import java.util.Scanner;

/**
 * 银行基本账户
 * @author Administrator
 *
 */
public class BankAccount implements IBankAccountMethod{
	private String userAccount;
	private String userName;
	private double userDepositeBalance;
	
	public BankAccount(){
		
	}
	public BankAccount(String userAccount, String userName, double userDepositeBalacne){
		this.userAccount = userAccount;
		this.userName = userName;
		this.userDepositeBalance = userDepositeBalacne;
	}
	
	public String getUserAccount(){
		return userAccount;
	}
	public String getUserName(){
		return userName;
	}
	public double getUserDepositeBalance(){
		return userDepositeBalance;
	}
	public void setUserAccount(String newUserAccount){
		this.userAccount = newUserAccount;
	}
	public void setUserName(String newUserName){
		this.userName = newUserName;
	}
	public void serUserDepositeBalance(double newUserDepositeBalance){
		this.userDepositeBalance = newUserDepositeBalance;
	}
	
//	让用户选择使用银行账户的哪种功能
	public void userChoiceWhichFunction(){
		System.out.println("欢迎光临银行账户系统，请选择您要办理的业务类型：");
		Scanner inputUserChoice = new Scanner(System.in);
		int receiveUserChoice = inputUserChoice.nextInt();
		switch(receiveUserChoice){
		  case 1:
//			  基本银行账户
//			  基本-存款
			  userDepositing();
//			  基本-取款
			  userWithdrowing();
//			  基本-查询
			  userQuerying();
//			  基本-计算利息
			  bankCalculateProfits();
//			  基本-累加利息
			  bankAccumulateProfits();
			  break;
		  case 2:
//			  定期存款银行账户
			  BankAccount bankFixedTimeDeposit = new BankFixedTimeDeposit();
//			  定期-存款
			  bankFixedTimeDeposit.userDepositing();
//			  定期-取款
			  bankFixedTimeDeposit.userWithdrowing();
//			  定期-查询
			  bankFixedTimeDeposit.userQuerying();
//			  定期-计算利息
			  bankFixedTimeDeposit.bankCalculateProfits();
//			  定期-累加利息
			  bankFixedTimeDeposit.bankAccumulateProfits();
			  break;
		  case 3:
//			  活期存款银行账户
			  BankAccount bankCurrentDeposit = new BankCurrentDeposit();
//			  活期-存款
			  bankCurrentDeposit.userDepositing();
//			  活期-取款
			  bankCurrentDeposit.userWithdrowing();
//			  活期-查询
			  bankCurrentDeposit.userQuerying();
//			  活期-计算利息
			  bankCurrentDeposit.bankCalculateProfits();
//			  活期-累加利息
			  bankCurrentDeposit.bankAccumulateProfits();
			  break;
		  case 4:
//			  国债银行账户
			  BankAccount bankNationalDebt = new bankNationalDebt();
//			  国债-存款
			  bankNationalDebt.userDepositing();
//			  国债-取款
			  bankNationalDebt.userWithdrowing();
//			  国债-查询
			  bankNationalDebt.userQuerying();
//			  国债-计算利息
			  bankNationalDebt.bankCalculateProfits();
//			  国债-累加利息
			  bankNationalDebt.bankAccumulateProfits();
			  break;
		}
	}
//	基本功能-存款
	@Override
	public void userDepositing() {
		
		
	}
//	基本功能-取款
	@Override
	public void userWithdrowing() {
		
		
	}
//	基本功能-查询
	@Override
	public void userQuerying() {
		
		
	}
//	基本功能-计算利息
	@Override
	public void bankCalculateProfits() {
		
		
	}
//	基本功能-累加利息
	@Override
	public void bankAccumulateProfits() {
		
		
	}
//	主方法
	public static void main(String[] args){
		
	}
}