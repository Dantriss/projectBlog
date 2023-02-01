package com.toyproject.projectblog.test;

import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.lang.reflect.Member;

@RestController
public class httpControllerTest {

    private static final String TAG = "httpControllerTest";

    @GetMapping("/lombok")

    public String lombokTest() {

        Memeber member = new Memeber();

        Memeber mem1 =  Memeber.builder().email("test@naver.com").age(11).build();


        System.out.println(TAG+", getter : "+member.getAge());
        member.setAge(111);
        System.out.println(TAG+", setter : "+member.getAge());

        System.out.println(TAG+", builder : "+mem1.toString());

        return "test complete"+ mem1;
    }


    @GetMapping("/get")
    public String getTest(Memeber member){



        return "get 요청"+" "+member.getName()+" "+member.getEmail();
    }
    @PostMapping("/post")
    public String postTest(@RequestBody Memeber m){
        return "post 요청 : "+m.getName()+m.getAge();
    }
    @PutMapping("/put")
    public String putTest(@RequestBody Memeber m){

        return "put 요청 : " +m.getName()+" "+m.getAge();
    }
    @DeleteMapping("/delete")
    public String deleteTest(){

        return "delete 요청";
    }

}
