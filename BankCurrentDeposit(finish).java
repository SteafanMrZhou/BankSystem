package bankSystemDemo;

import java.util.Scanner;

/**
 * ���ڴ��
 * @author Administrator
 *
 */
public class BankCurrentDeposit extends BankAccount implements IBankAccountMethod{

private long recieveUserCurrentDepositing;
private long recieveUserCurrentWidthdrowing;

//	���ڴ��-���
	@Override
	public void userDepositing() {
		System.out.println("������Ҫ���л��ڴ��Ľ�");
		Scanner inputUserCurrentDepositing = new Scanner(System.in);
		recieveUserCurrentDepositing = inputUserCurrentDepositing.nextLong();
		System.out.println("���ݹ��ҹ涨�����ڴ����˻����ܵ�����Ϊ0.35");
		System.out.println("ȷ�Ͻ��л��ڴ����(ȷ��|ȡ��)");
		Scanner inputUserCurrentDepositingConfirmOrCancle = new Scanner(System.in);
		String recieveUserCurrentDepositingConfirmOrCancle = inputUserCurrentDepositingConfirmOrCancle.nextLine();
		if(recieveUserCurrentDepositingConfirmOrCancle.equals("ȷ��")){
			System.out.println("���Ļ��ڴ����Ϊ:" + recieveUserCurrentDepositing + "Ԫ");
		}else if(recieveUserCurrentDepositingConfirmOrCancle.equals("ȡ��")){
			System.out.println("��ȡ���˻��ڴ��ף�����ʧ�ܣ�лл����");
		}
		
	};
//	���ڴ��-ȡ��
	@Override
	public void userWithdrowing() {
		System.out.println("������Ҫ����ȡ��Ľ�");
		Scanner inputUserCurrentWidthdrowing = new Scanner(System.in);
		recieveUserCurrentWidthdrowing = inputUserCurrentWidthdrowing.nextLong();
		System.out.println("����ȡ����Ϊ��" + recieveUserCurrentWidthdrowing + "Ԫ");
		System.out.println("���Ļ����˻���ʣ���Ϊ��" + (recieveUserCurrentDepositing - recieveUserCurrentWidthdrowing) + "Ԫ");
		
	}
//	���ڴ��-��ѯ
	@Override
	public void userQuerying() {
		System.out.println("���Ļ����˻���ʣ���Ϊ��" + (recieveUserCurrentDepositing - recieveUserCurrentWidthdrowing) + "Ԫ");
		
	}
//	���ڴ��-������Ϣ
	@Override
	public void bankCalculateProfits() {
		System.out.println("����ǰ�˻������е���ϢΪ��" + recieveUserCurrentDepositing * 0.35 + "Ԫ");
		System.out.println("���ı���Ϊ��" + recieveUserCurrentDepositing + "Ԫ");
		System.out.println("�ܽ��Ϊ��" + (recieveUserCurrentDepositing +recieveUserCurrentDepositing * 0.35));
		System.out.println("���ݹ���Ҫ�󣬶��ڴ����ڴ����˻�Ҫ����20%�ĸ�������˰");
		System.out.println("ʵ�ʻ�ȡ���Ϊ��" + (recieveUserCurrentDepositing +recieveUserCurrentDepositing * 0.35 ) * 0.2 + "Ԫ");
	}
//	���ڴ��-�ۼ���Ϣ
	@Override
	public void bankAccumulateProfits() {
//		���ڴ�����ۼ���Ϣ
		System.out.println("����Ǯ�������˻����������ۼ���Ϣ");
	}
	
	public void userChoiceWhichCurrentAccount(){
		System.out.println("��ӭ���ٻ��������˻�ϵͳ����ѡ����Ҫ�����ҵ�����ͣ�");
		System.out.println("A.���ڴ��");
		System.out.println("B.ȡ��");
		System.out.println("C.��ѯ");
		System.out.println("D.������Ϣ");
		System.out.println("E.�ۼ���Ϣ");
	}
}