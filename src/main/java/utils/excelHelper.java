package utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: test-hwb
 * @date: 2018/2/7-下午4:27
 */
public class excelHelper {
    private static final Logger logger = LoggerFactory.getLogger(excelHelper.class);

    public static Object[][] readExcel(String filepath, String sheetname) throws IOException {
        File file = new File(filepath);
        String fileName = file.getName();
        logger.info(fileName);
        Workbook workbook = null;
        FileInputStream inputStream = new FileInputStream(file);
        if (fileName.substring(fileName.indexOf(".")).equals(".xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else if (fileName.substring(fileName.indexOf(".")).equals(".xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        }
        if (workbook != null) {
            Sheet sheet = workbook.getSheet(sheetname);
            if (sheet != null) {
                int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
                logger.info(String.valueOf(sheet.getLastRowNum()));
                logger.info(String.valueOf(sheet.getFirstRowNum()));
                logger.info(String.valueOf(rowCount));
                List<Object[]> record = new ArrayList<>();
                for (int i = 1; i < rowCount; i++) {
                    Row row = sheet.getRow(i);
                    String fields[] = new String[row.getLastCellNum()];
                    for (int j = 0; j < row.getLastCellNum(); j++) {
                        fields[j] = row.getCell(j).getStringCellValue();
                    }
                    record.add(fields);
                }
                Object[][] result = new Object[record.size()][];
                for (int i = 0; i < record.size(); i++) {
                    result[i] = record.get(i);
                }
                System.out.println(result);
                return result;
            }
            logger.error("sheet为null, 解析失败.");
        }
        logger.error("解析失败.");
        return null;
    }
}
