package work.net.exercise03;

import java.io.Serializable;
import java.util.List;

public class Image implements Serializable {
    private String name;
    private List<byte[]> bufferList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<byte[]> getBufferList() {
        return bufferList;
    }

    public void setBufferList(List<byte[]> bufferList) {
        this.bufferList = bufferList;
    }
}
