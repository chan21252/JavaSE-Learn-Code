package work.mytest;

public class dt10 {
    private static boolean isfinish = false;

    public static void main(String[] args) {
        Thread down = new Thread() {

            public void run() {
                System.out.println("down开始下载图片");
                for (int i = 0; i <= 100; i++) {
                    System.out.println("down" + i + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("down图片下载完毕");
                isfinish = true;
                System.out.println("下载图片线程结束，isfinish = " + isfinish);
            }
        };
        Thread show = new Thread() {
            @Override
            public void run() {
                System.out.println("show显示文字");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println("文字显示完毕");
                System.out.println("show开始显示图片");
                if (!isfinish) {
                    throw new RuntimeException("图片加载失败");
                }
                System.out.println("图片显示66666666666666666");
            }

        };
        down.start();
        show.start();
    }

}
