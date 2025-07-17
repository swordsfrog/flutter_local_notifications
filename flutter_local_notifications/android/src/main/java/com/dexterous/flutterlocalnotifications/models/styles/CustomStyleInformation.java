package com.dexterous.flutterlocalnotifications.models.styles;

import androidx.annotation.Keep;

import java.util.Map;

@Keep
public class CustomStyleInformation extends DefaultStyleInformation {
    public String customContentView;
    public String customBigContentView;
    public Map<String, String> viewTexts;

    public CustomStyleInformation(
            String customContentView,
            String customBigContentView,
            Map<String, String> viewTexts) {
        super(false, false);
        this.customContentView = customContentView;
        this.customBigContentView = customBigContentView;
        this.viewTexts = viewTexts;
    }
}
