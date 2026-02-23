package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    static void main() {
        Student e = new Student();
        e.setSno(10);
        e.setSname("Tom");
        e.setProject(new Project(100,"SPRING-BOOT"));
        IO.println(e.toString());

        IO.println("---------------using spring------------------");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("springtest.xml");
        IO.println("----core container is ready ...."+ctx);
        Student e1= (Student)ctx.getBean("r1");
        IO.println(e1.getSname()+" works in the project "+e1.getProject().getProjStack());

        IO.println("---------------using spring with collection------------------");

        Manager mm=(Manager)ctx.getBean("m1");
        mm.getSkills().forEach(skills-> IO.println(skills.toUpperCase()));
        mm.getPhoneNumbers().forEach(emails-> IO.println(emails.toUpperCase()));

        mm.getSalaryDetails().entrySet().forEach(entry-> IO.println(entry.getKey()+"   "+entry.getValue()));

        IO.println("---------------using spring with JDBC------------------");

        JdbcTest jj=(JdbcTest)ctx.getBean("baba");
        jj.createTable();



    }
}
