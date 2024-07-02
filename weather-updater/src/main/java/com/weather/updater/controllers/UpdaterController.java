package com.weather.updater.controllers;
import com.weather.updater.updater.IUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
@RequestMapping("updater")
public class UpdaterController {

    private final IUpdate updater;

    @Autowired
    public UpdaterController(IUpdate updater) {
        this.updater = updater;
    }

    @GetMapping("update")
    public ResponseEntity update(@RequestParam int size){
        new Thread(()-> updater.size(size)).start();
        return ResponseEntity.ok("Update Started at " + LocalDateTime.now());
    }
}
