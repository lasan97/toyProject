package com.toy.app.model.resume.repository;

import com.toy.app.model.resume.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumRepository extends JpaRepository<Resume,Long> {



}
