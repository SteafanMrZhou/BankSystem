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
//	让用户选择使用哪种级别的银行账户的哪种功能
	public void userChoiceWhichFunction(){
		System.out.println("欢迎光临银行账户系统，请选择您要办理的业务类型：");
		System.out.println("1.基本银行账户");
		System.out.println("2.定期银行账户");
		System.out.println("3.活期银行账户");
		System.out.println("4.国债银行账户");
		Scanner inputUserChoice = new Scanner(System.in);
		int receiveUserChoice = inputUserChoice.nextInt();
		switch(receiveUserChoice){
//		  基本银行账户
		  case 1:
			  userChoiceWhichAccount();
			  Scanner inputUserChoiceAccount = new Scanner(System.in);
			  String recieveUserChoiceAccount = inputUserChoiceAccount.nextLine();
//			  基本-A-存款
			  switch(recieveUserChoiceAccount){
			    case "A":
			    	userDepositing();
			    	break;
			    case "a":
			    	userDepositing();
			    	break;
//			 基本-B-取款
		        case "B":
			        userWithdrowing();
			        break;
		        case "b":
		            userWithdrowing();
		            break;
//			基本-C-查询
		        case "C":        
				      userQuerying();
				      break;
		        case "c":        
				      userQuerying();
				      break;
//			基本-D-计算利息
		        case "D":
				      bankCalculateProfits();
				      break;
		        case "d":
				      bankCalculateProfits();
				      break;
//			基本-E-累加利息
		        case "E":
				      bankAccumulateProfits();
				      break;
		        case "e":
				      bankAccumulateProfits();
				      break;
			  } 	
			  break;
		  case 2:
//			  定期存款银行账户
			  BankFixedTimeDeposit bankFixedTimeDeposit = new BankFixedTimeDeposit();
			  bankFixedTimeDeposit.userChoiceWhichFixedTimeAccount();
			  Scanner inputUserChoiceFixedTimeAccount = new Scanner(System.in);
			  String recieveUserChoiceFixedTimeAccount = inputUserChoiceFixedTimeAccount.nextLine();
			  switch(recieveUserChoiceFixedTimeAccount){
//			                     定期-A-存款
			    case "A":
			    	bankFixedTimeDeposit.userDepositing();
			    	break;
			    case "a":
			    	bankFixedTimeDeposit.userDepositing();
			    	break;
//					  定期-B-取款
			    case "B":
			    	bankFixedTimeDeposit.userWithdrowing();
			    	break;
			    case "b":
			    	bankFixedTimeDeposit.userWithdrowing();
			    	break;
//					  定期-C-查询
			    case "C":
			    	bankFixedTimeDeposit.userQuerying();
			    	break;
			    case "c":
			    	bankFixedTimeDeposit.userQuerying();
			    	break;
//					  定期-D-计算利息
			    case "D":
			    	bankFixedTimeDeposit.bankCalculateProfits();
			    	break;
			    case "d":
			    	bankFixedTimeDeposit.bankCalculateProfits();
			    	break;
//					  定期-E-累加利息
			    case "E":
			    	bankFixedTimeDeposit.bankAccumulateProfits();
			    	break;
			    case "e":
			    	bankFixedTimeDeposit.bankAccumulateProfits();
			    	break;
			  }
			  break;
		case 3:
//		  活期存款银行账户
		BankCurrentDeposit bankCurrentDeposit = new BankCurrentDeposit();
		bankCurrentDeposit.userChoiceWhichCurrentAccount();
		Scanner inputUserChoiceCurrentAccount = new Scanner(System.in);
		String recieveUserChoiceCurrentAccount = inputUserChoiceCurrentAccount.nextLine();
		switch(recieveUserChoiceCurrentAccount){
//		           活期-A-存款
		  case "A":
			  bankCurrentDeposit.userDepositing();
			  break;
		  case "a":
			  bankCurrentDeposit.userDepositing();
			  break;
//			  活期-B-取款
		  case "B":
			  bankCurrentDeposit.userWithdrowing();
			  break;
		  case "b":
			  bankCurrentDeposit.userWithdrowing();
			  break;
//			  活期-C-查询
		  case "C":
			  bankCurrentDeposit.userQuerying();
			  break;
		  case "c":
			  bankCurrentDeposit.userQuerying();
			  break;
//			  活期-D-计算利息
		  case "D":
			  bankCurrentDeposit.bankCalculateProfits();
			  break;
		  case "d":
			  bankCurrentDeposit.bankCalculateProfits();
			  break;
//			  活期-E-累加利息
		  case "E":
			  bankCurrentDeposit.bankAccumulateProfits();
			  break;
		  case "e":
			  bankCurrentDeposit.bankAccumulateProfits();
			  break;
	   }
		case 4:
//	    国债银行账户
	   BankNationalDebt  bankNationalDebt = new BankNationalDebt();
	   bankNationalDebt.userChoiceWhichNationalDebtAccount();
	   Scanner inputUserChoiceNationalDebtAccount = new Scanner(System.in);
	   String recieveUserChoiceNationalDebtAccount = inputUserChoiceNationalDebtAccount.nextLine();
	   switch(recieveUserChoiceNationalDebtAccount){
//		            国债-购买国债
		  case "A":
			  bankNationalDebt.userDepositing();
			  break;
		  case "a":
			  bankNationalDebt.userDepositing();
			  break;
//			  国债-偿还国债
		  case "B":
			  bankNationalDebt.userWithdrowing();
			  break;
		  case "b":
			  bankNationalDebt.userWithdrowing();
			  break;
//			 国债-查询我的国债
		  case "C":
			  bankNationalDebt.userQuerying();
			  break;
		  case "c":
			  bankNationalDebt.userQuerying();
			  break;
//			  国债-计算利息
		  case "D":
			  bankNationalDebt.bankCalculateProfits();
			  break;
		  case "d":
			  bankNationalDebt.bankCalculateProfits();
			  break;
//			  国债-累加利息
		  case "E":
			  bankNationalDebt.bankAccumulateProfits();
			  break;
		  case "e":
			  bankNationalDebt.bankAccumulateProfits();
			  break;
			  }
		}
	}
