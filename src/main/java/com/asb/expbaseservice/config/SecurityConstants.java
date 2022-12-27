package com.asb.expbaseservice.config;

public class SecurityConstants {
    public static final long EXPIRATION_TIME = 864000000; // 10 days
    public static final long PASSWORD_RESET_EXPIRATION_TIME = 3600000; // 1 hour
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String TOKEN_SECRET = "kbsadkvdkabl;dsab";
    public static final String SIGN_UP_URL = "/api/v1/user/signup";

    public static final String SIGN_IN_URL = "/api/v1/user/login";

    public static final String WEBSOCKET_SEND = "/send";
    public static final String WEBSOCKET_TOPIC = "/topic/message";
    public static final String WEBSOCKET_SEND_MESSAGE = "/sendMessage";

    public static final String VERIFICATION_EMAIL_URL = "/users/email-verification";
    public static final String PASSWORD_RESET_REQUEST_URL = "/users/password-reset-request";
    public static final String PASSWORD_RESET_URL = "/users/password-reset";
    public static final String H2_CONSOLE = "/h2-console/**";

}
