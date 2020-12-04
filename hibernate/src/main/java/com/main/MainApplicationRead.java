package com.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Employee;


public class MainApplicationRead {
public static void main(String[] args) {
StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
.build();
Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
SessionFactory factory = meta.getSessionFactoryBuilder().build();
Session session = factory.openSession();
Employee employee  = session.get(Employee.class, 1);
Employee employee1  = session.load(Employee.class, 2);
Employee employee2  = session.get(Employee.class, 4);
Employee employee3  = session.load(Employee.class,7);
System.out.println(employee1.getEmpNo());
System.out.println(employee1.getFirstName());
System.out.println(employee1.getLastName());
System.out.println(employee.getEmpNo());
System.out.println(employee.getFirstName());
System.out.println(employee.getLastName());
System.out.println(employee2.getEmpNo());
System.out.println(employee2.getFirstName());
System.out.println(employee2.getLastName());
System.out.println(employee3.getEmpNo());
System.out.println(employee3.getFirstName());
System.out.println(employee3.getLastName());
//*Transaction transaction = session.beginTransaction();
//employee.setFirstName(" Warner");
//session.update(employee);
//transaction.commit();
System.out.println("successfully saved");
session.close();
factory.close();
}
}