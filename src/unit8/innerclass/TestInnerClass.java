package unit8.innerclass;

public class TestInnerClass {
    public static void main(String[] args) {
        // 创建一个外部类
        //NotebookComputer com = new NotebookComputer() ;

        //通过外部类实例创建内部类对象
       /*
       NotebookComputer.CPU cpu = com.new CPU();

       String bit = cpu.countBinary(11);
       System.out.println(bit);
        */

        NotebookComputer com2 = new NotebookComputer(6);
        System.out.println(com2.int2Binary());

        NotebookComputer.GPU gpu = new NotebookComputer.GPU();
        gpu.showMessage("NVIDIA");

        System.out.println(com2.int2Binary2());
    }
}
