public class Main {
    static public void main(String args[]){
        UserDaoProxy proxy  = new UserDaoProxy();
        proxy.setTarget( new UserDao());
        proxy.save();

    }
}
