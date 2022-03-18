import top.ccyy.HelloObject;
import top.ccyy.HelloService;
import top.ccyy.transport.client.NettyClient;
import top.ccyy.transport.client.RpcClientProxy;

/**
 * @author FriskKiddo
 */
public class Client {

    public static void main(String[] args) {
        NettyClient nettyClient = new NettyClient();
        RpcClientProxy proxyClient = new RpcClientProxy(nettyClient);
        HelloService helloService = proxyClient.getProxy(HelloService.class);
        String res = helloService.hello(new HelloObject(11652, "你好"));
        System.out.println(res);
    }
}
