package org.telegram;

/**
 * Created by clement on 16/05/2016.
 */
public class BuildVars {
    public static final Boolean debug = true;
    public static final String pathToLogs = "./";
    public static final String linkDB = "jdbc:mysql://[IP_OF_YOU_MYSQL_SERVER]:3306/[DATABASE]?useUnicode=true&characterEncoding=UTF-8";
    public static final String controllerDB = "com.mysql.jdbc.Driver";
    public static final String userDB = "[YOUR_DB_USERNAME]";
    public static final String password = "[YOUR_SECRET_DB_PASSWORD]";
}
