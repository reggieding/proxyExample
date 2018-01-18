public class UserDaoProxy implements IUserDao{
    private IUserDao target;

    public void setTarget(IUserDao target) {
        this.target = target;
    }

    public void save(){
        System.out.println("开始事务...");
        target.save();
        System.out.println("结束事务...");
    }
}
