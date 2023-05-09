package com.meryemtalay.oopproject;

import android.annotation.SuppressLint;

//STATİC POLYMORPHİSİM
public class polymorphism {
    @SuppressLint("SuspiciousIndentation")
    public boolean password(String pass){
        //password length more than 8, return true
        System.out.println("This is polymorphism");
        if(pass.length()<8)
            return false;
        else
        return true;
    }

    public boolean password(String pass,String pass2){
        //password length more than 8, return true
        if(pass.length()<8 || pass2.length()<9){
            System.out.println("pass length not more than 8 or pass2 length not more than 9");
            return false ;}
        else
            return true;
    }
}
