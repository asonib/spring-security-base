package com.asb.expbaseservice.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TextConstants {
    public static final String ADDRESS_CACHE_VALUE = "address-cache";
    public static final String USER_CACHE_VALUE = "user-cache";
    public static final String KAFKA_TOPIC_LOGS = "Logs";

    public static final String LOG_SAMPLE_REPONSE = "[\n" +
            "    {\n" +
            "        \"id\": 1,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:32:11 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 2,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:32:14 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 3,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getUserByID for Id {12} API called on Thu Nov 03 00:32:52 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 4,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 00:33:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 5,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:33:58 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 6,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:33:59 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 7,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:33:59 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 8,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:00 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 9,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:00 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 10,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:00 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 11,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:01 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 12,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:01 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 13,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:02 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 14,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:02 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 15,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:02 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 16,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:03 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 17,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:03 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 18,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:04 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 19,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:05 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 20,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:05 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 21,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:34:06 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 22,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:35:40 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 23,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 00:35:42 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 24,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: deleteUser for Id {12} API called on Thu Nov 03 00:40:13 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 25,\n" +
            "        \"message\": \"INFO :: AddressServiceImpl - exp-base-service :: getAllAddressList API called on Thu Nov 03 01:10:41 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 26,\n" +
            "        \"message\": \"INFO :: AddressServiceImpl - exp-base-service :: getAllAddressList API called on Thu Nov 03 16:42:23 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 27,\n" +
            "        \"message\": \"INFO :: AddressServiceImpl - exp-base-service :: getAllAddressList API called on Thu Nov 03 17:09:08 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 28,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 20:26:30 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 29,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {Users not found for this id :: 12}Thu Nov 03 20:26:43 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 30,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getUserByID for Id {12} API called on Thu Nov 03 20:26:43 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 31,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:36:55 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 32,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:36:55 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 33,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:59:07 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 34,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:59:07 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 35,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:59:08 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 36,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:59:08 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 37,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:59:09 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 38,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:59:09 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 39,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:59:09 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 40,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:59:09 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 41,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:59:10 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 42,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:59:10 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 43,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:59:10 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 44,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:59:10 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 45,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 22:59:11 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 46,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 22:59:11 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 47,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 23:54:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 48,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 23:54:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 49,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 23:54:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 50,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 23:54:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 51,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 23:54:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 52,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 23:54:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 53,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:54:55 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 54,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:54:55 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 55,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:54:56 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 57,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:54:57 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 59,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:54:59 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 61,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:55:01 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 63,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:55:07 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 65,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:55:08 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 56,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:54:56 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 58,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:54:58 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 60,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:55:00 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 62,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:55:06 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 64,\n" +
            "        \"message\": \"INFO :: UserServiceImpl - exp-base-service :: getAllUsers API called on Thu Nov 03 23:55:07 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 66,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Thu Nov 03 23:56:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 67,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Thu Nov 03 23:56:46 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 68,\n" +
            "        \"message\": \"INFO :: AddressServiceImpl - exp-base-service :: getAllAddressList API called on Fri Nov 04 00:35:12 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 69,\n" +
            "        \"message\": \"INFO :: AddressServiceImpl - exp-base-service :: getAllAddressList API called on Sat Nov 05 11:49:32 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 70,\n" +
            "        \"message\": \"ERROR :: GlobalExceptionHandler - exp-base-service :: details {User already exists with email {twink3@wu.com}}Sat Nov 05 12:39:05 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 71,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Sat Nov 05 12:39:05 IST 2022\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 72,\n" +
            "        \"message\": \"INFO :: AuthServiceImpl - exp-base-service :: userSignUp API called on Sat Nov 05 12:39:29 IST 2022\"\n" +
            "    }\n" +
            "]";
}
