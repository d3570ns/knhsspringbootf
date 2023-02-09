package com.juaracoding.knhsspringbootf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class KnhsspringbootfApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnhsspringbootfApplication.class, args);
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();

        } catch(Exception e)
        {
            System.out.println("ERROR "+e.getMessage());
        }

        sc = new Scanner(System.in);
        int intSearch = sc.nextInt();
    }
}