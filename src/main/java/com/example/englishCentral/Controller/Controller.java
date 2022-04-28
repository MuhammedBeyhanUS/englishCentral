package com.example.englishCentral.Controller;

import com.example.englishCentral.Entity.Video;
import com.example.englishCentral.service.Impl.VideoSorterServiceImpl;
import com.example.englishCentral.service.VideoSorterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/videos/sortBy")
public class Controller {

    private final VideoSorterService videoSorterService;

    public Controller(VideoSorterService videoSorterService){
        this.videoSorterService = videoSorterService;
    }

    @PostMapping("/name")
    public List<Video> sortVideosByName(@RequestBody List<Video> videos){
        System.out.println("------New Request------");
        videoSorterService.printMyData(videos);
        System.out.println("Sorting videos by their name");
        List<Video> sorted = videoSorterService.sortByName(videos);
        videoSorterService.printMyData(sorted);
        return sorted;
    }

    @PostMapping("duration")
    public List<Video> sortVideosByDuration(@RequestBody List<Video> videos){
        System.out.println("------New Request------");
        videoSorterService.printMyData(videos);
        System.out.println("Sorting videos by their duration");
        List<Video> sorted = videoSorterService.sortByDuration(videos);
        videoSorterService.printMyData(sorted);
        return sorted;
    }

    @PostMapping("date")
    public List<Video> sortVideosByDate(@RequestBody List<Video> videos){
        System.out.println("------New Request------");
        videoSorterService.printMyData(videos);
        System.out.println("Sorting videos by their date");
        List<Video> sorted = videoSorterService.sortByDate(videos);
        videoSorterService.printMyData(sorted);
        return sorted;
    }
}
