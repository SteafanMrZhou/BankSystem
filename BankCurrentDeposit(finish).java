package bankSystemDemo;

import java.util.Scanner;

/**
 * 活期存款
 * @author Administrator
 *
 */
public class BankCurrentDeposit extends BankAccount implements IBankAccountMethod{

private long recieveUserCurrentDepositing;
private long recieveUserCurrentWidthdrowing;

//	活期存款-存款
	@Override
	public void userDepositing() {
		System.out.println("请输入要进行活期存款的金额：");
		Scanner inputUserCurrentDepositing = new Scanner(System.in);
		recieveUserCurrentDepositing = inputUserCurrentDepositing.nextLong();
		System.out.println("根据国家规定，活期存款的账户享受的利率为0.35");
		System.out.println("确认进行活期存款吗？(确认|取消)");
		Scanner inputUserCurrentDepositingConfirmOrCancle = new Scanner(System.in);
		String recieveUserCurrentDepositingConfirmOrCancle = inputUserCurrentDepositingConfirmOrCancle.nextLine();
		if(recieveUserCurrentDepositingConfirmOrCancle.equals("确认")){
			System.out.println("您的活期存款金额为:" + recieveUserCurrentDepositing + "元");
		}else if(recieveUserCurrentDepositingConfirmOrCancle.equals("取消")){
			System.out.println("您取消了活期存款交易，交易失败，谢谢合作");
		}
		
	};
//	活期存款-取款
	@Override
	public void userWithdrowing() {
		System.out.println("请输入要进行取款的金额：");
		Scanner inputUserCurrentWidthdrowing = new Scanner(System.in);
		recieveUserCurrentWidthdrowing = inputUserCurrentWidthdrowing.nextLong();
		System.out.println("您的取款金额为：" + recieveUserCurrentWidthdrowing + "元");
		System.out.println("您的活期账户所剩余额为：" + (recieveUserCurrentDepositing - recieveUserCurrentWidthdrowing) + "元");
		
	}
//	活期存款-查询
	@Override
	public void userQuerying() {
		System.out.println("您的活期账户所剩余额为：" + (recieveUserCurrentDepositing - recieveUserCurrentWidthdrowing) + "元");
		
	}
//	活期存款-计算利息
	@Override
	public void bankCalculateProfits() {
		System.out.println("您当前账户所享有的利息为：" + recieveUserCurrentDepositing * 0.35 + "元");
		System.out.println("您的本金为：" + recieveUserCurrentDepositing + "元");
		System.out.println("总金额为：" + (recieveUserCurrentDepositing +recieveUserCurrentDepositing * 0.35));
		System.out.println("根据国家要求，定期存款、活期存款的账户要征收20%的个人所得税");
		System.out.println("实际获取金额为：" + (recieveUserCurrentDepositing +recieveUserCurrentDepositing * 0.35 ) * 0.2 + "元");
	}
//	活期存款-累加利息
	@Override
	public void bankAccumulateProfits() {
//		活期存款无累加利息
		System.out.println("您当钱的银行账户级别无需累加利息");
	}
	
	public void userChoiceWhichCurrentAccount(){
		System.out.println("欢迎光临活期银行账户系统，请选择您要办理的业务类型：");
		System.out.println("A.活期存款");
		System.out.println("B.取款");
		System.out.println("C.查询");
		System.out.println("D.计算利息");
		System.out.println("E.累加利息");
	}
}