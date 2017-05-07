package bankSystemDemo;

import java.util.Scanner;

/**
 * 国债
 * @author Administrator
 *
 */
public class BankNationalDebt extends BankAccount implements IBankAccountMethod{

private String recieveUserBuyNationalDebtConfirmOrCancle;
private int recieveUserPayNationalDebt;
private int recieveUserBuyNationalDebt;
private String recieveUserPayNationalDebtConfirmOrCancle;

//	购买国债
	public void userDepositing() {
		System.out.println("请输入您要购买的国债金额：");
		System.out.println("100000元");
		System.out.println("200000元");
		Scanner inputUserBuyNationalDebt = new Scanner(System.in);
		recieveUserBuyNationalDebt = inputUserBuyNationalDebt.nextInt();
		switch(recieveUserBuyNationalDebt){
		  case 100000:
			  System.out.println("您选择的国债为100000元，确认购买吗？(确认|取消)");
			  Scanner inputUserBuyNationalDebtConfirmOrCancleFirst = new Scanner(System.in);
			  recieveUserBuyNationalDebtConfirmOrCancle = inputUserBuyNationalDebtConfirmOrCancleFirst.nextLine();
			  if(recieveUserBuyNationalDebtConfirmOrCancle.equals("确认")){
				  System.out.println("您已成功购买100000元的国债，谢谢合作");
			  }else if(recieveUserBuyNationalDebtConfirmOrCancle.equals("取消")){
				  System.out.println("您取消了购买国债交易，谢谢合作");
			  }
			  break;
		  case 200000:
			  System.out.println("您选择的国债为200000元，确认购买吗？(确认|取消)");
			  Scanner inputUserBuyNationalDebtConfirmOrCancleSecond = new Scanner(System.in);
			  recieveUserBuyNationalDebtConfirmOrCancle = inputUserBuyNationalDebtConfirmOrCancleSecond.nextLine();
			  if(recieveUserBuyNationalDebtConfirmOrCancle.equals("确认")){
				  System.out.println("您已成功购买200000元的国债，谢谢合作");
			  }else if(recieveUserBuyNationalDebtConfirmOrCancle.equals("取消")){
				  System.out.println("您取消了购买国债交易，谢谢合作");
			  }
			  break;
		}
	};
//	偿还国债
	@Override
	public void userWithdrowing() {
		System.out.println("请输入要还取国债的金额：");
		Scanner inputUserPayNationalDebt = new Scanner(System.in);
		recieveUserPayNationalDebt = inputUserPayNationalDebt.nextInt();
		System.out.println("确认偿还" + recieveUserPayNationalDebt + "元国债吗？(确认|取消)");
		Scanner inputUserPayNationalDebtConfirmOrCancle = new Scanner(System.in);
		recieveUserPayNationalDebtConfirmOrCancle = inputUserPayNationalDebtConfirmOrCancle.nextLine();
		if(recieveUserPayNationalDebtConfirmOrCancle.equals("确认")){
//			说明用户要还取国债
			System.out.println("您已还取" + recieveUserPayNationalDebt + "元国债");
			int getUserPayNationalDebt = (recieveUserBuyNationalDebt - recieveUserPayNationalDebt);
			System.out.println("剩余" + "getUserPayNationalDebt" + "元未还，请及时处理");
		}
	}
//	查询我的国债
	@Override
	public void userQuerying() {
		System.out.println("您已经购买了" + recieveUserBuyNationalDebt + "元国债");
		
	}
//	国债-计算利息
	@Override
	public void bankCalculateProfits() {
		double getUserShouldPayNationalDebtProfits = recieveUserBuyNationalDebt * 0.35;
		System.out.println("您当前级别对应的国债的利息为：" + getUserShouldPayNationalDebtProfits + "元");
		double getUserShouldPayNationalDebtTotalMoney =  recieveUserBuyNationalDebt + getUserShouldPayNationalDebtProfits;
		System.out.println("您应当还取的总金额为：" + getUserShouldPayNationalDebtTotalMoney + "元");
	}
//	国债-累加利息
	@Override
	public void bankAccumulateProfits() {
//		空
	}
	
	public void userChoiceWhichNationalDebtAccount(){
		System.out.println("欢迎光临国债银行账户系统，请选择您要办理的业务类型：");
		System.out.println("A.购买国债");
		System.out.println("B.偿还国债");
		System.out.println("C.查询我的国债");
		System.out.println("D.计算利息");
		System.out.println("E.累加利息");
	}
}
