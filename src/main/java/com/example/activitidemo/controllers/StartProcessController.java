package com.example.activitidemo.controllers;

import com.example.activitidemo.Constants;
import com.example.activitidemo.Models.StartProcessRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path= Constants.API_PATH)
public class StartProcessController {

    @PostMapping("/start-process")
    public ResponseEntity<String> startProcess(
            @Valid
            @RequestBody
                    StartProcessRequest startProcessRequest) {
            return new ResponseEntity<String>("1234",HttpStatus.OK);
    }
}
