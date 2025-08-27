package com.nogiveup.myv.domain.songrecommend.controller;

import com.nogiveup.myv.domain.songrecommend.service.SongRecommendService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main/")
public class SongRecommendController {
    private final SongRecommendService songRecommendService;

    public SongRecommendController(SongRecommendService songRecommendService) {
        this.songRecommendService = songRecommendService;
    }

}
