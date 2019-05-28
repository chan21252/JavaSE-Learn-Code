package work.collection;

import java.util.*;

/**
 * 有如下需求，中国队，美国队，日本队，
 * 每个国家队下面又有乒乓球，羽毛球，篮球，
 * 每个球类下面有第一组，第二组，第三组，
 * 每个组下面有教练，队员，
 * 教练和队员的信息有用户名和性别，年龄，职位。
 * 请根据以上的需求利用List和Map以及学的集合类的知识点来完成这道题目。
 */
public class exercise07 {
    public static void main(String[] args) {
        //男单，男双，女单教练
        Coach liuGuoLiang = new Coach("刘国梁", "男", 30, "教练");
        Coach dengYaPing = new Coach("邓亚萍", "女", 30, "教练");
        Coach kongLingHui = new Coach("孔令辉", "男", 30, "教练");

        //男单队员
        Player zhangJiKe = new Player("张继科", "男", 20, "男单");
        Player maLong = new Player("马龙", "男", 20, "男单");
        Player wangLiQing = new Player("王励勤", "男", 20, "男单");

        //男双队员
        Player wangHao = new Player("王皓", "男", 20, "男双");
        Player xuXing = new Player("许昕", "男", 20, "男双");
        Player maLin = new Player("马琳", "男", 20, "男双");
        Player chenQi = new Player("陈玘", "男", 20, "男双");

        //女单队员
        Player zhangYiNing = new Player("张怡宁", "女", 20, "女单");
        Player dingNing = new Player("丁宁", "女", 20, "女单");
        Player liuShiWen = new Player("刘诗雯", "女", 20, "女单");

        //中国乒乓球队第一、二、三组教练和队员Set
        HashSet<Coach> chinaPingpangGroup1coachs = new HashSet<>();
        HashSet<Player> chinaPingpangGroup1players = new HashSet<>();
        HashSet<Coach> chinaPingpangGroup2coachs = new HashSet<>();
        HashSet<Player> chinaPingpangGroup2players = new HashSet<>();
        HashSet<Coach> chinaPingpangGroup3coachs = new HashSet<>();
        HashSet<Player> chinaPingpangGroup3players = new HashSet<>();

        //添加教练和队员
        chinaPingpangGroup1coachs.add(liuGuoLiang);
        chinaPingpangGroup1players.add(zhangJiKe);
        chinaPingpangGroup1players.add(maLong);
        chinaPingpangGroup1players.add(wangLiQing);

        chinaPingpangGroup2coachs.add(dengYaPing);
        chinaPingpangGroup2players.add(wangHao);
        chinaPingpangGroup2players.add(xuXing);
        chinaPingpangGroup2players.add(maLin);
        chinaPingpangGroup2players.add(chenQi);

        chinaPingpangGroup3coachs.add(kongLingHui);
        chinaPingpangGroup3players.add(zhangYiNing);
        chinaPingpangGroup3players.add(dingNing);
        chinaPingpangGroup3players.add(liuShiWen);

        //中国乒乓球队第一、二、三组
        Map<String, HashSet> chinaPingpangGroup1 = new HashMap<>();
        chinaPingpangGroup1.put("coach", chinaPingpangGroup1coachs);
        chinaPingpangGroup1.put("player", chinaPingpangGroup1players);
        Map<String, HashSet> chinaPingpangGroup2 = new HashMap<>();
        chinaPingpangGroup2.put("coach", chinaPingpangGroup2coachs);
        chinaPingpangGroup2.put("player", chinaPingpangGroup2players);
        Map<String, HashSet> chinaPingpangGroup3 = new HashMap<>();
        chinaPingpangGroup3.put("coach", chinaPingpangGroup3coachs);
        chinaPingpangGroup3.put("player", chinaPingpangGroup3players);

        //中国乒乓球队
        List<Map> chinaPingpangTeam = new ArrayList<>();
        chinaPingpangTeam.add(chinaPingpangGroup1);
        chinaPingpangTeam.add(chinaPingpangGroup2);
        chinaPingpangTeam.add(chinaPingpangGroup3);

        /* 遍历中国乒乓球队，打印大名单 */
        for (int i = 0; i < chinaPingpangTeam.size(); i++) {
            //获取当前组
            System.out.println("第" + (i + 1) + "组：");
            Map group = chinaPingpangTeam.get(i);

            //获取教练和队员Set
            Set<Coach> coaches = (Set) group.get("coach");
            Set<Player> players = (Set) group.get("player");

            //遍历输出
            for (Coach coach : coaches) {
                System.out.print(coach.getName() + "\t");
            }
            System.out.println();

            for (Player player : players) {
                System.out.print(player.getName() + "\t");
            }
            System.out.println();
        }

        //中国羽毛球队第一、二、三组教练和队员Set
        HashSet<Coach> chinaBadmintonGroup1coachs = new HashSet<>();
        HashSet<Player> chinaBadmintonGroup1players = new HashSet<>();
        HashSet<Coach> chinaBadmintonGroup2coachs = new HashSet<>();
        HashSet<Player> chinaBadmintonGroup2players = new HashSet<>();
        HashSet<Coach> chinaBadmintonGroup3coachs = new HashSet<>();
        HashSet<Player> chinaBadmintonGroup3players = new HashSet<>();

        //中国篮球队第一、二、三组教练和队员Set
        HashSet<Coach> chinaBasketballGroup1coachs = new HashSet<>();
        HashSet<Player> chinaBasketballGroup1players = new HashSet<>();
        HashSet<Coach> chinaBasketballGroup2coachs = new HashSet<>();
        HashSet<Player> chinaBasketballGroup2players = new HashSet<>();
        HashSet<Coach> chinaBasketballGroup3coachs = new HashSet<>();
        HashSet<Player> chinaBasketballGroup3players = new HashSet<>();

        //...

    }
}

/**
 * 人类
 */
class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

/**
 * 教练类
 */
class Coach extends Person {
    private String job;

    public Coach(String name, String gender, int age, String job) {
        super(name, gender, age);
        this.job = job;
    }
}

/**
 * 队员类
 */
class Player extends Person {
    private String job;

    public Player(String name, String gender, int age, String job) {
        super(name, gender, age);
        this.job = job;
    }
}