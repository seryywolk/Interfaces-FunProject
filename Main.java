package com.codewithserdar;

public class Main {

    public static void main(String[] args) {
	ITelephone serdarsPhone;
    serdarsPhone = new DeskPhone(123456);
    serdarsPhone.powerOn();
    serdarsPhone.callPhone(123456);
    serdarsPhone.answer();

    serdarsPhone = new MobilePhone(24565);
    // serdarsPhone.powerOn();
    serdarsPhone.callPhone(24565);
    serdarsPhone.answer();
    

    }
}
