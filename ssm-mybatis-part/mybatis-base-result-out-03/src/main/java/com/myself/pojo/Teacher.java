package com.myself.pojo;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/4 15:01
 */
public class Teacher {

    String tId;
    String tName;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Teacher() {
    }

    public Teacher(String tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId='" + tId + '\'' +
                ", tName='" + tName + '\'' +
                '}';
    }
}
