package elcom.com.core.read;
import java.io.*;
import java.util.*;
import elcom.com.core.dao.*;
import elcom.com.cfg.eLogger;
import com.elcom.Log.FileEvent;
import elcom.com.util.Utils;


/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2011</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class PMSFile extends ReadFileCommon {

    public PMSFile(String fileName) {
        super(fileName);
    }


    public String processRecord(String aLine, String proName, int pamramNum,FileEvent log) {
        PMSReadData.processCommom(aLine, proName,pamramNum,log);
        String sqlQuery = SQLPMS.STARTPROCEDURE + SQLPMS.BODYROCEDURE +SQLPMS.ENDPROCEDURE;
        Utils.outScreen(log, "Process data is successful!",false);
        return sqlQuery;
    }

    public static void main(String[] arg){
      PMSFile demo = new PMSFile("PMS.ftp");
      demo.readFile();
   }



}

