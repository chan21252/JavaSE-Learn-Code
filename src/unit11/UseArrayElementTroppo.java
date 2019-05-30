package unit11;

import java.util.ArrayList;
import java.util.List;

public class UseArrayElementTroppo {
    public List<String> storeElementToArray(int size) throws ArrayElementTroppo {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (i + 1 > ArrayElementTroppo.MAX_NUM) {
                throw new ArrayElementTroppo();
            }
        }
        return list;
    }
}
