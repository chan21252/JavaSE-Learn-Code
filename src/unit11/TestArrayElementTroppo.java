package unit11;

import java.util.List;

public class TestArrayElementTroppo {
    public static void main(String[] args) {
        UseArrayElementTroppo uaet = new UseArrayElementTroppo();
        try {
            List<String> list = uaet.storeElementToArray(1001);
        } catch (ArrayElementTroppo e) {
            e.printStackTrace();
        }
    }
}
