
package sesion6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

public class Sesion6 {

    public static void main(String[] args) {
        List<Jugador> listaJugadores= new ArrayList<Jugador>();
        for(int cont=1;cont<=49;cont++){
            listaJugadores.add(new Jugador(cont,"Jugador"+cont,"Wii"));
        }
        for(int cont=50;cont<=79;cont++){
            listaJugadores.add(new Jugador(cont,"Jugador"+cont,"XBox"));
        }
        for(int cont=80;cont<=100;cont++){
            listaJugadores.add(new Jugador(cont,"Jugador"+cont,"PS3"));
        }
        try {
            JasperReport reporte= (JasperReport) JRLoader.loadObjectFromFile("report6.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(listaJugadores));
            
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new File("Reporte6PDF.pdf"));
            exporter.exportReport();
        } catch (JRException ex) {
            Logger.getLogger(Sesion6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
