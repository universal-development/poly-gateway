package com.unidev.polygateway;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Error handling controller
 */
@RestController
public class GatewayErrorController  implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
