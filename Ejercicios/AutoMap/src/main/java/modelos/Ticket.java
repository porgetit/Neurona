/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Ticket {
    private String rutaArchivo;    

    public Ticket(String matricula, iServicios lavado) throws FileNotFoundException {        
        rutaArchivo = "ticket_" + matricula  + "_" + (new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date())) + ".pdf";
        PdfWriter writer = new PdfWriter(rutaArchivo);
        PdfDocument pdfFile = new PdfDocument(writer);
        pdfFile.addNewPage();
        
        // Creando documento
        Document file = new Document(pdfFile);
        
        // Agregando contenido
        file.add(new Paragraph("AutoLavados AutoMap S.A.S"));
        file.add(new Paragraph(""));
        file.add(new Paragraph("Recibo de caja"));
        file.add(new Paragraph("Fecha: " + (new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date()))));
        file.add(new Paragraph(""));
        file.add(new Paragraph("Matrícula: " + matricula));
        file.add(new Paragraph(""));
        file.add(new Paragraph("Detalle de compra: \n" + lavado.getDescription()));
        file.add(new Paragraph("Total: $" + lavado.getPrice()));
        file.add(new Paragraph("¡Gracias por escoger un AutoLavado AutoMap!"));
        
        file.close();
    }
    
    public void mostrar() throws IOException {
        String sistemaOperativo = System.getProperty("os.name").toLowerCase();
        
        if (sistemaOperativo.contains("win")) {
            // Si es Windows
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + rutaArchivo);
        } else if (sistemaOperativo.contains("nix") || sistemaOperativo.contains("nux") || sistemaOperativo.contains("mac")) {
            // Si Linux o macOS
            Desktop.getDesktop().open(new File(rutaArchivo));
        } else {
            // Si OS no compatible
            throw new RuntimeException("OS no compatible");
        }
    }
    
}
