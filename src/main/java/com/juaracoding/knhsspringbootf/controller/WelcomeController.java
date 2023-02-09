package com.juaracoding.knhsspringbootf.controller;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 07/02/2023 20:03
@Last Modified 07/02/2023 20:03
Version 1.0
*/

import com.juaracoding.knhsspringbootf.model.InnerWelcome;
import com.juaracoding.knhsspringbootf.model.Welcome;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @PostMapping("/v1/welcomez/{news}")
    String welcomeMessage(
            @RequestParam String testX,
            @PathVariable("news") String newz,
            @RequestHeader String testSaja,
            @RequestBody Welcome welcome
    ){
        System.out.println("Testdoang : "+testSaja);
        System.out.println("Request Param testX : "+testX);
        System.out.println("Path Variable news : "+newz);
        System.out.println("Request Body welcome var nama : "+welcome.getNama());
        System.out.println("Request Body welcome var alamat : "+welcome.getAlamat());
        System.out.println("Request Body welcome var jenisKelamin : "+welcome.getJenisKelamin());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeX : "+welcome.getWelcomeDaleman().getInnerWelcomeX());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeY : "+welcome.getWelcomeDaleman().getInnerWelcomeY());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeZ : "+welcome.getWelcomeDaleman().getInnerWelcomeZ());
        System.out.println("Request Body welcome object listInnerWelcome [0] var innerWelcomeZ : "+welcome.getListInnerWelcome().get(0).getInnerWelcomeX());
        System.out.println("Request Body welcome object listInnerWelcome [0] var innerWelcomeZ : "+welcome.getListInnerWelcome().get(0).getInnerWelcomeY());
        System.out.println("Request Body welcome object listInnerWelcome [0] var innerWelcomeZ : "+welcome.getListInnerWelcome().get(0).getInnerWelcomeZ());
        System.out.println("Request Body welcome object listInnerWelcome [0] var innerWelcomeZ : "+welcome.getListInnerWelcome().get(1).getInnerWelcomeX());
        System.out.println("Request Body welcome object listInnerWelcome [0] var innerWelcomeZ : "+welcome.getListInnerWelcome().get(1).getInnerWelcomeY());
        System.out.println("Request Body welcome object listInnerWelcome [0] var innerWelcomeZ : "+welcome.getListInnerWelcome().get(1).getInnerWelcomeZ());
        System.out.println("Request Body welcome object strArr [0] : "+welcome.getStrArr()[0]);
        System.out.println("Request Body welcome object strArr [1] : "+welcome.getStrArr()[1]);
        System.out.println("Request Body welcome object strArr [2] : "+welcome.getStrArr()[2]);
        System.out.println("Request Body welcome object strArr [3] : "+welcome.getStrArr()[3]);
        System.out.println("Request Body welcome object strArr [4] : "+welcome.getStrArr()[4]);

        return "OK";
    }

    @PostMapping("/v1/welcomeztwo/{news}")
    String welcomeMessageTwo(
            @RequestParam String testX,
            @PathVariable("news") String newz,
            @RequestHeader String testSaja,
            @RequestBody Welcome welcome
    ){
        System.out.println("Testdoang : "+testSaja);
        System.out.println("Request Param testX : "+testX);
        System.out.println("Path Variable news : "+newz);
        System.out.println("Request Body welcome var nama : "+welcome.getNama());
        System.out.println("Request Body welcome var alamat : "+welcome.getAlamat());
        System.out.println("Request Body welcome var jenisKelamin : "+welcome.getJenisKelamin());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeX : "+welcome.getWelcomeDaleman().getInnerWelcomeX());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeY : "+welcome.getWelcomeDaleman().getInnerWelcomeY());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeZ : "+welcome.getWelcomeDaleman().getInnerWelcomeZ());
        System.out.println("======================================================================================================================================");

        for (int i=0;i<welcome.getListInnerWelcome().size();i++)
        {
            System.out.println("Request Body welcome object listInnerWelcome ["+i+"] var innerWelcomeX : "+welcome.getListInnerWelcome().get(i).getInnerWelcomeX());
            System.out.println("Request Body welcome object listInnerWelcome ["+i+"] var innerWelcomeY : "+welcome.getListInnerWelcome().get(i).getInnerWelcomeY());
            System.out.println("Request Body welcome object listInnerWelcome ["+i+"] var innerWelcomeZ : "+welcome.getListInnerWelcome().get(i).getInnerWelcomeZ());
            System.out.println("======================================================================================================================================");

        }
        for(int i=0;i<welcome.getStrArr().length;i++)
        {
            System.out.println("Request Body welcome object strArr ["+i+"] : "+welcome.getStrArr()[i]);
        }

        return "OK";
    }

    @GetMapping("/v1/welcomezresponse")
    List<InnerWelcome> welcomeResponse(){
        List<InnerWelcome> list = new ArrayList<InnerWelcome>();
        InnerWelcome iw = new InnerWelcome();
        iw.setInnerWelcomeX("List First - X");
        iw.setInnerWelcomeY("List First - Y");
        iw.setInnerWelcomeZ("List First - Z");
        list.add(iw);

        iw = new InnerWelcome();
        iw.setInnerWelcomeX("List Second - X");
        iw.setInnerWelcomeY("List Second - Y");
        iw.setInnerWelcomeZ("List Second - Z");
        list.add(iw);

        iw = new InnerWelcome();
        iw.setInnerWelcomeX("List Third - X");
        iw.setInnerWelcomeY("List Third - Y");
        iw.setInnerWelcomeZ("List Third - Z");
        list.add(iw);

        return list;
    }
}

