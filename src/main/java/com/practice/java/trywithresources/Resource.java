package com.practice.java.trywithresources;

public class Resource implements AutoCloseable{

    public Resource() {
        System.out.println("Resource opened");
    }

    public void use(){
        System.out.println("Resource used");
        throw new Exception()
    }


    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }
}
