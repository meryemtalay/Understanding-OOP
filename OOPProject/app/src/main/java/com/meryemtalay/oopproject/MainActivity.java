package com.meryemtalay.oopproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Constructer
        showConstructor constructor1= new showConstructor("This string cns1","This string cns2");
        System.out.println(constructor1.cns1);
        System.out.println(constructor1.cns2);

        //Encapsulation
        encapsulation encapsulation1= new encapsulation("Derya","Bulut",25);
        /*We can't use because of private definition.
        System.out.println(encapsulation1.isim);
         encapsulation1.isim="Kerem";*/
        System.out.println(encapsulation1.getIsim());
        encapsulation1.setIsim("Kerem");

        //Inheritance
        inheritance inheritance1= new inheritance("Zeynep","Talay",22);
        System.out.println(inheritance1.call());
        System.out.println(inheritance1.getSoyisim());

        //polymorphism
        //Static
        polymorphism polymorphism1= new polymorphism();
        System.out.println( polymorphism1.password("meryem")); // false (<8)
        System.out.println( polymorphism1.password("meryemmeryem")); // true (>8)
        System.out.println( polymorphism1.password("meryem","büşra"));
        System.out.println( polymorphism1.password("meryem","büşrameryem49"));
        System.out.println( polymorphism1.password("meryem4916","büşrameryem49"));
        // Dynamic
        dynamicpoly dynamicpoly=new dynamicpoly();
        dynamicpoly.test();
        dynamicpoly.password("meryem");

        //Abstract
        example example1= new example();
        System.out.println(example1.abstest());

        example2 examplee=new example2();
        System.out.println(example1.abstest());

        //Interface
        customer customer1=new customer();
        student student1=new student();

        customer1.enter();
        student1.enter();


    }
}