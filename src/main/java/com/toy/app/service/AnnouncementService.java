package com.toy.app.service;

import com.toy.app.model.announcement.Announcement;
import com.toy.app.model.announcement.model.AnnouncementRequest;
import com.toy.app.model.announcement.model.AnnouncementResponse;
import com.toy.app.model.announcement.repository.AnnouncementRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AnnouncementService {

    private ModelMapper modelMapper = new ModelMapper();
    private final AnnouncementRepository announcementRepository;

    public AnnouncementResponse insertAnnouncement(AnnouncementRequest request) {
        Announcement announcement = announcementRepository.save(modelMapper.map(request, Announcement.class));
        return modelMapper.map(announcement,AnnouncementResponse.class);
    }

    public List<AnnouncementResponse> getListAnnouncements() {
        List<Announcement> announcements =announcementRepository.findAll();
        return announcements.stream().map(announcement -> modelMapper.map(announcement,AnnouncementResponse.class)).collect(Collectors.toList());
    }

    public AnnouncementResponse getAnnouncement(Long idx) {
        Announcement announcement = announcementRepository.findById(idx).orElse(null);
        System.out.println(announcement.getIdx());


        return modelMapper.map(announcement,AnnouncementResponse.class);
    }
}
