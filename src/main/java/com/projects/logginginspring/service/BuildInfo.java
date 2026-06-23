package com.projects.logginginspring.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Build-time info baked into the JAR by Maven resource filtering of
 * src/main/resources/build-info.properties. Updated automatically
 * by the CI/CD workflow before each build.
 */
public final class BuildInfo {

    private static final Properties PROPS = new Properties();

    static {
        try (InputStream in = BuildInfo.class.getResourceAsStream("/build-info.properties")) {
            if (in != null) {
                PROPS.load(in);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load build-info.properties", e);
        }
    }

    public static final String VERSION = PROPS.getProperty("build.version", "unknown");
    public static final String BUILD_TIME = PROPS.getProperty("build.time", "unknown");

    private BuildInfo() {}
}