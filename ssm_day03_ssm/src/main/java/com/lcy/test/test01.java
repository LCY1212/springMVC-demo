package com.lcy.test;

import oracle.jdbc.OracleTypes;
import org.aspectj.apache.bcel.generic.LOOKUPSWITCH;
import org.junit.Test;

import java.sql.*;
import java.util.concurrent.locks.Lock;

public class test01 {

    @Test
    public void test1() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        String url = "jdbc:oracle:thin:@192.168.121.12:1521:orcl";
        Connection conn = DriverManager.getConnection(url, "lucky", "lucky");
        PreparedStatement ps = conn.prepareStatement("select * from person");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getObject(1));
            System.out.println(rs.getObject(2));
        }
        rs.close();
        ps.close();
        conn.close();
    }

    @Test
    public void test2() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        String url = "jdbc:oracle:thin:@192.168.121.12:1521:orcl";
        Connection conn = DriverManager.getConnection(url, "lucky", "lucky");
        CallableStatement cs = conn.prepareCall("{?=call f_yearsal(?)}");
        cs.setObject(2,7788);
        cs.registerOutParameter(1, OracleTypes.NUMBER);
        cs.execute();
        System.out.println("返回内容" +cs.getObject(1));
        cs.close();
        conn.close();
    }

    @Test
    public void test3() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        String url = "jdbc:oracle:thin:@192.168.121.12:1521:orcl";
        Connection conn = DriverManager.getConnection(url, "lucky", "lucky");
        CallableStatement cs = conn.prepareCall("{call p_yearsal(?,?)}");
        cs.setObject(1,7788);
        cs.registerOutParameter(2,OracleTypes.NUMBER);
        cs.execute();
        System.out.println(cs.getObject(2));
        cs.close();
        conn.close();
    }
}
