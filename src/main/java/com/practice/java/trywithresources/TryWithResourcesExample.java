package com.practice.java.trywithresources;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        try(Resource resource = new Resource()){
            resource.use();
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
