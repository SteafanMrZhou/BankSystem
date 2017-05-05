package bankSystemDemo;

/**
 * 基本功能接口
 * @author Administrator
 *
 */
public interface IBankAccountMethod {
//	存款
	public abstract void userDepositing();
//	取款
	public abstract void userWithdrowing();
//	查询
	public abstract void userQuerying();
//	计算利息
	public abstract void bankCalculateProfits();
//	累加利息
	public abstract void bankAccumulateProfits();
	
}
