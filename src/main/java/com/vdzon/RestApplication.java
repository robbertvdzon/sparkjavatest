package com.vdzon;

import static spark.Spark.*;

public class RestApplication {


    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        System.out.println("started");
    }

}