package com.coding.challenge.news.costants;

public class Paths {

    private Paths() {}


    class BasePaths {
        private BasePaths() {}
        public static final String URL_API = "/api/v1";
    }
    public static final String URL_NOTIZIA = BasePaths.URL_API + "/articles";
    public static final String URL_AUTORE = BasePaths.URL_API + "/authors";
    public static final String URL_REGISTRATION = BasePaths.URL_API + "/registration";
    public static final String URL_GET_ALL = "/all";
    public static final String URL_CREATE_NEW = "/create";

}
