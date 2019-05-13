package unit6;

import unit6.entity.Computer;
import unit6.entity.Video;
import unit6.entity.Voice;

public class TestMethodReload {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Video video = new Video();
        Voice voice = new Voice();

        video.setLength(1000L);
        voice.setTitle("我的中国心");

        computer.runSoftWare(video);
        computer.runSoftWare(voice);
        computer.runSoftWare(video, 500);
    }
}
