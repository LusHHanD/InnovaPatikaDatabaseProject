package com.innova.util;

abstract public class DatabaseInformation {
    //object variables
    private String url;
    private String userName;
    private String userPassword;
    private String forNameData;

    //parametreli constructor
    public DatabaseInformation() {
        this.url="jdbc:mysql://localhost:3306/innova_patika_project_1";
        this.userName="root";
        this.userPassword="asd1asd2ROOT!";
        this.forNameData="com.mysql.jdbc.Driver";

//        this.url="jdbc:postgresql://localhost:5432/innova_patika_project_1";
//        this.userName="postgres";
//        this.userPassword="postgres";
//        this.forNameData="org.postgresql.Driver";
    }

    //parametresiz constructor
    public DatabaseInformation(String url, String userName, String userPassword, String forNameData) {
        this.url = url;
        this.userName = userName;
        this.userPassword = userPassword;
        this.forNameData = forNameData;
    }

    //toString
    @Override
    public String toString() {
        return "DatabaseInformation{" +
                "url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", forNameData='" + forNameData + '\'' +
                '}';
    }

    //Getter - Setter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public DatabaseInformation setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public DatabaseInformation setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public String getForNameData() {
        return forNameData;
    }

    public void setForNameData(String forNameData) {
        this.forNameData = forNameData;
    }
}
