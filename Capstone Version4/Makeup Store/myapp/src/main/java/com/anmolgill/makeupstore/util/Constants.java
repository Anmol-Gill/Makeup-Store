package com.anmolgill.makeupstore.util;

public class Constants {

    // SQL Queries
    public static final String FIND_USER_BY_EMAIL =
            "SELECT * FROM users WHERE email = ?";

    public static final String FIND_ORDERS_BY_USER_ID =
            "SELECT * FROM orders WHERE user_id = ?";

    // HTML Page Paths (if using Thymeleaf or any front-end routing)
    public static final String LOGIN_PAGE = "/login";
    public static final String REGISTER_PAGE = "/register";

    // URL Patterns
    public static final String API_USERS = "/api/users";
    public static final String API_ORDERS = "/api/orders";

    // Other Constants
    public static final String DEFAULT_USER_ROLE = "USER";
    public static final int MAX_ORDER_QUANTITY = 100;

}

