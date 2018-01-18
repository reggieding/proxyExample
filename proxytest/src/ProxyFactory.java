import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建一个动态代理对象
 * 动态代理对象不需要实现接口，但需要指定接口类型
 * */
public class ProxyFactory {

    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2---");
                        //执行目标方法
                        Object returnObject = method.invoke(target,args);
                        System.out.println("结束事务2---");
                        return returnObject;
                    }
                }
        );
    }
}
