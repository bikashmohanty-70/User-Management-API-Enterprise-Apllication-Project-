package com.bridgelabz.usermanagementapi.resources;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api") // This annotation identifies the application path that serves as the base URI
						// for all resources. This should be used on the configuration class, i.e. the
						// subclass of javax.ws.rs.core.Application.
public class MyRestApp extends Application {
}