package com.priyansh.bugtracker.controller;

import com.priyansh.bugtracker.entity.Bug;
import com.priyansh.bugtracker.service.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bugs")
public class BugController{
    @Autowired
    private BugService bugService;

    @PostMapping
    public Bug createBug(@RequestBody Bug bug){
        return bugService.saveBug(bug);
    }
    @GetMapping
    public List<Bug>getAllBugs(){
        return bugService.getAllBugs();
    }
    @GetMapping("/{id}")
    public Bug getBugById(@PathVariable Long id){
        return bugService.getBugById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteBug(@PathVariable Long id) {
        bugService.deleteBug(id);
    }
    @PutMapping("/{id}")
    public Bug updateBug(@PathVariable Long id, @RequestBody Bug bug){
        return bugService.updateBug(id, bug);
    }
}
