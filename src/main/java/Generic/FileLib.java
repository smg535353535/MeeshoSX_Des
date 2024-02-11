package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

    public String getPropertyData(String key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Inteleje test\\MeeshoSX_Des\\src\\test\\java\\Config\\Config.property");
        Properties p = new Properties();
        p.load(fis);
         //String s=p.getProperty(Key);
        //return s;
        return p.getProperty(key);
    }












    //** We need Apache poi and apache poi ooxml dependencies to read the data from excel **//
//   public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
//    {
//        FileInputStream fis=new FileInputStream("./testdata/TestScriptData.xlsx");
//        Work wb = WorkbookFactory.create(fis);
//        String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
//        return data;
//    }
//    public void setExcelData(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException
//    {
//        FileInputStream fis=new FileInputStream("./testdata/TestScriptdata.xlsx");
//        Workbook wb = WorkbookFactory.create(fis);
//        wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
//        FileOutputStream fos=new FileOutputStream("./testdata/TestScriptData.xlsx");
//        wb.write(fos);
//    }

}
