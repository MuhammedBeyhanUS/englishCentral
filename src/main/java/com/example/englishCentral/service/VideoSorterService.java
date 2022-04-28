package com.example.englishCentral.service;

import com.example.englishCentral.Entity.Video;

import java.util.List;

public interface VideoSorterService {
    void printMyData(List<Video> videos);
    List<Video> sortByName(List<Video> videos);
    List<Video> sortByDuration(List<Video> videos);
    List<Video> sortByDate(List<Video> videos);
}
