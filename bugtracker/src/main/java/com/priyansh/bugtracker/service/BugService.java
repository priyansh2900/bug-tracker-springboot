package com.priyansh.bugtracker.service;

import com.priyansh.bugtracker.entity.Bug;
import com.priyansh.bugtracker.repository.BugRepository;
import com.priyansh.bugtracker.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugService {

    @Autowired
    private BugRepository bugRepository;

    // Create Bug
    public Bug saveBug(Bug bug) {
        return bugRepository.save(bug);
    }

    // Get All Bugs
    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    // Get Bug By ID
    public Bug getBugById(Long id) {
        return bugRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bug not found with id: " + id));
    }

    // Delete Bug
    public void deleteBug(Long id) {

        Bug bug = bugRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bug not found with id: " + id));

        bugRepository.delete(bug);
    }

    // Update Bug
    public Bug updateBug(Long id, Bug bugDetails) {

        Bug bug = bugRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bug not found with id: " + id));

        bug.setTitle(bugDetails.getTitle());
        bug.setDescription(bugDetails.getDescription());
        bug.setStatus(bugDetails.getStatus());

        return bugRepository.save(bug);
    }
}