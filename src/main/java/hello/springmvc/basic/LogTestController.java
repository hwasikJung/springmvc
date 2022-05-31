package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        log.trace(" trace trace={}", name);
        log.debug(" debug debug={}", name);
        log.info(" info log={}", name);
        log.warn(" warn warn={}", name);
        log.error(" error error={}", name);
        return "ok";
    }

}
