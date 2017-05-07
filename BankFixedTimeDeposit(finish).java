package bankSystemDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import javax.xml.crypto.Data;

/**
 * 定期存款
 * @author Administrator
 *
 */
public class BankFixedTimeDeposit extends BankAccount implements IBankAccountMethod{

private long recieveUserFixedTimeDepositing;
private long recieveUserFixedTimeWidthdrowing;
private String recieveUserFixedTimeDepositingConfirm;
private String recieveUserFixedTimeDepositingCancle;
private String recieveUserFixedTimeDepositingConfirmT2;
private String recieveUserFixedTimeDepositingCancleT2;
private String recieveUserFixedTimeDepositingConfirmT3;
private String recieveUserFixedTimeDepositingCancleT3;
private String recieveUserFixedTimeDepositingConfirmT4;
private String recieveUserFixedTimeDepositingCancleT4;
private String recieveUserFixedTimeDepositingConfirmT5;
private String recieveUserFixedTimeDepositingCancleT5;
private String recieveUserFixedTimeDepositingConfirmT6;
private String recieveUserFixedTimeDepositingCancleT6;
private long userFixedTiemDepostingTime;
private long userFixedTiemWithdrowingTime;
private long withdrowTime;

//	定期存款-存款
	public void userDepositing() {
		System.out.println("请输入您要进行定期存款的金额(单笔最高存入十万元)：");
		Scanner inputUserFixedTimeDepositing = new Scanner(System.in);
		recieveUserFixedTimeDepositing = inputUserFixedTimeDepositing.nextLong();
//		显示存入的金额信息
		System.out.println("您即将存入：" + recieveUserFixedTimeDepositing + "元" + "作为定期存款金额");
//		定期存款期限,应为在用户确认存款时的那一刻开始计时，到用户想取款的那一刻之间的这一段时间间隔为判断用户是否选择了定期存款期限以及是否可达取款期限
		System.out.println("请输入您想进行定期存款的时长：");
		System.out.println("T1.三个月1.1");
		System.out.println("T2.半年1.3");
		System.out.println("T3.一年1.5");
		System.out.println("T4.两年2.1");
		System.out.println("T5.三年2.75");
		System.out.println("T6.五年3.75");
		Scanner inputUserChoiceFixedTimeDepositingTime = new Scanner(System.in);
		String recieveUserChoiceFixedTimeDepositingTime = inputUserChoiceFixedTimeDepositingTime.nextLine();
		switch(recieveUserChoiceFixedTimeDepositingTime){
		  case "T1":
			  System.out.println("您选择的存款期限为三个月，利率为1.1");
			  System.out.println("确认存入这些金额吗？(确认|取消)");
			  Scanner inputUserFixedTimeDepositingConfirm = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirm = inputUserFixedTimeDepositingConfirm.nextLine();
			  Scanner inputUserFixedTimeDepositingCancle = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancle = inputUserFixedTimeDepositingCancle.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("确认")){
					System.out.println("您的定期存款金额为:" + recieveUserFixedTimeDepositing + "元" + "," + "已存入您的定期银行账户中");
					System.out.println("您当前的利率为：1.1");
//					开始计时
					userFixedTimeDepositingTime();
				}
				if(recieveUserFixedTimeDepositingCancle.equals("取消")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("您取消了定期存款交易，谢谢使用");
				}
			  break;
		  case "T2":
			  System.out.println("您选择的存款期限为半年，利率为1.3");
			  System.out.println("确认存入这些金额吗？(确认|取消)");
			  Scanner inputUserFixedTimeDepositingConfirmT2 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT2 = inputUserFixedTimeDepositingConfirmT2.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT2 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT2 = inputUserFixedTimeDepositingCancleT2.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("确认")){
					System.out.println("您的定期存款金额为:" + recieveUserFixedTimeDepositing + "元" + "," + "已存入您的定期银行账户中");
					System.out.println("您当前的利率为：1.3");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("取消")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("您取消了定期存款交易，谢谢使用");
				}
			  break;
		  case "T3":
			  System.out.println("您选择的存款期限为一年，利率为1.5");
			  System.out.println("确认存入这些金额吗？(确认|取消)");
			  Scanner inputUserFixedTimeDepositingConfirmT3 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT3 = inputUserFixedTimeDepositingConfirmT3.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT3 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT3 = inputUserFixedTimeDepositingCancleT3.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("确认")){
					System.out.println("您的定期存款金额为:" + recieveUserFixedTimeDepositing + "元" + "," + "已存入您的定期银行账户中");
					System.out.println("您当前的利率为：1.5");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("取消")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("您取消了定期存款交易，谢谢使用");
				}
			  break;
		  case "T4":
			  System.out.println("您选择的存款期限为两年，利率为2.1");
			  System.out.println("确认存入这些金额吗？(确认|取消)");
			  Scanner inputUserFixedTimeDepositingConfirmT4 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT4 = inputUserFixedTimeDepositingConfirmT4.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT4 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT4 = inputUserFixedTimeDepositingCancleT4.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("确认")){
					System.out.println("您的定期存款金额为:" + recieveUserFixedTimeDepositing + "元" + "," + "已存入您的定期银行账户中");
					System.out.println("您当前的利率为：2.1");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("取消")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("您取消了定期存款交易，谢谢使用");
				}
			  break;
		  case "T5":
			  System.out.println("您选择的存款期限为三年，利率为2.75");
			  System.out.println("确认存入这些金额吗？(确认|取消)");
			  Scanner inputUserFixedTimeDepositingConfirmT5 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT5 = inputUserFixedTimeDepositingConfirmT5.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT5 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT5 = inputUserFixedTimeDepositingCancleT5.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("确认")){
					System.out.println("您的定期存款金额为:" + recieveUserFixedTimeDepositing + "元" + "," + "已存入您的定期银行账户中");
					System.out.println("您当前的利率为：2.75");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("取消")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("您取消了定期存款交易，谢谢使用");
				}
			  break;
		  case "T6":
			  System.out.println("您选择的存款期限为三年，利率为3.75");
			  System.out.println("确认存入这些金额吗？(确认|取消)");
			  Scanner inputUserFixedTimeDepositingConfirmT6 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT6 = inputUserFixedTimeDepositingConfirmT6.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT6 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT6 = inputUserFixedTimeDepositingCancleT6.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("确认")){
					System.out.println("您的定期存款金额为:" + recieveUserFixedTimeDepositing + "元" + "," + "已存入您的定期银行账户中");
					System.out.println("您当前的利率为：3.75");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("取消")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("您取消了定期存款交易，谢谢使用");
				}
			  break;
		}
   }
