package work.day02;

/**
 * 任务 4 在控制台打印输出java标识符定义规则。具体包括：
 * 1）类名定义规则
 * 2）方法名定义规则
 * 3）变量定义规则
 * 4）常量定义规则
 */
public class Work4 {
    static final String CLASS_NAME_IDENTIFIED_RULE = "首字母大写，单词拼成，单词首字母大写，其他字母小写";
    static final String Method_NAME_IDENTIFIED_RULE = "首字母小写，单词拼成，单词首字母大写，其他字母小写";
    static final String VARIABLE_NAME_IDENTIFIED_RULE = "首字母小写，单词拼成，单词首字母大写，其他字母小写";
    static final String CONSTANT_NAME_IDENTIFIED_RULE = "单词拼成，全部字母大写，用下划线连接";

    public static void main(String[] args) {
        System.out.println(CLASS_NAME_IDENTIFIED_RULE);
        System.out.println(Method_NAME_IDENTIFIED_RULE);
        System.out.println(VARIABLE_NAME_IDENTIFIED_RULE);
        System.out.println(CONSTANT_NAME_IDENTIFIED_RULE);
    }
}
