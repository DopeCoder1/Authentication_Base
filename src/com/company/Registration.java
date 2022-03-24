package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {


    private String name;
    private String surname;
    private String email;
    private String password;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }



    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public boolean Check()
    {
        if(name.length() <=20 && surname.length()<=20 && password.length()>=8)
        {
            return true;
        }
        return false;
    }
}
