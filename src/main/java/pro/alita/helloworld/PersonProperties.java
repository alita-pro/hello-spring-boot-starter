package pro.alita.helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jaden
 */
@ConfigurationProperties(prefix = "spring.person")
public class PersonProperties {
    private String name;
    private Integer age;
    private String sex = "M";

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
