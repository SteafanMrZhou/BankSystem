package bankSystemDemo;

/**
 * �������ܽӿ�
 * @author Administrator
 *
 */
public interface IBankAccountMethod {
//	���
	public abstract void userDepositing();
//	ȡ��
	public abstract void userWithdrowing();
//	��ѯ
	public abstract void userQuerying();
//	������Ϣ
	public abstract void bankCalculateProfits();
//	�ۼ���Ϣ
	public abstract void bankAccumulateProfits();
	
}
