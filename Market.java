import java.math.*;
public class Market {
    private String tempMarket;
    private int heartp;
    private int stomachp;
    private int eyesp;
    private int liverp;
    private int spleenp;
    private int kidneyp;
    private int skinp;
    private double heartpd;
    private double stomachpd;
    private double eyespd;
    private double liverpd;
    private double spleenpd;
    private double kidneypd;
    private double skinpd;
    private String heartps;
    private String stomachps;
    private String eyesps;
    private String liverps;
    private String spleenps;
    private String kidneyps;
    private String skinps;
    public Market(){
        heartp = 119000;
        stomachp = 500;
        eyesp = 30000;
        liverp = 157000;
        spleenp = 508;
        kidneyp = 200000;
        skinp = 28000;
    }
    public String genMarket(){
        heartpd = (Math.round((Math.random()*1000)-500));
        stomachpd = (Math.round((Math.random()*1000)-500));
        eyespd = (Math.round((Math.random()*1000)-500));
        liverpd = (Math.round((Math.random()*1000)-500));
        spleenpd = (Math.round((Math.random()*1000)-500));
        kidneypd = (Math.round((Math.random()*1000)-500));
        skinpd = (Math.round((Math.random()*1000)-500));
        heartpd /= 100;
        stomachpd /= 100;
        eyespd /= 100;
        liverpd /= 100;
        spleenpd /= 100;
        kidneypd /= 100;
        skinpd /= 100;
        heartp = (int)(((heartpd/100)+1)*heartp);
        stomachp = (int)(((stomachpd/100)+1)*stomachp);
        eyesp = (int)(((eyespd/100)+1)*eyesp);
        liverp = (int)(((liverpd/100)+1)*liverp);
        spleenp = (int)(((spleenpd/100)+1)*spleenp);
        kidneyp = (int)(((kidneypd/100)+1)*kidneyp);
        skinp = (int)(((skinpd/100)+1)*skinp);
        if (heartpd>=1){
            heartps = "↑";
        }
        else{
            heartps = "↓";
        }
        if (stomachpd>=1){
            stomachps = "↑";
        }
        else{
            stomachps = "↓";
        }
        if (eyespd>=1){
            eyesps = "↑";
        }
        else{
            eyesps = "↓";
        }
        if (liverpd>=1){
            liverps = "↑";
        }
        else{
            liverps = "↓";
        }
        if (spleenpd>=1){
            spleenps = "↑";
        }
        else{
            spleenps = "↓";
        }
        if (kidneypd>=1){
            kidneyps = "↑";
        }
        else{
            kidneyps = "↓";
        }
        if (skinpd>=1){
            skinps = "↑";
        }
        else{
            skinps = "↓";
        }
        tempMarket = ("Kidney: $" + kidneyp + " " + kidneyps + kidneypd + "%, Liver: $" + liverp + " " + liverps + liverpd + "%, Heart: $" + heartp + " " + heartps + heartpd + "%, Eyes: $" + eyesp + " " + eyesps + eyespd + "%, Skin: $" + skinp + " " + skinps + skinpd + "%, Spleen: $" + spleenp + " " + spleenps + spleenpd + "%, Stomach: $" + stomachp + " " + stomachps + stomachpd + "%");
        return tempMarket;
    }
    public int getKidney(){
        return kidneyp;
    }
    public int getLiver(){
        return liverp;
    }
    public int getHeart(){
        return heartp;
    }
    public int getEyes(){
        return eyesp;
    }
    public int getSkin(){
        return skinp;
    }
    public int getSpleen(){
        return spleenp;
    }
    public int getStomach(){
        return stomachp;
    }
    public void printMarket(){
        tempMarket = ("Kidney: $" + kidneyp + " " + kidneyps + kidneypd + "%, Liver: $" + liverp + " " + liverps + liverpd + "%, Heart: $" + heartp + " " + heartps + heartpd + "%, Eyes: $" + eyesp + " " + eyesps + eyespd + "%, Skin: $" + skinp + " " + skinps + skinpd + "%, Spleen: $" + spleenp + " " + spleenps + spleenpd + "%, Stomach: $" + stomachp + " " + stomachps + stomachpd + "%");
        System.out.println(tempMarket);
    }
}
