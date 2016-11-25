package com.xala3pa.templatePattern;

abstract class Site {
    final void publishSite() {

        registerDomain();

        populateSiteData();

        if (hasHighlightsEvents()) {
            publishEvents();
        }

        uploadSiteInstance();
    }

    protected abstract void uploadSiteInstance();

    protected void publishEvents() {
        System.out.println("Publishing events...");
    }

    //hook method
    protected boolean hasHighlightsEvents() {
        return true;
    }

    protected abstract void populateSiteData();

    protected abstract void registerDomain();

}
