package com.toy.app.model.announcement.repository;

import com.toy.app.model.announcement.Announcement;
import com.toy.app.model.resume.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement,Long> {


    
}
