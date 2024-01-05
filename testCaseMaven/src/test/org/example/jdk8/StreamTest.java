package example.jdk8;
import com.google.common.base.Strings;
import com.sun.xml.internal.ws.util.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest {

    @Test
    public void streamFile(){
        List<model.Student> list=new ArrayList<>();
        model.Student student= new model.Student();
        model.Student student1= new model.Student();
        model.Student student2= new model.Student();
        model.Student student3= new model.Student();
        model.Student student4= new model.Student();
        student.setId(1);
        student.setName("1");
        student1.setId(2);
        student1.setName("");
        student2.setId(3);
        student2.setName(null);
        list.add(student);
        list.add(student1);
        list.add(student2);
        List<Integer> collect = list.stream().filter(s -> Strings.isNullOrEmpty(s.getName())).map(s -> s.getId()).collect(Collectors.toList());
        for (Integer integer : collect) {
            System.out.println("=============="+integer);
        }
    }
}
