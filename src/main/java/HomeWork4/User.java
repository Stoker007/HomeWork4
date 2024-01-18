package HomeWork4;

public class User {
    private String sureName;
    private String name;
    private String middleName;
    private int age;
    private String email;

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String sureName, String name, String middleName, int age, String email) {
        this.sureName = sureName;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
        this.email = email;
    }
    public void info() {
        System.out.println("ФИО: " + sureName + " " + name + " " + middleName);
        System.out.println("Год рождения: " + age);
        System.out.println("e-mail: " + email);

    }
}
