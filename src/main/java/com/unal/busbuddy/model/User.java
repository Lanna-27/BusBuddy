package com.unal.busbuddy.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private int idUser;
    private String nickname, firstName, lastName, email, password, birthDate;
    private long telNumber;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //declaración variable para foto  

    public User(){
        this.idUser = 0;
        this.nickname = "";
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.password = "";
        this.telNumber = 0;
        this.birthDate = "";
    }

    public User(int idUser, String nickname, String firstName, String lastName, String email, String password, long telNumber, Date birthDate){
        this.idUser = idUser;
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.telNumber = telNumber;
        this.birthDate = sdf.format(birthDate);
    }

    public User(int idUser, String nickname, String firstName, String email, String password, long telNumber, Date birthDate){
        this.idUser = idUser;
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = "";
        this.email = email;
        this.password = password;
        this.telNumber = telNumber;
        this.birthDate = sdf.format(birthDate);
    }

    //GETTERS
    public int getIdUser(){
        return this.idUser;
    }

    public String getNickname(){
        return this.nickname;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public long getTelNumber(){
        return this.telNumber;
    }

    public String getBirthDate(){
        return this.birthDate;
    }

    //SETTERS
    public void setIdUser(int idUser){
        this.idUser = idUser;
        return;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
        return;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
        return;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
        return;
    }

    public void setEmail(String email){
        this.email = email;
        return;
    }

    public void setPassword(String password){
        this.password = password;
        return;
    }

    public void setTelNumber(long telNumber){
        this.telNumber = telNumber;
        return;
    }

    public void setBirthDate(Date birthDate){
        this.birthDate = sdf.format(birthDate);
        return;
    }
    //MÉTODO TO STRING

    public String toString(){
        return "Usuario: " + this.nickname + "\n"+
               "Nombre completo: " + this.firstName +" "+ this.lastName+"\n"+
               "Numero de telefono: " + String.valueOf(this.telNumber) +"\n"+
               "Fecha de nacimiento: " + this.birthDate;
    }

}
