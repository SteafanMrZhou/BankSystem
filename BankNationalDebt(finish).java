package bankSystemDemo;

import java.util.Scanner;

/**
 * ��ծ
 * @author Administrator
 *
 */
public class BankNationalDebt extends BankAccount implements IBankAccountMethod{

private String recieveUserBuyNationalDebtConfirmOrCancle;
private int recieveUserPayNationalDebt;
private int recieveUserBuyNationalDebt;
private String recieveUserPayNationalDebtConfirmOrCancle;

//	�����ծ
	public void userDepositing() {
		System.out.println("��������Ҫ����Ĺ�ծ��");
		System.out.println("100000Ԫ");
		System.out.println("200000Ԫ");
		Scanner inputUserBuyNationalDebt = new Scanner(System.in);
		recieveUserBuyNationalDebt = inputUserBuyNationalDebt.nextInt();
		switch(recieveUserBuyNationalDebt){
		  case 100000:
			  System.out.println("��ѡ��Ĺ�ծΪ100000Ԫ��ȷ�Ϲ�����(ȷ��|ȡ��)");
			  Scanner inputUserBuyNationalDebtConfirmOrCancleFirst = new Scanner(System.in);
			  recieveUserBuyNationalDebtConfirmOrCancle = inputUserBuyNationalDebtConfirmOrCancleFirst.nextLine();
			  if(recieveUserBuyNationalDebtConfirmOrCancle.equals("ȷ��")){
				  System.out.println("���ѳɹ�����100000Ԫ�Ĺ�ծ��лл����");
			  }else if(recieveUserBuyNationalDebtConfirmOrCancle.equals("ȡ��")){
				  System.out.println("��ȡ���˹����ծ���ף�лл����");
			  }
			  break;
		  case 200000:
			  System.out.println("��ѡ��Ĺ�ծΪ200000Ԫ��ȷ�Ϲ�����(ȷ��|ȡ��)");
			  Scanner inputUserBuyNationalDebtConfirmOrCancleSecond = new Scanner(System.in);
			  recieveUserBuyNationalDebtConfirmOrCancle = inputUserBuyNationalDebtConfirmOrCancleSecond.nextLine();
			  if(recieveUserBuyNationalDebtConfirmOrCancle.equals("ȷ��")){
				  System.out.println("���ѳɹ�����200000Ԫ�Ĺ�ծ��лл����");
			  }else if(recieveUserBuyNationalDebtConfirmOrCancle.equals("ȡ��")){
				  System.out.println("��ȡ���˹����ծ���ף�лл����");
			  }
			  break;
		}
	};
//	������ծ
	@Override
	public void userWithdrowing() {
		System.out.println("������Ҫ��ȡ��ծ�Ľ�");
		Scanner inputUserPayNationalDebt = new Scanner(System.in);
		recieveUserPayNationalDebt = inputUserPayNationalDebt.nextInt();
		System.out.println("ȷ�ϳ���" + recieveUserPayNationalDebt + "Ԫ��ծ��(ȷ��|ȡ��)");
		Scanner inputUserPayNationalDebtConfirmOrCancle = new Scanner(System.in);
		recieveUserPayNationalDebtConfirmOrCancle = inputUserPayNationalDebtConfirmOrCancle.nextLine();
		if(recieveUserPayNationalDebtConfirmOrCancle.equals("ȷ��")){
//			˵���û�Ҫ��ȡ��ծ
			System.out.println("���ѻ�ȡ" + recieveUserPayNationalDebt + "Ԫ��ծ");
			int getUserPayNationalDebt = (recieveUserBuyNationalDebt - recieveUserPayNationalDebt);
			System.out.println("ʣ��" + "getUserPayNationalDebt" + "Ԫδ�����뼰ʱ����");
		}
	}
//	��ѯ�ҵĹ�ծ
	@Override
	public void userQuerying() {
		System.out.println("���Ѿ�������" + recieveUserBuyNationalDebt + "Ԫ��ծ");
		
	}
//	��ծ-������Ϣ
	@Override
	public void bankCalculateProfits() {
		double getUserShouldPayNationalDebtProfits = recieveUserBuyNationalDebt * 0.35;
		System.out.println("����ǰ�����Ӧ�Ĺ�ծ����ϢΪ��" + getUserShouldPayNationalDebtProfits + "Ԫ");
		double getUserShouldPayNationalDebtTotalMoney =  recieveUserBuyNationalDebt + getUserShouldPayNationalDebtProfits;
		System.out.println("��Ӧ����ȡ���ܽ��Ϊ��" + getUserShouldPayNationalDebtTotalMoney + "Ԫ");
	}
//	��ծ-�ۼ���Ϣ
	@Override
	public void bankAccumulateProfits() {
//		��
	}
	
	public void userChoiceWhichNationalDebtAccount(){
		System.out.println("��ӭ���ٹ�ծ�����˻�ϵͳ����ѡ����Ҫ�����ҵ�����ͣ�");
		System.out.println("A.�����ծ");
		System.out.println("B.������ծ");
		System.out.println("C.��ѯ�ҵĹ�ծ");
		System.out.println("D.������Ϣ");
		System.out.println("E.�ۼ���Ϣ");
	}
}
