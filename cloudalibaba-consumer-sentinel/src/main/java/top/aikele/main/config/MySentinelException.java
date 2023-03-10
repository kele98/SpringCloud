package top.aikele.main.config;

public class MySentinelException {
    public static void defaultHandler(int id ,Throwable ex){
        System.out.println("全局被拦截处理");
    }
    public static void defaultFallback(int id,Throwable ex){
        System.out.println("全局fallback处理");
    }
}