//	获取到当前系统时间，用户定期存款时长
  private void userFixedTimeDepositingTime() {
//	Date date = new Date();
//	DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	userFixedTiemDepostingTime = format.format(date);
//	  获取毫秒数
	  userFixedTiemDepostingTime = System.currentTimeMillis();
}

//	定期存款-取款
	@Override
	public void userWithdrowing() {
//		定期取款声明
		System.out.println("亲爱的用户，请您确认您的定期存款是否已达可取款期限，已达取款期限的可以进行取款交易，否则，未到取款期限的，将无法进行取款交易(已达期限|未达期限)");
		Scanner inputUserFixedTimeWithDrowingConfirm = new Scanner(System.in);
		String recieveUserFixedTimeWithDrowingConfirm = inputUserFixedTimeWithDrowingConfirm.nextLine();
		Scanner inputUserFixedTimeWithDrowingCancle = new Scanner(System.in);
		String recieveUserFixedTimeWithDrowingCancle = inputUserFixedTimeWithDrowingCancle.nextLine();
		if(recieveUserFixedTimeWithDrowingConfirm.equals("已达期限")){
			System.out.println("请输入您要进行取款的金额：");
			Scanner inputUserFixedTimeWidthdrowing = new Scanner(System.in);
			recieveUserFixedTimeWidthdrowing = inputUserFixedTimeWidthdrowing.nextLong();
//			结束计时，判断是否达到取款期限
			userFixedTimeWithdrowingTime();
			withdrowTime = (userFixedTiemWithdrowingTime / 1000 - userFixedTiemDepostingTime / 1000);
			if(withdrowTime >= 1000000){
			System.out.println("取款成功");
			System.out.println("您的定期存款账户所剩余额为:" + (recieveUserFixedTimeDepositing - recieveUserFixedTimeWidthdrowing) + "元");
			}else{
				System.out.println("您的定期存款账户未达期限，无法进行取款交易，谢谢合作");
			}
		}
		if(recieveUserFixedTimeWithDrowingCancle.equals("未达期限")){
			System.out.println("您的定期存款账户未达期限，无法进行取款交易，谢谢合作");
			
		}
		
	}
//	获取到当前系统时间，用户取款时时长
  private void userFixedTimeWithdrowingTime() {
//	Date date = new Date();
//	DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	userFixedTiemWithdrowingTime = format.format(date);
	  userFixedTiemWithdrowingTime = System.currentTimeMillis();
}
//	定期存款-查询
	@Override
	public void userQuerying() {
		System.out.println("您的定期存款金额为：" + (recieveUserFixedTimeDepositing - recieveUserFixedTimeWidthdrowing) + "元");
		
	}
//	定期存款-计算利息
	@Override
	public void bankCalculateProfits() {
		System.out.println("您的定期存款本金为：" + recieveUserFixedTimeDepositing + "元");
		System.out.println("您的定期存款所对应级别的利息为" + recieveUserFixedTimeDepositing * 1.1 + "元");
		System.out.println("根据国家要求，定期存款、活期存款的账户要征收20%的个人所得税");
		System.out.println("到取款期限时，您能获得的金额为：" + (recieveUserFixedTimeDepositing + recieveUserFixedTimeDepositing * 1.1 ) * 0.2 + "元");
		
	}
//	定期存款-累加利息
	@Override
	public void bankAccumulateProfits() {
//	  如果到了取款期限，用户没有进行取款操作，则再到了下一次的取款期限时应该累加一倍的相应等级的利息
	  if(withdrowTime > 2000000){
//		  判断为用户在到了取款期限的时候，没有进行取款交易操作
		  System.out.println("您总记利息总额为：" + recieveUserFixedTimeDepositing * 2.2 + "元");
	  }
	}
	
//	定期账户-当用户选择了确定级别的账户的时候，再让用户去选择该级别账户下的什么功能
	public void userChoiceWhichFixedTimeAccount(){
		System.out.println("欢迎光临定期银行账户系统，请选择您要办理的业务类型：");
		System.out.println("A.定期存款");
		System.out.println("B.取款");
		System.out.println("C.查询");
		System.out.println("D.计算利息");
		System.out.println("E.累加利息");
	}
	
//	主方法
	public static void main(String[] args){
		BankFixedTimeDeposit bankFixedTimeDeposit = new BankFixedTimeDeposit();
		bankFixedTimeDeposit.userChoiceWhichAccount();
	}
}