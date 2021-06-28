package student.hibernate;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
public static void main(String [] arg)
{
Student_info student=new Student_info();
student.setName("Salria");


StudentMarks s2=new StudentMarks();
s2.setCourse1("90");
s2.setCourse2("93");
s2.setCourse3("80");
s2.setCourse4("80");
s2.setCourse5("50");
s2.setCourse6("76");


s2.setStudent(student);


SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
Session session=sessionfactory.openSession();
session.beginTransaction();
session.save(s2);
session.getTransaction().commit();
session.close();
//sessionfactory.close();
}
}
