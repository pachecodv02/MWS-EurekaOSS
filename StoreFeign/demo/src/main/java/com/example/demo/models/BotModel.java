package com.example.demo.models;

public class BotModel {
   private String value;
   private boolean generatedAudio;
   private String audioUrl;

   public String getValue() {
       return value;
   }

   public void setValue(String value) {
       this.value = value;
   }

   public boolean isGeneratedAudio() {
       return generatedAudio;
   }

   public void setGeneratedAudio(boolean generatedAudio) {
       this.generatedAudio = generatedAudio;
   }

   public String getAudioUrl() {
       return audioUrl;
   }

   public void setAudioUrl(String audioUrl) {
       this.audioUrl = audioUrl;
   }
    
}