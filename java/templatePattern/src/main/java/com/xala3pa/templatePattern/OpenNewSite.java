package com.xala3pa.templatePattern;

public class OpenNewSite {
    public static void main(String[] args) {
        SpainSite spainSite = new SpainSite();
        spainSite.publishSite();

        UKSite ukSite = new UKSite();
        ukSite.publishSite();
    }
}
