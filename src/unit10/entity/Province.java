package unit10.entity;

public class Province {
    private String name;
    private long area;
    private boolean general;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public boolean isGeneral() {
        return general;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }

    @Override
    public String toString() {
        return "省份{" +
                "名字：'" + name + '\'' +
                ", 面积=" + area +
                ", 是否是直辖市=" + general +
                '}';
    }
}
