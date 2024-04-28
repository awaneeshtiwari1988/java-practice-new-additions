package com.practice.java.trywithresources;

public class Resource implements AutoCloseable{

    public Resource() {
        System.out.println("Resource opened");
    }

    public void use() throws Exception {
        System.out.println("Resource used");
        throw new Exception("Error occurred while using the resource");
    }


    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }
}
