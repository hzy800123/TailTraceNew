package com.alibaba.tailbase;

public class Constants {

    public static final String CLIENT_PROCESS_PORT1 = "8000";
    public static final String CLIENT_PROCESS_PORT2 = "8001";
    public static final String BACKEND_PROCESS_PORT1 = "8002";
    public static final String BACKEND_PROCESS_PORT2 = "8003";
    public static final String BACKEND_PROCESS_PORT3 = "8004";
    
    public static int BATCH_COUNT = 15;					//number of bucket to cache trace Data
    public static int BATCH_SIZE = 20000;				//maximum number of trace store into a tree map
    public static int PROCESS_COUNT = 2;
    public static String CURRENT_PORT = "8000";
    
}
