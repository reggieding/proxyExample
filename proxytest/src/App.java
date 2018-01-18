public class App {
    public static void main(String args[]){
        //目标对象
        IUserDao target  = new UserDao();
        System.out.println(target.getClass());

        //给目标对象，创建代理对象
        IUserDao proxy = (IUserDao)new ProxyFactory(target).getProxyInstance();
        proxy.save();
    }
}
