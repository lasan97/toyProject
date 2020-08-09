package com.toy.app.controller;

import com.toy.app.model.announcement.model.AnnouncementRequest;
import com.toy.app.model.announcement.model.AnnouncementResponse;
import com.toy.app.service.AnnouncementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AnnouncementController {

    private AnnouncementService announcementService;

    // 공고 리스트
    @GetMapping(value = "/announcement/list")
    public  String getListAnnouncements(
            Model model
    ){
        model.addAttribute("list",announcementService.getListAnnouncements());
        return "";
    }

    @GetMapping(value = "/announcement/{idx}")
    public String getAnnouncement(
            @PathVariable Long idx,
            Model model
    ){
        model.addAttribute("announcemnet",announcementService.getAnnouncement(idx));
        return "";
    }

    // 공고 입력 폼
    @GetMapping(value = "/announcement/insert")
    public String insertAnnouncementForm(){
        return "InsertAnnouncement";
    }

    @PostMapping(value = "/announcement/insert")
    public String insertAnnouncement(
            @RequestBody AnnouncementRequest request
            ){
        AnnouncementResponse announcementResponse = announcementService.insertAnnouncement(request);
        return "index";
    }

}
