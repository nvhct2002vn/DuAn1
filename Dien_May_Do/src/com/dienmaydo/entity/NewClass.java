/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dienmaydo.entity;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author DO TAT HOA
 */
public class NewClass {

    public static void main(String[] args) {
        try {
            XWPFDocument document = new XWPFDocument();
            FileOutputStream out = new FileOutputStream(new File("src/com/dienmaydo/pdf/demo.docx"));

            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            paragraph.setAlignment(ParagraphAlignment.CENTER);
            run.setText("SIÊU THỊ ĐIỆN MÁY ĐỎ");
            run.setFontSize(20);
            run.setBold(true);

            XWPFParagraph paragraph2 = document.createParagraph();
            XWPFRun run2 = paragraph2.createRun();
            paragraph2.setAlignment(ParagraphAlignment.CENTER);
            run2.setText("ĐC: Phố Trịnh Văn Bô, Xuân Phương, Nam Từ Liêm, Hà Nội");

            XWPFParagraph paragraph3 = document.createParagraph();
            XWPFRun run3 = paragraph3.createRun();
            paragraph3.setAlignment(ParagraphAlignment.CENTER);
            run3.setText("ĐT: 0975.086.003");
            run3.setTextPosition(50);

            XWPFParagraph paragraph4 = document.createParagraph();
            XWPFRun run4 = paragraph4.createRun();
            paragraph4.setAlignment(ParagraphAlignment.CENTER);
            run4.setText("HÓA ĐƠN BÁN HÀNG");
            run4.setFontSize(30);
            run4.setBold(true);

            XWPFParagraph paragraph5 = document.createParagraph();
            XWPFRun run5 = paragraph5.createRun();
            paragraph5.setAlignment(ParagraphAlignment.CENTER);
            run5.setText("Hóa đơn số: 10");
            run5.setTextPosition(50);

            XWPFParagraph paragraph6 = document.createParagraph();
            XWPFRun run6 = paragraph6.createRun();
            run6.setText("Khách hàng: Đỗ Tất Hòa");

            XWPFParagraph paragraph7 = document.createParagraph();
            XWPFRun run7 = paragraph7.createRun();
            run7.setText("Địa chỉ: Thanh Hóa");

            XWPFParagraph paragraph8 = document.createParagraph();
            XWPFRun run8 = paragraph8.createRun();
            run8.setText("SĐT: 0975086003");

            XWPFParagraph paragraph9 = document.createParagraph();
            XWPFRun run9 = paragraph9.createRun();
            run9.setText("Ngày lập: 01-01-2021");
            run9.setTextPosition(50);

            XWPFTable table = document.createTable(4, 5);
            table.setWidth("100%");

            XWPFTableRow row = table.getRow(0);
            XWPFParagraph paragraph10 = row.getCell(0).addParagraph();
            paragraph10.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run10 = paragraph10.createRun();
            run10.setText("Mã sản phẩm");
            run10.setBold(true);
            run10.setTextPosition(20);

            XWPFTableRow row2 = table.getRow(0);
            XWPFParagraph paragraph11 = row.getCell(1).addParagraph();
            paragraph11.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run11 = paragraph11.createRun();
            run11.setText("Tên sản phẩm");
            run11.setBold(true);
            run11.setTextPosition(20);

            XWPFTableRow row3 = table.getRow(0);
            XWPFParagraph paragraph12 = row.getCell(2).addParagraph();
            paragraph12.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run12 = paragraph12.createRun();
            run12.setText("Số lượng");
            run12.setBold(true);
            run12.setTextPosition(20);

            XWPFTableRow row4 = table.getRow(0);
            XWPFParagraph paragraph13 = row.getCell(3).addParagraph();
            paragraph13.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run13 = paragraph13.createRun();
            run13.setText("Đơn giá");
            run13.setBold(true);
            run13.setTextPosition(20);

            XWPFTableRow row5 = table.getRow(0);
            XWPFParagraph paragraph14 = row.getCell(4).addParagraph();
            paragraph14.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run14 = paragraph14.createRun();
            run14.setText("Thành tiền");
            run14.setBold(true);
            run14.setTextPosition(20);

            table.getRow(1).getCell(0).setText("one");
            table.getRow(1).getCell(1).setText("two");
            table.getRow(1).getCell(2).setText("three");
            table.getRow(1).getCell(3).setText("three");
            table.getRow(1).getCell(4).setText("three");

            table.getRow(2).getCell(0).setText("XXX");
            table.getRow(2).getCell(1).setText("YYYYY");
            table.getRow(2).getCell(2).setText("ZZZZZZ");
            table.getRow(2).getCell(3).setText("YYYYY");
            table.getRow(2).getCell(4).setText("ZZZZZZ");

            table.getRow(3).getCell(0).setText("TỔNG");
            table.getRow(3).getCell(1).setText("");
            table.getRow(3).getCell(2).setText("6");
            table.getRow(3).getCell(3).setText("");
            table.getRow(3).getCell(4).setText("1,00,000");
            
            XWPFParagraph paragraph15 = document.createParagraph();
            paragraph15.setAlignment(ParagraphAlignment.RIGHT);
            

            XWPFParagraph paragraph16 = document.createParagraph();
            paragraph16.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun run16 = paragraph16.createRun();
            run16.setText("Người lập hóa đơn");
            run16.setBold(true);
            run16.setFontSize(15);
            
            XWPFParagraph paragraph17 = document.createParagraph();
            paragraph17.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun run17 = paragraph17.createRun();
            run17.setText("Đỗ Tất Hòa");
            run17.setTextPosition(80);

            XWPFParagraph paragraph18 = document.createParagraph();
            paragraph18.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run18 = paragraph18.createRun();
            run18.setText("Cảm ơn quý khách đã mua hàng!");
            
            XWPFParagraph paragraph19 = document.createParagraph();
            paragraph19.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run19 = paragraph19.createRun();
            run19.setText("Hẹn gặp lại!");

            document.write(out);
            out.close();
            document.close();

            System.out.println("Thành công");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
