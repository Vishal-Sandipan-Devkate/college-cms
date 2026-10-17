# College CMS

A Java web application for a college management system built with Jakarta EE, JavaServer Faces (JSF), and Spring Framework. The project exposes a web UI and uses Spring configuration for bean management and application wiring.

## Features

- College information management
- Announcement support
- JSF-based web interface
- Spring-based application configuration
- WAR packaging for deployment to a Java EE server

## Tech Stack

- Java 21
- Maven
- Jakarta EE 10
- JavaServer Faces (JSF)
- Spring Framework 6
- WAR packaging

## Project Structure

```text
college-cms/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── college/
│   │   │           └── cms/
│   │   │               ├── Announcement.java
│   │   │               ├── AnnouncementBean.java
│   │   │               ├── AnnouncementService.java
│   │   │               ├── CollegeInfoService.java
│   │   │               ├── SpringConfig.java
│   │   │               ├── SpringContextListener.java
│   │   │               ├── SpringTest.java
│   │   │               ├── SpringWebConfig.java
│   │   └── webapp/
│   │       ├── index.xhtml
│   │       ├── resources/
│   │       └── WEB-INF/
│   │           ├── beans.xml
│   │           ├── faces-config.xml
│   │           └── web.xml
└── target/
```

## Prerequisites

Before running the project, make sure you have:

- JDK 21 or later
- Maven 3.8+
- A Java EE application server such as WildFly, Payara, or another compatible server

## Build the Project

From the project root, run:

```bash
mvn clean package
```

This creates a deployable WAR file at:

```text
target/college-cms.war
```

## Run / Deploy

### Option 1: Deploy to WildFly or similar server

1. Start your application server.
2. Copy the generated WAR file to the server deployment directory.
3. Access the application in a browser via:

```text
http://localhost:8080/college-cms/
```

### Option 2: Local development server

If your environment already includes a Jakarta EE container, deploy the WAR generated under `target/` and open the app through the server's context path.

## Default Entry Point

The default page is:

```text
index.xhtml
```

which is mapped by the web configuration and served as the application landing page.

## Notes

- The application uses Spring as the container for web configuration and application beans.
- JSF pages are served through the `FacesServlet` configured in `src/main/webapp/WEB-INF/web.xml`.
- The project is packaged as a WAR, which is standard for Java EE web applications.

