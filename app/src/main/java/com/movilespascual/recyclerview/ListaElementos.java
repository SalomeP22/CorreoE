package com.movilespascual.recyclerview;

public class ListaElementos {
    public  String n, t, corr, yearO, city;

    public ListaElementos(String Name, String Tel, String Email, String YearOld, String City) {
        this.n = Name;
        this.t = Tel;
        this.corr = Email;
        this.yearO = YearOld;
        this.city = City;
    }

    public String getName() {
        return n;
    }

    public void setName(String Name) {
        this.n = Name;
    }

    public String getTel() {
        return t;
    }

    public void setTel(String Tel) {
        this.t = Tel;
    }

    public String getEmail() {
        return corr;
    }

    public void setEmail(String Email) {
        this.corr = Email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        this.city = City;

    }

    public String getYearOld() {
        return yearO;
    }

    public void setYearOld(String YearOld) {
        this.yearO = YearOld;

    }

    public String getIni() {
        String Ini= n.substring(0, 1);
        return Ini;
    }

}
