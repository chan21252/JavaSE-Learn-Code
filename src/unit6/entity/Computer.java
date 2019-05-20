package unit6.entity;


public class Computer {
    private static final double PI = 3.14159265;

    /**
     * 计算圆的面积
     *
     * @param r 半径
     * @return 返回圆的面积
     */
    public static double countCircle(double r) {
        //return Math.PI * r * r;
        return PI * r * r;
    }

    /**
     * 计算num2和num3的和
     *
     * @param num2
     * @param num3
     */
    public void countSum(int num2, int num3) {
        System.out.println(num2 + " + " + num3 + " = " + (num2 + num3));
        num2 = 100;
        num3 = 200;
    }

    /**
     * 计算梯形的面积
     *
     * @param up   上底
     * @param down 下底
     * @param h    高
     * @return 返回梯形面积
     */
    public double countTrapezoidArea(double up, double down, double h) {
        return (up + down) * h / 2;
    }

    public double count(double n, double m, int tag) {
        if (tag == 1) {
            return n + m;
        } else if (tag == 2) {
            return n - m;
        } else if (tag == 3) {
            return n * m;
        } else {
            return n / m;
        }
    }

    /* 方法重载 */

    /**
     * 视频软件播放
     *
     * @param video 视频
     */
    public void runSoftWare(Video video) {
        System.out.println("视频长度是 " + video.getLength());
    }

    /**
     * 音频软件播放
     *
     * @param voice 音频
     */
    public void runSoftWare(Voice voice) {
        System.out.println("音频的标题是 " + voice.getTitle());
    }

    /**
     * 重载视频播放方法
     *
     * @param video     视频
     * @param maxLength 最大长度
     */
    public void runSoftWare(Video video, long maxLength) {
        if (video.getLength() < maxLength)
            System.out.println("视频长度是 " + video.getLength());
        else
            System.out.println("视频长度超过限制");
    }
}
