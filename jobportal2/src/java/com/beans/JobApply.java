/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author anushikha
 */
public class JobApply {
    private int jaid,jid,jsid;
    String resume,applicationDate,shortlist;

    public int getJaid() {
        return jaid;
    }

    public void setJaid(int jaid) {
        this.jaid = jaid;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public int getJsid() {
        return jsid;
    }

    public void setJsid(int jsid) {
        this.jsid = jsid;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getShortlist() {
        return shortlist;
    }

    public void setShortlist(String shortlist) {
        this.shortlist = shortlist;
    }
    
}
