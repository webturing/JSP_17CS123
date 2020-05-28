package dao;

import java.util.HashMap;

public class UserDAO {
    static HashMap<String, String> users = new HashMap<>();//内存数据库
    static{
        users.put("admin","123456");
        users.put("tom","123");
        users.put("cat","456");
    }
    public static boolean register(String name, String pass) {
        if (users.containsKey(name) || name.trim().isEmpty()) {
            System.err.println("注册失败");
            return false;
        }
        users.put(name, pass);
        System.err.println("注册成功!!");
        return true;
    }

    public static boolean login(String user, String pass) {
        if (users.get(user) == null) {
            System.err.println("用户名不存在");
            return false;
        }
        if (!users.get(user).equals(pass)) {
            System.err.println("密码错误");
            return false;
        }
        System.err.println("登录成功");
        return true;
    }

    private static boolean updatePassword(String name, String oldPass, String newPass) {
        if (!login(name, oldPass)) {
            System.err.println("旧密码错误,修改失败");
            return false;

        }
        users.put(name, newPass);
        System.err.println("修改密码成功，请使用新密码登录");
        return true;
    }

    public static void main(String[] args) {

        register("tom", "123456");
        register("cat", "666666");
        System.out.println(login("tom", "123456"));
        System.out.println(login("tom", "222222"));
        System.out.println(updatePassword("tom", "123456", "654321"));

        System.out.println(login("tom", "123456"));
        System.out.println(login("tom", "654321"));
    }


}
