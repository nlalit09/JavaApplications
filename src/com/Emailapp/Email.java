package com.Emailapp;

import java.util.Scanner;

public class Email {
    private String fname;
    private String lname;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private int capacity=500;
    private String alternateEmail;
    private String email;
    private String suffix="company.com";

    public Email(String fname,String lname){
        this.fname = fname;
        this.lname = lname;
        System.out.println(fname+" "+lname);
        this.department=setDepartment();
        System.out.println("Department is "+department);
        this.password=setPassword();
        System.out.println("Password is\n"+password);
        email=fname+lname+"."+"@"+department+"."+suffix;
        System.out.println("Your email is "+email);
        setMailBoxCapacity(capacity);
    }

    private String setDepartment() {
        Scanner scan=new Scanner(System.in);
        System.out.println("1:Technical\n2:Support\n3:Developer\n Enter department type");
        int depType=scan.nextInt();
        if(depType==1){
            return "Technical";
        }
        else if(depType==2){
            return "Support";
        }
        else if(depType==3){
            return "Developer";
        }
        else{
            return "";
        }
    }



    private String setPassword(){
        String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        char[] PassWord=new char[9];
        for(int i=0;i<9;i++){
            int rand=(int)(Math.random()*passwordset.length());
            PassWord[i]=passwordset.charAt(rand);
        }
        return new String(PassWord);

    }
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    public void setAlternateEmail(String altemail){
        this.alternateEmail = altemail;
    }


    public String getInfo(){
        return "Name: "+fname+" "+lname+"\nEmailID: "+email +"\nMail Capacity"+mailBoxCapacity;
    }

}
