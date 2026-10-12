package com.college.cms;

import jakarta.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class AnnouncementService {

    public List<Announcement> getAnnouncements() {

        List<Announcement> announcements = new ArrayList<>();

        announcements.add(
            new Announcement(
                1,
                "Welcome to the New Academic Year",
                "Academic",
                "Students should review the academic calendar."
            )
        );

        announcements.add(
            new Announcement(
                2,
                "Technical Workshop",
                "Events",
                "Watch this portal for upcoming workshop details."
            )
        );

        return announcements;
    }

    public String getServiceStatus() {
        return "EJB Service is running";
    }
}
