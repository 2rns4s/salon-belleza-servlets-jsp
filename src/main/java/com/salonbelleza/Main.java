package com.salonbelleza;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        File baseDir = Files.createTempDirectory("tomcat-temp").toFile();
        tomcat.setBaseDir(baseDir.getAbsolutePath());

        String webappDirLocation = new File("src/main/webapp").getAbsolutePath();
        StandardContext context = (StandardContext) tomcat.addWebapp("", webappDirLocation);

        File additionWebInfClasses = new File("target/classes");
        if (!additionWebInfClasses.exists()) {
            additionWebInfClasses = new File("build/classes/java/main");
        }

        WebResourceRoot resources = new StandardRoot(context);
        resources.addPreResources(new DirResourceSet(
                resources,
                "/WEB-INF/classes",
                additionWebInfClasses.getAbsolutePath(),
                "/"
        ));
        context.setResources(resources);

        tomcat.start();
        System.out.println("Tomcat iniciado en el puerto 8080. Entra a http://localhost:8080/");
        tomcat.getServer().await();
    }
}
