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
	private int recieveUserDepositing;
	private int recieveUserWidthdrow;
	
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
//	���û�ѡ��ʹ�����ּ���������˻������ֹ���
	public void userChoiceWhichFunction(){
		System.out.println("��ӭ���������˻�ϵͳ����ѡ����Ҫ�����ҵ�����ͣ�");
		System.out.println("1.���������˻�");
		System.out.println("2.���������˻�");
		System.out.println("3.���������˻�");
		System.out.println("4.��ծ�����˻�");
		Scanner inputUserChoice = new Scanner(System.in);
		int receiveUserChoice = inputUserChoice.nextInt();
		switch(receiveUserChoice){
//		  ���������˻�
		  case 1:
			  userChoiceWhichAccount();
			  Scanner inputUserChoiceAccount = new Scanner(System.in);
			  String recieveUserChoiceAccount = inputUserChoiceAccount.nextLine();
//			  ����-A-���
			  switch(recieveUserChoiceAccount){
			    case "A":
			    	userDepositing();
			    	break;
			    case "a":
			    	userDepositing();
			    	break;
//			 ����-B-ȡ��
		        case "B":
			        userWithdrowing();
			        break;
		        case "b":
		            userWithdrowing();
		            break;
//			����-C-��ѯ
		        case "C":        
				      userQuerying();
				      break;
		        case "c":        
				      userQuerying();
				      break;
//			����-D-������Ϣ
		        case "D":
				      bankCalculateProfits();
				      break;
		        case "d":
				      bankCalculateProfits();
				      break;
//			����-E-�ۼ���Ϣ
		        case "E":
				      bankAccumulateProfits();
				      break;
		        case "e":
				      bankAccumulateProfits();
				      break;
			  } 	
			  break;
		  case 2:
//			  ���ڴ�������˻�
			  BankFixedTimeDeposit bankFixedTimeDeposit = new BankFixedTimeDeposit();
			  bankFixedTimeDeposit.userChoiceWhichFixedTimeAccount();
			  Scanner inputUserChoiceFixedTimeAccount = new Scanner(System.in);
			  String recieveUserChoiceFixedTimeAccount = inputUserChoiceFixedTimeAccount.nextLine();
			  switch(recieveUserChoiceFixedTimeAccount){
//			                     ����-A-���
			    case "A":
			    	bankFixedTimeDeposit.userDepositing();
			    	break;
			    case "a":
			    	bankFixedTimeDeposit.userDepositing();
			    	break;
//					  ����-B-ȡ��
			    case "B":
			    	bankFixedTimeDeposit.userWithdrowing();
			    	break;
			    case "b":
			    	bankFixedTimeDeposit.userWithdrowing();
			    	break;
//					  ����-C-��ѯ
			    case "C":
			    	bankFixedTimeDeposit.userQuerying();
			    	break;
			    case "c":
			    	bankFixedTimeDeposit.userQuerying();
			    	break;
//					  ����-D-������Ϣ
			    case "D":
			    	bankFixedTimeDeposit.bankCalculateProfits();
			    	break;
			    case "d":
			    	bankFixedTimeDeposit.bankCalculateProfits();
			    	break;
//					  ����-E-�ۼ���Ϣ
			    case "E":
			    	bankFixedTimeDeposit.bankAccumulateProfits();
			    	break;
			    case "e":
			    	bankFixedTimeDeposit.bankAccumulateProfits();
			    	break;
			  }
			  break;
		case 3:
//		  ���ڴ�������˻�
		BankCurrentDeposit bankCurrentDeposit = new BankCurrentDeposit();
		bankCurrentDeposit.userChoiceWhichCurrentAccount();
		Scanner inputUserChoiceCurrentAccount = new Scanner(System.in);
		String recieveUserChoiceCurrentAccount = inputUserChoiceCurrentAccount.nextLine();
		switch(recieveUserChoiceCurrentAccount){
//		           ����-A-���
		  case "A":
			  bankCurrentDeposit.userDepositing();
			  break;
		  case "a":
			  bankCurrentDeposit.userDepositing();
			  break;
//			  ����-B-ȡ��
		  case "B":
			  bankCurrentDeposit.userWithdrowing();
			  break;
		  case "b":
			  bankCurrentDeposit.userWithdrowing();
			  break;
//			  ����-C-��ѯ
		  case "C":
			  bankCurrentDeposit.userQuerying();
			  break;
		  case "c":
			  bankCurrentDeposit.userQuerying();
			  break;
//			  ����-D-������Ϣ
		  case "D":
			  bankCurrentDeposit.bankCalculateProfits();
			  break;
		  case "d":
			  bankCurrentDeposit.bankCalculateProfits();
			  break;
//			  ����-E-�ۼ���Ϣ
		  case "E":
			  bankCurrentDeposit.bankAccumulateProfits();
			  break;
		  case "e":
			  bankCurrentDeposit.bankAccumulateProfits();
			  break;
	   }
		case 4:
//	    ��ծ�����˻�
	   BankNationalDebt  bankNationalDebt = new BankNationalDebt();
	   bankNationalDebt.userChoiceWhichNationalDebtAccount();
	   Scanner inputUserChoiceNationalDebtAccount = new Scanner(System.in);
	   String recieveUserChoiceNationalDebtAccount = inputUserChoiceNationalDebtAccount.nextLine();
	   switch(recieveUserChoiceNationalDebtAccount){
//		            ��ծ-�����ծ
		  case "A":
			  bankNationalDebt.userDepositing();
			  break;
		  case "a":
			  bankNationalDebt.userDepositing();
			  break;
//			  ��ծ-������ծ
		  case "B":
			  bankNationalDebt.userWithdrowing();
			  break;
		  case "b":
			  bankNationalDebt.userWithdrowing();
			  break;
//			 ��ծ-��ѯ�ҵĹ�ծ
		  case "C":
			  bankNationalDebt.userQuerying();
			  break;
		  case "c":
			  bankNationalDebt.userQuerying();
			  break;
//			  ��ծ-������Ϣ
		  case "D":
			  bankNationalDebt.bankCalculateProfits();
			  break;
		  case "d":
			  bankNationalDebt.bankCalculateProfits();
			  break;
//			  ��ծ-�ۼ���Ϣ
		  case "E":
			  bankNationalDebt.bankAccumulateProfits();
			  break;
		  case "e":
			  bankNationalDebt.bankAccumulateProfits();
			  break;
			  }
		}
	}
