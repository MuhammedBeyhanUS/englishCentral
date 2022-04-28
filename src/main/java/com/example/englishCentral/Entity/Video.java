package com.example.englishCentral.Entity;

import java.util.Date;
import java.util.Objects;

public class Video {
    String name;
    Integer duration;
    Date date;

    public Video(String name, Integer duration, Date date) {
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return name.equals(video.name) && duration.equals(video.duration) && date.equals(video.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, date);
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
