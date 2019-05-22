package unit9.stringclass;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("我是中国人");

        System.out.println(builder);

        String str = "今天会下雨吗？";
        String[] strs = {"会的", "也许会的", "可能会的", "谁知道会不会呢"};

        String result = StringBuilderManager.concatString(str, strs);
        System.out.println(result);

        String str3 = "我 是 一 匹 来自 北 方 的 狼";
        System.out.println(StringBuilderManager.deleteSpace(str3));
    }
}
