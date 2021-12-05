package io.jatoms.ds.in.karaf.basic;

import io.jatoms.ds.in.karaf.api.GreeterService;
import org.osgi.service.component.annotations.Component;

@Component
public class BasicGreeter implements GreeterService {
    
    @Override
    public String greet(String toGreet) {
        return "Hello " + toGreet;
    }
}