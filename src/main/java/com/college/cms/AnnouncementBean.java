package com.college.cms;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named("announcementBean")
@RequestScoped
public class AnnouncementBean {

    @Inject
    private AnnouncementService announcementService;

    public List<Announcement> getAnnouncements() {
        return announcementService.getAnnouncements();
    }

    public String getServiceStatus() {
        return announcementService.getServiceStatus();
    }
}