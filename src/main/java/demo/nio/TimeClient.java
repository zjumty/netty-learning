package demo.nio;

/**
 * TODO: 这里要写注释的!
 */
public class TimeClient {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int port = 12345;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                // 采用默认值
            }
        }
        new Thread(new TimeClientHandle("127.0.0.1", port), "TimeClient-001")
                .start();
    }
}