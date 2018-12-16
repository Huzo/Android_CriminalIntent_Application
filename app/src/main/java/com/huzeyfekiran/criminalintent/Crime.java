package com.huzeyfekiran.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID id;
    private Date date;
    private String title;
    private boolean solved;

    public Crime() {
        id = UUID.randomUUID();
        date = new Date();
        solved = false;
    }

    public UUID getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

}
