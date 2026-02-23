package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTest {

    private JdbcTemplate jt;

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public JdbcTest() {
    }

    public JdbcTest(JdbcTemplate jt) {
        this.jt = jt;
    }

    void createTable()
    {
        jt.execute("create table springxml(id number,name varchar2(22))");
        IO.println("----table created----");
    }
}
