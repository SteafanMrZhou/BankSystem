package bankSystemDemo;

import java.util.Scanner;

/**
 * ���л����˻�
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
	
//	���û�ѡ��ʹ�������˻������ֹ���
	public void userChoiceWhichFunction(){
		System.out.println("��ӭ���������˻�ϵͳ����ѡ����Ҫ�����ҵ�����ͣ�");
		Scanner inputUserChoice = new Scanner(System.in);
		int receiveUserChoice = inputUserChoice.nextInt();
		switch(receiveUserChoice){
		  case 1:
//			  ���������˻�
//			  ����-���
			  userDepositing();
//			  ����-ȡ��
			  userWithdrowing();
//			  ����-��ѯ
			  userQuerying();
//			  ����-������Ϣ
			  bankCalculateProfits();
//			  ����-�ۼ���Ϣ
			  bankAccumulateProfits();
			  break;
		  case 2:
//			  ���ڴ�������˻�
			  BankAccount bankFixedTimeDeposit = new BankFixedTimeDeposit();
//			  ����-���
			  bankFixedTimeDeposit.userDepositing();
//			  ����-ȡ��
			  bankFixedTimeDeposit.userWithdrowing();
//			  ����-��ѯ
			  bankFixedTimeDeposit.userQuerying();
//			  ����-������Ϣ
			  bankFixedTimeDeposit.bankCalculateProfits();
//			  ����-�ۼ���Ϣ
			  bankFixedTimeDeposit.bankAccumulateProfits();
			  break;
		  case 3:
//			  ���ڴ�������˻�
			  BankAccount bankCurrentDeposit = new BankCurrentDeposit();
//			  ����-���
			  bankCurrentDeposit.userDepositing();
//			  ����-ȡ��
			  bankCurrentDeposit.userWithdrowing();
//			  ����-��ѯ
			  bankCurrentDeposit.userQuerying();
//			  ����-������Ϣ
			  bankCurrentDeposit.bankCalculateProfits();
//			  ����-�ۼ���Ϣ
			  bankCurrentDeposit.bankAccumulateProfits();
			  break;
		  case 4:
//			  ��ծ�����˻�
			  BankAccount bankNationalDebt = new bankNationalDebt();
//			  ��ծ-���
			  bankNationalDebt.userDepositing();
//			  ��ծ-ȡ��
			  bankNationalDebt.userWithdrowing();
//			  ��ծ-��ѯ
			  bankNationalDebt.userQuerying();
//			  ��ծ-������Ϣ
			  bankNationalDebt.bankCalculateProfits();
//			  ��ծ-�ۼ���Ϣ
			  bankNationalDebt.bankAccumulateProfits();
			  break;
		}
	}
//	��������-���
	@Override
	public void userDepositing() {
		
		
	}
//	��������-ȡ��
	@Override
	public void userWithdrowing() {
		
		
	}
//	��������-��ѯ
	@Override
	public void userQuerying() {
		
		
	}
//	��������-������Ϣ
	@Override
	public void bankCalculateProfits() {
		
		
	}
//	��������-�ۼ���Ϣ
	@Override
	public void bankAccumulateProfits() {
		
		
	}
//	������
	public static void main(String[] args){
		
	}
}