//  基本账户-当用户选择了确定级别的账户的时候，再让用户去选择使用该级别账户下的什么功能
	public void userChoiceWhichAccount(){
		System.out.println("欢迎光临基本银行账户系统，请选择您要办理的业务类型：");
		System.out.println("A.存款");
		System.out.println("B.取款");
		System.out.println("C.查询");
		System.out.println("D.计算利息");
		System.out.println("E.累加利息");
	}

//	基本功能-存款
	@Override
	public void userDepositing() {
	  System.out.println("请输入要存入银行的金额");
	  Scanner inputUserDepositing = new Scanner(System.in);
	  recieveUserDepositing = inputUserDepositing.nextInt();
//	  显示已经存入金额的信息
	  System.out.println("您的存款金额为：" + recieveUserDepositing + "元");
	}
//	基本功能-取款
	@Override
	public void userWithdrowing() {
	  System.out.println("请输入您要取出的金额(最低取出100元)：");
	  Scanner inputUserWidthdrow = new Scanner(System.in);
	  recieveUserWidthdrow = inputUserWidthdrow.nextInt();
//	  显示取出的金额信息
	  System.out.println("您取出的金额为：" + recieveUserWidthdrow + "元");
	  System.out.println("您当前的余额为：" + (recieveUserDepositing - recieveUserWidthdrow) + "元");
	}
//	基本功能-查询
	@Override
	public void userQuerying() {
	  System.out.println("请输入查询以查询余额：");
	  Scanner inputUserQuery = new Scanner(System.in);
	  String recieveUserQuery = inputUserQuery.nextLine();
	  if(recieveUserQuery.equals("查询")){
		  System.out.println("您当前的余额为：" + (recieveUserDepositing - recieveUserWidthdrow) + "元");
	  }else{
		  System.out.println("您输入的功能关键字有误，请重新输入");
	  }
	}
//	基本功能-计算利息
	@Override
	public void bankCalculateProfits() {
	  System.out.println("请输入计算利息关键字以查询您当前存款的利息：");
	  Scanner inputBankCalculateProfits = new Scanner(System.in);
	  String recieveBankCalculateProfits = inputBankCalculateProfits.nextLine();
	  if(recieveBankCalculateProfits.equals("计算利息")){
//		  定义存放计算好的利息值,规定基础银行账户的利率为0.01
		  double getCalculateProfits = recieveUserDepositing * 0.01d;
		  System.out.println("您当前账户级别所对应的存款利息为：" + getCalculateProfits + "元");
	  }else{
		  System.out.println("您输入的关键字有误，请重新输入");
	  }
	}
//	基本功能-累加利息
	@Override
	public void bankAccumulateProfits() {
		
		
	}
//	主方法
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount(); 
		bankAccount.userChoiceWhichFunction();
		bankAccount.userChoiceWhichAccount();
	}
}