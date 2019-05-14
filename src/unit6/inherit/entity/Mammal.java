package unit6.inherit.entity;

public class Mammal extends Animal{

    public Mammal() {
        System.out.println("调用Mammal构造器");
    }

    /**
     * 哺乳动物的特有行为
     */
    public void lactation(){
        System.out.println("哺乳动物都有哺乳的特征");
    }
}
