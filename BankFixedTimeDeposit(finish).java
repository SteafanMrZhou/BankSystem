package bankSystemDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import javax.xml.crypto.Data;

/**
 * ���ڴ��
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

//	���ڴ��-���
	public void userDepositing() {
		System.out.println("��������Ҫ���ж��ڴ��Ľ��(������ߴ���ʮ��Ԫ)��");
		Scanner inputUserFixedTimeDepositing = new Scanner(System.in);
		recieveUserFixedTimeDepositing = inputUserFixedTimeDepositing.nextLong();
//		��ʾ����Ľ����Ϣ
		System.out.println("���������룺" + recieveUserFixedTimeDepositing + "Ԫ" + "��Ϊ���ڴ����");
//		���ڴ������,ӦΪ���û�ȷ�ϴ��ʱ����һ�̿�ʼ��ʱ�����û���ȡ�����һ��֮�����һ��ʱ����Ϊ�ж��û��Ƿ�ѡ���˶��ڴ�������Լ��Ƿ�ɴ�ȡ������
		System.out.println("������������ж��ڴ���ʱ����");
		System.out.println("T1.������1.1");
		System.out.println("T2.����1.3");
		System.out.println("T3.һ��1.5");
		System.out.println("T4.����2.1");
		System.out.println("T5.����2.75");
		System.out.println("T6.����3.75");
		Scanner inputUserChoiceFixedTimeDepositingTime = new Scanner(System.in);
		String recieveUserChoiceFixedTimeDepositingTime = inputUserChoiceFixedTimeDepositingTime.nextLine();
		switch(recieveUserChoiceFixedTimeDepositingTime){
		  case "T1":
			  System.out.println("��ѡ��Ĵ������Ϊ�����£�����Ϊ1.1");
			  System.out.println("ȷ�ϴ�����Щ�����(ȷ��|ȡ��)");
			  Scanner inputUserFixedTimeDepositingConfirm = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirm = inputUserFixedTimeDepositingConfirm.nextLine();
			  Scanner inputUserFixedTimeDepositingCancle = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancle = inputUserFixedTimeDepositingCancle.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("ȷ��")){
					System.out.println("���Ķ��ڴ����Ϊ:" + recieveUserFixedTimeDepositing + "Ԫ" + "," + "�Ѵ������Ķ��������˻���");
					System.out.println("����ǰ������Ϊ��1.1");
//					��ʼ��ʱ
					userFixedTimeDepositingTime();
				}
				if(recieveUserFixedTimeDepositingCancle.equals("ȡ��")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("��ȡ���˶��ڴ��ף�ллʹ��");
				}
			  break;
		  case "T2":
			  System.out.println("��ѡ��Ĵ������Ϊ���꣬����Ϊ1.3");
			  System.out.println("ȷ�ϴ�����Щ�����(ȷ��|ȡ��)");
			  Scanner inputUserFixedTimeDepositingConfirmT2 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT2 = inputUserFixedTimeDepositingConfirmT2.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT2 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT2 = inputUserFixedTimeDepositingCancleT2.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("ȷ��")){
					System.out.println("���Ķ��ڴ����Ϊ:" + recieveUserFixedTimeDepositing + "Ԫ" + "," + "�Ѵ������Ķ��������˻���");
					System.out.println("����ǰ������Ϊ��1.3");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("ȡ��")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("��ȡ���˶��ڴ��ף�ллʹ��");
				}
			  break;
		  case "T3":
			  System.out.println("��ѡ��Ĵ������Ϊһ�꣬����Ϊ1.5");
			  System.out.println("ȷ�ϴ�����Щ�����(ȷ��|ȡ��)");
			  Scanner inputUserFixedTimeDepositingConfirmT3 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT3 = inputUserFixedTimeDepositingConfirmT3.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT3 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT3 = inputUserFixedTimeDepositingCancleT3.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("ȷ��")){
					System.out.println("���Ķ��ڴ����Ϊ:" + recieveUserFixedTimeDepositing + "Ԫ" + "," + "�Ѵ������Ķ��������˻���");
					System.out.println("����ǰ������Ϊ��1.5");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("ȡ��")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("��ȡ���˶��ڴ��ף�ллʹ��");
				}
			  break;
		  case "T4":
			  System.out.println("��ѡ��Ĵ������Ϊ���꣬����Ϊ2.1");
			  System.out.println("ȷ�ϴ�����Щ�����(ȷ��|ȡ��)");
			  Scanner inputUserFixedTimeDepositingConfirmT4 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT4 = inputUserFixedTimeDepositingConfirmT4.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT4 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT4 = inputUserFixedTimeDepositingCancleT4.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("ȷ��")){
					System.out.println("���Ķ��ڴ����Ϊ:" + recieveUserFixedTimeDepositing + "Ԫ" + "," + "�Ѵ������Ķ��������˻���");
					System.out.println("����ǰ������Ϊ��2.1");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("ȡ��")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("��ȡ���˶��ڴ��ף�ллʹ��");
				}
			  break;
		  case "T5":
			  System.out.println("��ѡ��Ĵ������Ϊ���꣬����Ϊ2.75");
			  System.out.println("ȷ�ϴ�����Щ�����(ȷ��|ȡ��)");
			  Scanner inputUserFixedTimeDepositingConfirmT5 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT5 = inputUserFixedTimeDepositingConfirmT5.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT5 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT5 = inputUserFixedTimeDepositingCancleT5.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("ȷ��")){
					System.out.println("���Ķ��ڴ����Ϊ:" + recieveUserFixedTimeDepositing + "Ԫ" + "," + "�Ѵ������Ķ��������˻���");
					System.out.println("����ǰ������Ϊ��2.75");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("ȡ��")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("��ȡ���˶��ڴ��ף�ллʹ��");
				}
			  break;
		  case "T6":
			  System.out.println("��ѡ��Ĵ������Ϊ���꣬����Ϊ3.75");
			  System.out.println("ȷ�ϴ�����Щ�����(ȷ��|ȡ��)");
			  Scanner inputUserFixedTimeDepositingConfirmT6 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingConfirmT6 = inputUserFixedTimeDepositingConfirmT6.nextLine();
			  Scanner inputUserFixedTimeDepositingCancleT6 = new Scanner(System.in);
			  recieveUserFixedTimeDepositingCancleT6 = inputUserFixedTimeDepositingCancleT6.nextLine();
				if(recieveUserFixedTimeDepositingConfirm.equals("ȷ��")){
					System.out.println("���Ķ��ڴ����Ϊ:" + recieveUserFixedTimeDepositing + "Ԫ" + "," + "�Ѵ������Ķ��������˻���");
					System.out.println("����ǰ������Ϊ��3.75");
				}
				if(recieveUserFixedTimeDepositingCancle.equals("ȡ��")){
					recieveUserFixedTimeDepositing = 0;
					System.out.println("��ȡ���˶��ڴ��ף�ллʹ��");
				}
			  break;
		}
   }
//	��ȡ����ǰϵͳʱ�䣬�û����ڴ��ʱ��
  private void userFixedTimeDepositingTime() {
//	Date date = new Date();
//	DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	userFixedTiemDepostingTime = format.format(date);
//	  ��ȡ������
	  userFixedTiemDepostingTime = System.currentTimeMillis();
}

//	���ڴ��-ȡ��
	@Override
	public void userWithdrowing() {
//		����ȡ������
		System.out.println("�װ����û�������ȷ�����Ķ��ڴ���Ƿ��Ѵ��ȡ�����ޣ��Ѵ�ȡ�����޵Ŀ��Խ���ȡ��ף�����δ��ȡ�����޵ģ����޷�����ȡ���(�Ѵ�����|δ������)");
		Scanner inputUserFixedTimeWithDrowingConfirm = new Scanner(System.in);
		String recieveUserFixedTimeWithDrowingConfirm = inputUserFixedTimeWithDrowingConfirm.nextLine();
		Scanner inputUserFixedTimeWithDrowingCancle = new Scanner(System.in);
		String recieveUserFixedTimeWithDrowingCancle = inputUserFixedTimeWithDrowingCancle.nextLine();
		if(recieveUserFixedTimeWithDrowingConfirm.equals("�Ѵ�����")){
			System.out.println("��������Ҫ����ȡ��Ľ�");
			Scanner inputUserFixedTimeWidthdrowing = new Scanner(System.in);
			recieveUserFixedTimeWidthdrowing = inputUserFixedTimeWidthdrowing.nextLong();
//			������ʱ���ж��Ƿ�ﵽȡ������
			userFixedTimeWithdrowingTime();
			withdrowTime = (userFixedTiemWithdrowingTime / 1000 - userFixedTiemDepostingTime / 1000);
			if(withdrowTime >= 1000000){
			System.out.println("ȡ��ɹ�");
			System.out.println("���Ķ��ڴ���˻���ʣ���Ϊ:" + (recieveUserFixedTimeDepositing - recieveUserFixedTimeWidthdrowing) + "Ԫ");
			}else{
				System.out.println("���Ķ��ڴ���˻�δ�����ޣ��޷�����ȡ��ף�лл����");
			}
		}
		if(recieveUserFixedTimeWithDrowingCancle.equals("δ������")){
			System.out.println("���Ķ��ڴ���˻�δ�����ޣ��޷�����ȡ��ף�лл����");
			
		}
		
	}
//	��ȡ����ǰϵͳʱ�䣬�û�ȡ��ʱʱ��
  private void userFixedTimeWithdrowingTime() {
//	Date date = new Date();
//	DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	userFixedTiemWithdrowingTime = format.format(date);
	  userFixedTiemWithdrowingTime = System.currentTimeMillis();
}
//	���ڴ��-��ѯ
	@Override
	public void userQuerying() {
		System.out.println("���Ķ��ڴ����Ϊ��" + (recieveUserFixedTimeDepositing - recieveUserFixedTimeWidthdrowing) + "Ԫ");
		
	}
//	���ڴ��-������Ϣ
	@Override
	public void bankCalculateProfits() {
		System.out.println("���Ķ��ڴ���Ϊ��" + recieveUserFixedTimeDepositing + "Ԫ");
		System.out.println("���Ķ��ڴ������Ӧ�������ϢΪ" + recieveUserFixedTimeDepositing * 1.1 + "Ԫ");
		System.out.println("���ݹ���Ҫ�󣬶��ڴ����ڴ����˻�Ҫ����20%�ĸ�������˰");
		System.out.println("��ȡ������ʱ�����ܻ�õĽ��Ϊ��" + (recieveUserFixedTimeDepositing + recieveUserFixedTimeDepositing * 1.1 ) * 0.2 + "Ԫ");
		
	}
//	���ڴ��-�ۼ���Ϣ
	@Override
	public void bankAccumulateProfits() {
//	  �������ȡ�����ޣ��û�û�н���ȡ����������ٵ�����һ�ε�ȡ������ʱӦ���ۼ�һ������Ӧ�ȼ�����Ϣ
	  if(withdrowTime > 2000000){
//		  �ж�Ϊ�û��ڵ���ȡ�����޵�ʱ��û�н���ȡ��ײ���
		  System.out.println("���ܼ���Ϣ�ܶ�Ϊ��" + recieveUserFixedTimeDepositing * 2.2 + "Ԫ");
	  }
	}
	
//	�����˻�-���û�ѡ����ȷ��������˻���ʱ�������û�ȥѡ��ü����˻��µ�ʲô����
	public void userChoiceWhichFixedTimeAccount(){
		System.out.println("��ӭ���ٶ��������˻�ϵͳ����ѡ����Ҫ�����ҵ�����ͣ�");
		System.out.println("A.���ڴ��");
		System.out.println("B.ȡ��");
		System.out.println("C.��ѯ");
		System.out.println("D.������Ϣ");
		System.out.println("E.�ۼ���Ϣ");
	}
	
//	������
	public static void main(String[] args){
		BankFixedTimeDeposit bankFixedTimeDeposit = new BankFixedTimeDeposit();
		bankFixedTimeDeposit.userChoiceWhichAccount();
	}
}