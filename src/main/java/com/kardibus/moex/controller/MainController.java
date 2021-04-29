package com.kardibus.moex.controller;

import com.kardibus.moex.service.workFile.FileReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Controller
public class MainController {

    @Value("${upload.path}")
    private String uploadPath;

    private FileReader fileReader;

    public MainController(FileReader fileReader){
        this.fileReader =fileReader;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String fileParser(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes) throws IOException, ExecutionException, InterruptedException {


        if (file != null && !file.getOriginalFilename().isEmpty()) {
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }
            file.transferTo(new File(uploadPath));
        }
        fileReader.start();
        return "index";
    }
}
