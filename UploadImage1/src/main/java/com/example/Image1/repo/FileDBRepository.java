package com.example.Image1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Image1.entity.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}