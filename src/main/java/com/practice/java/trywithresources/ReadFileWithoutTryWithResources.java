package com.practice.java.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithoutTryWithResources {

    public String readFile(){
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader("example.txt"));
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null){
                stringBuilder.append(inputLine);
            }
        } catch (IOException ioException){
            ioException.printStackTrace();
        } finally {
            try{
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
