package com.informind;

import java.sql.Connection;
import com.informind.DatabaseSample.*;

public class UseJavaDB {
    public static void main(String[] args) {
        Connection connection;
        DatabaseSample sample = new DatabaseSample();
        connection = sample.connectToDb();
        System.out.println("Successful connection");
    }
}
