package entity;

public class Student {
    String name;
    String sex;
    String age;
    String country;
    String hobby;

    {
        name = null;
        sex = null;
        age = null;
        country = null;
        hobby = null;
    }

    public Student() {};

    public Student(String name, String sex, String age, String country, String hobby) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.country = country;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "Student {" +
                "\n\tname: " + name +
                ",\n\tsex: " + sex +
                ",\n\tage: " + age +
                ",\n\tcountry: " + country +
                ",\n\thobby: " + hobby +
                "\n}";
    }
}
