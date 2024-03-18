package ohj.core.springoop.web;

import lombok.RequiredArgsConstructor;
import ohj.core.springoop.common.MyLogger;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-03-18
 * Desc :
 */
@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final ObjectProvider<MyLogger> myLoggerProvider;
    public void logic(String id) {
        MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
