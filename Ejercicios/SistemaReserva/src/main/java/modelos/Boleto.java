/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;


/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Boleto {
    public static void generarBoleto(String IdVuelo, LocalTime horaSalida, LocalTime horaLlegada, int asiento, Asiento data) throws FileNotFoundException, IOException {
        // Creando un PdfWriter
        String ruta = "boleto_" + data.getNombre() + "_" + data.getNUIP() + ".pdf";
        PdfWriter writer = new PdfWriter(ruta);
        
        // Creando un PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);
        
        // Agregando una nueva pagina
        pdfDoc.addNewPage();
        
        // Creando el documento
        Document doc = new Document(pdfDoc);
        
        // Agregando texto
        doc.add(new Paragraph("¡Bienvenido a VIAJAR S.A.S!"));
        doc.add(new Paragraph("Estamos encantados de que hayas confiado en nosotros para hacer posible tu próximo viaje. Este boleto de avión ha sido emitido para garantizar que tu experiencia sea única y placentera. En VIAJAR S.A.S, nuestra prioridad es proporcionarte un servicio de alta calidad que te permita cumplir con tus planes de viaje con comodidad y seguridad."));
        doc.add(new Paragraph("Motivo del boleto:"));
        doc.add(new Paragraph("Este boleto de avión ha sido emitido para tu vuelo programado con nosotros. Ya sea que estés viajando por negocios, placer o cualquier otra razón, estamos aquí para asegurarnos de que llegues a tu destino de manera eficiente y puntual."));
        doc.add(new Paragraph("Recomendaciones antes y durante el vuelo:"));
        List recomends = new List();
        recomends.add("Llega con tiempo de anticipación: Te sugerimos llegar al aeropuerto con suficiente tiempo antes de la hora de salida programada. Esto te permitirá completar los procedimientos de check-in y seguridad sin prisas.");
        recomends.add("Documentación: Asegúrate de tener todos los documentos necesarios, como tu identificación, pasaporte y visa, si es necesario.");
        recomends.add("Equipaje: Verifica las restricciones de equipaje de la aerolínea y asegúrate de que tu equipaje cumpla con los requisitos de peso y tamaño.");
        recomends.add("Seguridad: Colabora con las autoridades de seguridad y sigue todas las instrucciones durante el proceso de control.");
        recomends.add("Mantenimiento de la salud: Dado el contexto actual, te recomendamos llevar contigo tus artículos de higiene personal y seguir las medidas de seguridad y salud recomendadas durante el vuelo.");
        doc.add(recomends);
        doc.add(new Paragraph("A continuación, encontrarás la información relacionada con el pasajero y el vuelo reservado. Verifica que todos los detalles sean correctos y, si tienes alguna pregunta o necesitas asistencia adicional, no dudes en contactarnos. Estamos aquí para ayudarte en cada paso de tu viaje. ¡Buen vuelo!"));
        doc.add(new Paragraph(""));
        doc.add(new Paragraph("Información del pasajero:"));
        List pasajero = new List();
        pasajero.add("NUIP: " + data.getNUIP());
        pasajero.add("Nombre: " + data.getNombre());
        pasajero.add("Clase: " + data.getClase());
        pasajero.add("Asiento: " + asiento);
        doc.add(pasajero);
        doc.add(new Paragraph("Información del vuelo:"));
        List vuelo = new List();
        vuelo.add("Aeronave: " + IdVuelo);
        vuelo.add("Hora de salida: " + horaSalida);
        vuelo.add("Hora de llegada: " + horaLlegada);
        doc.add(vuelo);
        
        // Cerrando el documento    
        doc.close();
        
        abrirPDF(ruta);
    }
    
    private static void abrirPDF(String nombreArchivo) throws IOException {
        String sistemaOperativo = System.getProperty("os.name").toLowerCase();
        
        if (sistemaOperativo.contains("win")) {
            // Si es Windows
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + nombreArchivo);
        } else if (sistemaOperativo.contains("nix") || sistemaOperativo.contains("nux") || sistemaOperativo.contains("mac")) {
            // Si Linux o macOS
            Desktop.getDesktop().open(new File(nombreArchivo));
        } else {
            // Si OS no compatible
            throw new RuntimeException("OS no compatible");
        }
        
    }
}
