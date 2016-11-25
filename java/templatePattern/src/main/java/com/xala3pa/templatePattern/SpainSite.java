package com.xala3pa.templatePattern;


public class SpainSite extends Site {
    protected void uploadSiteInstance() {
        System.out.println("loading Spain site...");
    }

    protected void populateSiteData() {
        System.out.println("Saving Spain site data...");
    }

    protected void registerDomain() {
        System.out.println(".es domain registered...");

    }

    @Override
    protected boolean hasHighlightsEvents() {
        return false;
    }
}
