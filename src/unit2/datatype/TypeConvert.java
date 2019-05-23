package unit2.datatype;

public class TypeConvert {
    public static void main(String[] args) {
        //自然转换，（低精度向高精度赋值时，jvm自然转换）
        /*int num = 250;
        char ch = 'A';
        float flo;
        double dou;

        flo = num;  //自然转换
        num = ch;   //自然转换
        dou = flo;  //自然转换

        System.out.println(dou);
        System.out.println(flo);
        System.out.println(ch);
        System.out.println(num);*/

        //从高精度向低精度赋值必须使用强制类型转换
        double dou1 = 255.50D;
        float flo1 = 254.50F;
        long lon1 = 80000L;
        int num1 = 56;
        char ch1 = '中';
        short sho1 = 45;
        byte by1 = 120;

        flo1 = (float) dou1;
        lon1 = (long) flo1;
        num1 = (int) lon1;
        ch1 = (char) num1;
        sho1 = (short) ch1;
        by1 = (byte) sho1;

        //System.out.println(by1);

        int num2 = 129;
        byte by2 = (byte) num2;
        System.out.println(by2);    //-127
        /*
        int类型的129的在计算机中的二进制形式
        00000000 00000000 00000000 10000001
        int强制转换为byte，只保留最末8位，其他丢弃
        10000001
        byte为有符号的类型，最高位为符号为，最高位是1代表是负数。
        计算机中存储的是数据的补码，负数的补码 = 原码按位取反（反码） + 1
        1 0000001 --补码
        1 0000000 --反码
        1 1111111 --原码
        --------------------
        - 127
         */

    }
}