//  �����˻�-���û�ѡ����ȷ��������˻���ʱ�������û�ȥѡ��ʹ�øü����˻��µ�ʲô����
	public void userChoiceWhichAccount(){
		System.out.println("��ӭ���ٻ��������˻�ϵͳ����ѡ����Ҫ�����ҵ�����ͣ�");
		System.out.println("A.���");
		System.out.println("B.ȡ��");
		System.out.println("C.��ѯ");
		System.out.println("D.������Ϣ");
		System.out.println("E.�ۼ���Ϣ");
	}

//	��������-���
	@Override
	public void userDepositing() {
	  System.out.println("������Ҫ�������еĽ��");
	  Scanner inputUserDepositing = new Scanner(System.in);
	  recieveUserDepositing = inputUserDepositing.nextInt();
//	  ��ʾ�Ѿ����������Ϣ
	  System.out.println("���Ĵ����Ϊ��" + recieveUserDepositing + "Ԫ");
	}
//	��������-ȡ��
	@Override
	public void userWithdrowing() {
	  System.out.println("��������Ҫȡ���Ľ��(���ȡ��100Ԫ)��");
	  Scanner inputUserWidthdrow = new Scanner(System.in);
	  recieveUserWidthdrow = inputUserWidthdrow.nextInt();
//	  ��ʾȡ���Ľ����Ϣ
	  System.out.println("��ȡ���Ľ��Ϊ��" + recieveUserWidthdrow + "Ԫ");
	  System.out.println("����ǰ�����Ϊ��" + (recieveUserDepositing - recieveUserWidthdrow) + "Ԫ");
	}
//	��������-��ѯ
	@Override
	public void userQuerying() {
	  System.out.println("�������ѯ�Բ�ѯ��");
	  Scanner inputUserQuery = new Scanner(System.in);
	  String recieveUserQuery = inputUserQuery.nextLine();
	  if(recieveUserQuery.equals("��ѯ")){
		  System.out.println("����ǰ�����Ϊ��" + (recieveUserDepositing - recieveUserWidthdrow) + "Ԫ");
	  }else{
		  System.out.println("������Ĺ��ܹؼ�����������������");
	  }
	}
//	��������-������Ϣ
	@Override
	public void bankCalculateProfits() {
	  System.out.println("�����������Ϣ�ؼ����Բ�ѯ����ǰ������Ϣ��");
	  Scanner inputBankCalculateProfits = new Scanner(System.in);
	  String recieveBankCalculateProfits = inputBankCalculateProfits.nextLine();
	  if(recieveBankCalculateProfits.equals("������Ϣ")){
//		  �����ż���õ���Ϣֵ,�涨���������˻�������Ϊ0.01
		  double getCalculateProfits = recieveUserDepositing * 0.01d;
		  System.out.println("����ǰ�˻���������Ӧ�Ĵ����ϢΪ��" + getCalculateProfits + "Ԫ");
	  }else{
		  System.out.println("������Ĺؼ�����������������");
	  }
	}
//	��������-�ۼ���Ϣ
	@Override
	public void bankAccumulateProfits() {
		
		
	}
//	������
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount(); 
		bankAccount.userChoiceWhichFunction();
		bankAccount.userChoiceWhichAccount();
	}
}