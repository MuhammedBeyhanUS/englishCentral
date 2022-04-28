package com.example.englishCentral.service.Impl;

import com.example.englishCentral.Entity.Video;
import com.example.englishCentral.service.VideoSorterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class VideoSorterServiceImpl implements VideoSorterService {
    @Override
    public void printMyData(List<Video> videos) {
        System.out.println(videos.toString());
    }

    @Override
    public List<Video> sortByName(List<Video> videos) {
        ArrayList<Video> videoArrayList = new ArrayList<>(videos);
        videoArrayList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return videoArrayList;
    }

    @Override
    public List<Video> sortByDuration(List<Video> videos) {
        ArrayList<Video> videoArrayList = new ArrayList<>(videos);
        videoArrayList.sort(Comparator.comparing(Video::getDuration));
        return videoArrayList;
    }

    @Override
    public List<Video> sortByDate(List<Video> videos) {
        ArrayList<Video> videoArrayList = new ArrayList<>(videos);
        videoArrayList.sort(Comparator.comparing(Video::getDate));
        return videoArrayList;
    }
}
