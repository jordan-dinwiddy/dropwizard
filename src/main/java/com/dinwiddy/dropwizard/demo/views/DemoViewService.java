package com.dinwiddy.dropwizard.demo.views;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;

public class DemoViewService extends Service<DemoViewConfiguration> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoViewService.class);

	public static void main(String[] args) throws Exception {
        new DemoViewService().run(args);
    }

    @Override
    public void initialize(Bootstrap<DemoViewConfiguration> bootstrap) {
    	
    	LOGGER.info("Initing...");	// This doesn't get logged (I guess the logging service gets initialized late)
    	
    	bootstrap.setName("demo-view");
        bootstrap.addBundle(new AssetsBundle("/assets/", "/"));
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(DemoViewConfiguration configuration, Environment environment) {
        
    	LOGGER.info("run()...");	// This does get logged
    	environment.addResource(new PersonResource());
    }
}
