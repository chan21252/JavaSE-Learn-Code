package unit8.innerclass;

public class NotebookComputer {
    private int num;
    private CPU cpu;

    public NotebookComputer(int num) {
        if (cpu == null) {
            cpu = new CPU();
        }

        this.num = num;
    }

    public String int2Binary() {
        return cpu.countBinary(num);
    }

    public String int2Binary2() {
        /**
         * 局部内部类
         */
        class CPU2 {
            public String countBinary(int num) {
                return Integer.toBinaryString(num);
            }
        }

        return new CPU2().countBinary(num);
    }

    /**
     * 内部接口
     */
    interface InnerInterfaces {

    }

    /**
     * 静态内部类
     */
    public static class GPU {
        public void showMessage(String msg) {
            System.out.println(msg);
        }
    }

    /**
     * 普通内部类
     */
    private final class CPU {
        private String number;
        private long speed;

        public String countBinary(int num) {
            return Integer.toBinaryString(num);
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public long getSpeed() {
            return speed;
        }

        public void setSpeed(long speed) {
            this.speed = speed;
        }
    }
}
