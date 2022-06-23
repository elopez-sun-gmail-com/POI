package mx.org.poi;

import java.io.IOException;
import java.util.Map;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author elopez
 */
public class ReporteXLS {

    /**
     * 
     * @param template
     * @param beanParams
     * @param destFilePath
     * @return 
     */
    public boolean generate(String template, Map beanParams, String destFilePath) {

        boolean result = false;

        XLSTransformer transformer = new XLSTransformer();

        try {
            transformer.transformXLS(template, beanParams, destFilePath);
            result = true;
        } catch (ParsePropertyException e) {
            System.out.println("ParsePropertyException --> " + e.getMessage());
        } catch (InvalidFormatException e) {
            System.out.println("InvalidFormatException --> " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException --> " + e.getMessage());
        }

        return result;

    }   

}
