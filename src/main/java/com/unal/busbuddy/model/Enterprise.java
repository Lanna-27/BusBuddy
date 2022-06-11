package com.unal.busbuddy.model;

import java.util.Date;

public class Enterprise extends User {

    private long NIT;

    public Enterprise(int idUser, String nickname, String firstName, String lastName, String email, String password, long telNumber, Date birthDate, long NIT) {
        super(idUser,nickname, firstName, lastName, email, password, telNumber, birthDate);
        this.NIT = NIT;
        
    }

    @Override
    public String toString(){
        return "Usuario: " + getNickname() + "\n"+
               "Nombre completo: " + getFirstName() +" "+ getLastName()+"\n"+
               "Numero de telefono: " + String.valueOf(getTelNumber()) +"\n"+
               "Fecha de nacimiento: " + getBirthDate();
    }
    
}
