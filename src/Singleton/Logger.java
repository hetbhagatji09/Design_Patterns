package Singleton;

public class Logger {
    //Construcor must be private
    private Logger(){

    }
    public static class LoggerHolder{
        public static Logger logger=new Logger();
    }
    public static Logger getInstance(){
        return LoggerHolder.logger;
    }
    public void log(){
        System.out.println("Logger");
    }
}
