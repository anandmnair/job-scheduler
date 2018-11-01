package com.sg.data.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController("/api/v1/job")
@Slf4j
public class JobResource {

    @PostMapping("/upload")
    public String uploadJob(@RequestParam("file") MultipartFile file) {
        String message = String.format("file uploaded successfully :: file name : %s , file size : %s KB",
                file.getOriginalFilename(), file.getSize()/1024);
        log.info(message);
        return message;
    }

}
