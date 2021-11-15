/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.gui;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author DO TAT HOA
 */
public class NewClass {

    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(new File("./src/com/dienmaydo/pdf/hoadon.pdf")));

            document.open();
            
            Paragraph maHD2 = new Paragraph("HD001");
            Paragraph tenKH2 = new Paragraph("Do Tat Hoa");
            Paragraph diaChi2 = new Paragraph("Thanh Hoa");
            Paragraph soDienThoai2 = new Paragraph("0975086003");
            
            Paragraph tieuDe = new Paragraph("HOA DON THANH TOAN",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLDITALIC));
            Paragraph ngayThang = new Paragraph("21-09-2002",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLDITALIC));
            Paragraph maHD1 = new Paragraph("Ma hoa don: " +maHD2,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLDITALIC));
            Paragraph tenKH1 = new Paragraph("Khach hang: " +tenKH2,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLDITALIC));
            Paragraph diaChi1 = new Paragraph("Dia chi: " +diaChi2,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLDITALIC));
            Paragraph soDienThoai1 = new Paragraph("SDT: "+soDienThoai2,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLDITALIC));
        
            
            tieuDe.setAlignment(Element.ALIGN_CENTER);
            ngayThang.setAlignment(Element.ALIGN_CENTER);
            ngayThang.setSpacingAfter(15);
            maHD1.setAlignment(Element.ALIGN_RIGHT);
            tenKH1.setSpacingBefore(15);
            tenKH1.setAlignment(Element.ALIGN_LEFT);
            diaChi1.setAlignment(Element.ALIGN_LEFT);
            soDienThoai1.setAlignment(Element.ALIGN_LEFT);
            soDienThoai1.setSpacingAfter(15);

            PdfPTable table = new PdfPTable(5);
            float[] withsKM = {10f,20f,10f,10f,15f};
            table.setWidthPercentage(100);
            table.setWidths(withsKM);
            table.setSpacingAfter(25);
            PdfPCell tenCot1 = new PdfPCell(new Paragraph("Ma san pham",FontFactory.getFont(FontFactory.TIMES_ROMAN,12)));
            PdfPCell tenCot2 = new PdfPCell(new Paragraph("Ten san pham",FontFactory.getFont(FontFactory.TIMES_ROMAN,12)));
            PdfPCell tenCot3 = new PdfPCell(new Paragraph("Don Gia",FontFactory.getFont(FontFactory.TIMES_ROMAN,12)));
            PdfPCell tenCot4 = new PdfPCell(new Paragraph("So luong",FontFactory.getFont(FontFactory.TIMES_ROMAN,12)));
            PdfPCell tenCot5 = new PdfPCell(new Paragraph("Thanh Tien",FontFactory.getFont(FontFactory.TIMES_ROMAN,12)));
             
            tenCot1.setHorizontalAlignment(Element.ALIGN_CENTER);
            tenCot2.setHorizontalAlignment(Element.ALIGN_CENTER);
            tenCot3.setHorizontalAlignment(Element.ALIGN_CENTER);
            tenCot4.setHorizontalAlignment(Element.ALIGN_CENTER);
            tenCot5.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            table.addCell(tenCot1);
            table.addCell(tenCot2);
            table.addCell(tenCot3);
            table.addCell(tenCot4);
            table.addCell(tenCot5);
            
            Paragraph footer = new Paragraph("NGUOI LAP HOA DON",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLDITALIC));
            Paragraph nguoiLap = new Paragraph("Do Tat Hoa",FontFactory.getFont(FontFactory.TIMES_ROMAN,14));
            footer.setAlignment(Element.ALIGN_RIGHT);
            nguoiLap.setAlignment(Element.ALIGN_RIGHT);
            nguoiLap.setIndentationRight(35);
            
            document.add(tieuDe);
            document.add(ngayThang);
            document.add(maHD1);
            document.add(tenKH1);
            document.add(diaChi1);
            document.add(soDienThoai1);
            document.add(table);
            document.add(footer);
            document.add(nguoiLap);

            document.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
