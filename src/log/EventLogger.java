package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;

	// 호출시 시각을 출력하고 log파일에 저장 
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 어떤 것을 호출했는지에 대한 정보를 출력
	public void log(String logMessage) {
		logger.info(logMessage);
	}

}
