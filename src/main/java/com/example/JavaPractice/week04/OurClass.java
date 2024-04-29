package com.example.JavaPractice.week04;

public class OurClass {
    private final boolean just = true;
    public void thisMethodIsDangerous() throws OurBadException {
        if (just){
            throw new OurBadException();
        }
    }
}
