import java.io.*;


public class Logger {
    private static Logger instance;
    private String fileName;
    private BufferedWriter writer  = null;

    private Logger(){
        createFile("log.txt");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void createFile(String name){
        FileWriter newFile;
        try{
            if (writer != null){
                writer.close();
            }
                newFile = new FileWriter(name,true);
                writer = new BufferedWriter(newFile);
                this.fileName = name;

        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void setFileName(String fileName){
        createFile(fileName);
    }

    public void write(String msg){
        try{
            if (writer != null){
                writer.write(msg);
                writer.newLine();
                writer.flush();
            }

        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void close(){
        try{
            if (writer != null){
                writer.close();
            }
        }catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
