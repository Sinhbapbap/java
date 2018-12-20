/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.Serializable;

/**
 *
 * @author ThuSinh
 */
public class xe implements Serializable{
    protected String machuyen;
    protected String taixe;
    protected String soxe;
    protected double doanhthu;

    xe(){
        this.machuyen = "";
        this.taixe = "";
        this.soxe = "";
        this.doanhthu = 0.0d;
    }

    public xe(String machuyen, String taixe, String soxe, double doanhthu) {
        this.machuyen = machuyen;
        this.taixe = taixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }

    public double getDoanhthu() {
        return this.doanhthu;
    }
    

    @Override
    public String toString() {
        String st = "";
        st+="\t" + this.machuyen;
        st+="\t" + this.soxe;
        st+="\t" + this.taixe;
        st+="\t" + this.doanhthu;
        return st;
    }
    

}
