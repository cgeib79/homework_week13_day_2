package com.example.codeclan.fileservice.controller;

import com.example.codeclan.fileservice.repository.FileRepository;
import com.example.codeclan.fileservice.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/folders")
public class FolderController {

    @Autowired
    FolderRepository Repository;

}
