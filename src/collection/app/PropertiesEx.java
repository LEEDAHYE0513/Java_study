package collection.app;

import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception{
        //Properies 컬렉션 생성
        Properties properties = new Properties();
        //data.properties 파일 로드
        properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("admin : " + admin);

    }
}
