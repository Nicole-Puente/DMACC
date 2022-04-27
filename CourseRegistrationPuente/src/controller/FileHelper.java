package controller;
import java.util.ArrayList;

public interface FileHelper {
	public boolean doesAFileExist();
	public boolean writeFile(ArrayList<?> readFile);
	public ArrayList<?> readFile();

}
