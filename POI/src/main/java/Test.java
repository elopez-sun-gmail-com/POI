
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx.org.dto.RepEstadisticasxTipoVisitante;
import mx.org.poi.ReporteXLS;

/**
 *
 * @author elopez
 */
public class Test {

    /**
     *
     * @return
     */
    public Map logica_negocio() {

        Map mapa = new HashMap();

        RepEstadisticasxTipoVisitante bean = new RepEstadisticasxTipoVisitante(
                new Long(9187046), new Long(8440), new Long(241667), new Long(1900777), new Long(1114915), new Long(497253),
                new Long(14647), new Long(2252441), new Long(3156906), new Long(47806), new Long(107834), new Long(82612),
                new Long(105870), new Long(1064), new Long(2410719), new Long(2755905));

        List lista = new ArrayList();
        lista.add(bean);

        mapa.put("BEAN", lista);
        mapa.put("TOTAL", (bean.getTotal_nacional() + bean.getTotal_extranjero()));

        return mapa;
    }

    public static void main(String[] args) {

        Test test = new Test();

        String template = "D:\\Desarrollo\\Workspace\\NetBeansProjects\\POI\\src\\main\\java\\estadisticaVisitante.xls";
        Map beanParams = test.logica_negocio();
        String destFilePath = "D:\\Desarrollo\\Workspace\\NetBeansProjects\\POI\\src\\main\\java\\estadisticaVisitante_COPY.xls";

        ReporteXLS repXls = new ReporteXLS();
        boolean result = repXls.generate(template, beanParams, destFilePath);

        if (result) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }

    }
}
