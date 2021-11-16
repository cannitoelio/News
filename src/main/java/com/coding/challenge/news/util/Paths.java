package com.coding.challenge.news.util;

public class Paths {

    private Paths() {}


    class BasePaths {
        private BasePaths() {}
        public static final String URL_API = "/api/v1";
    }
    public static final String URL_NOTIZIA = BasePaths.URL_API + "/notizia";
    public static final String URL_AUTORE = BasePaths.URL_API + "/autore";

    public static final String URL_GET_ALL = "/all";
    public static final String URL_CREATE_NEW = "/create";
}
