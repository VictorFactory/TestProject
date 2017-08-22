import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 70883 on 2017/8/22.
 */

@Controller
@EnableAutoConfiguration

public class Application {

    public class User{
        String name;

        Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
    @ResponseBody
    @RequestMapping("/hello")
    public Object hello(){
        return new User("啸月",18);
    }
    @RequestMapping("/")
    @ResponseBody
    public Object helloWorld(){
        return new User("test",20);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
