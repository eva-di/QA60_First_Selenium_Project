package com.demo_web_shop.data;

public class UserData {
    static int i = (int)((System.currentTimeMillis()/ 1000)%3600);

    public static final String NAME = "Sarah!";
    public static final String LAST_NAME = "Connor!";
    public static final String EMAIL = "sarah" + i + "@gmail.com";
    public static final String PASSWORD = "Qa12345!";
    public static final String CONFIRM_PASSWORD = "Qa12345!";
    public static final String LOGIN = "sarah27@gmail.com";
}