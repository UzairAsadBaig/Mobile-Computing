package com.example.alhuda;

public class ParahDetailModel {
    String ArabicText;
    String UrduText;
    String EngText;

    @Override
    public String toString() {
        return
                ArabicText + "\n" + UrduText + "\n" + EngText;
    }

    public ParahDetailModel(String arabicText, String urduText, String engText) {
        ArabicText = arabicText;
        UrduText = urduText;
        EngText = engText;
    }

    public String getArabicText() {
        return ArabicText;
    }

    public void setArabicText(String arabicText) {
        ArabicText = arabicText;
    }

    public String getUrduText() {
        return UrduText;
    }

    public void setUrduText(String urduText) {
        UrduText = urduText;
    }

    public String getEngText() {
        return EngText;
    }

    public void setEngText(String engText) {
        EngText = engText;
    }
}