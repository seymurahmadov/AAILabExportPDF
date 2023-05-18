package com.aailab.aailabexportpdf.controller;

import com.aailab.aailabexportpdf.service.CanService;
import com.itextpdf.text.DocumentException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/candidates")
public class CandidateController {



    private final CanService canService;

    public CandidateController(CanService canService) {
        this.canService = canService;
    }

    @GetMapping()
    public void writeDataToPdf() throws DocumentException, FileNotFoundException {
        canService.exportDataToPdf("C:\\Users\\user\\Desktop\\Test\\JavaSyllabus2022.pdf");
    }
}
