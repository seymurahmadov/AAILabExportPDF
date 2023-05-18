package com.aailab.aailabexportpdf.service;

import com.aailab.aailabexportpdf.entity.Candidate;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Service
public class CanService {


    Candidate candidate = Candidate.builder()
            .id(1)
            .name("Vusal")
            .surname("Ahmadov")
            .fatherName("Fuzuli")
            .structuralSection("İctimaiyyətlə əlaqələr və protokol departamenti")
            .subStructuralSection("Test")
            .subSection("Test SubSection")
            .positon("Aparici mutexessis")
            .dateOfEmployement("01.05.2023")
            .probation("3")
            .operatingMode("Daily")
            .workTime("All")
            .salary(1633.0)
            .degree(8)
            .basicSalaryByState(1633.0)
            .additonalDueWorkingConditions(0.0)
            .anotherPersonalAddition(0.0)
            .build();

    String data = "1. İşçinin soyadı, adı, atasının adı : " + candidate.getSurname() + " "+ candidate.getName()+ " "  + candidate.getFatherName() + "\n"
            + "2. Struktur bölmə: " + candidate.getStructuralSection() + "\n"
            + "3. Alt struktur bölmə: " + candidate.getSubStructuralSection() + " \n"
            + "4. Alt bölmə: " + candidate.getSubSection() + "\n"
            + "5. Vəzifəsi: " + candidate.getPositon()+ "\n"
            + "6. İşə qəbul tarixi:" + candidate.getDateOfEmployement() + "\n"
            + "7. Sınaq müddəti: "+ candidate.getProbation()+"\n"
            + "8. İş rejimi: "+ candidate.getOperatingMode()+"\n"
            + "9. İş müddəti: " + candidate.getWorkTime()+ "\n"
            + "10. Əmək haqqı: " +  candidate.getSalary() + " (vergilər və digər ödənişlər daxil olmaqla)\n"
            + "   10.1 Dərəcəsi: " + candidate.getDegree() +"\n"
            + "   10.2 Ştat üzrə əsas əmək haqqı: " + candidate.getBasicSalaryByState() + "\n"
            + "   10.3 Əmək şəraitinə görə əlavə:" + candidate.getAdditonalDueWorkingConditions() + "AZN\n"
            + "   10.4 Digər fərdi əlavə: " + candidate.getAnotherPersonalAddition()+ "\n"
            + "11. Maliyyə və İnsan resursları tapşırılsın ki, əmrdən irəli gələn zəruri \n"
            + "məsələlərin həllini təmin etsinlər.\n"
            + "12. Əmr imzalandığı gündən qüvvəyə minir \n";



    public void exportDataToPdf( String filePath) throws FileNotFoundException, DocumentException {

        String fontSourceLight= "src/main/java/com/aailab/aailabexportpdf/FontNew/Calibri-Light.ttf";
        String boldFontSource = "src/main/java/com/aailab/aailabexportpdf/FontNew/Calibri-Bold.TTF";

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));

            // Open the document
            document.open();

            BaseFont baseFontLight = BaseFont.createFont(fontSourceLight, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontLight = new Font(baseFontLight, 12);

            BaseFont baseFontBold = BaseFont.createFont(boldFontSource, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontBold = new Font(baseFontBold, 12);


            // Add content to the document
            Paragraph paragraph = new Paragraph("İşə qəbul  \n\n",fontBold);


            Paragraph paragraph2 = new Paragraph("İşçinin ərizəsi və qüvvədə olan əmək müqaviləsi \n\n", fontLight);


            Paragraph paragraph3 = new Paragraph("ƏMR EDİRƏM  \n\n", fontBold);

            Paragraph paragraph4 = new Paragraph(data + "\n\n" ,fontLight);


            Paragraph paragraph5 = new Paragraph("Baş direktor              Taleh Ziyadov",fontBold);


            paragraph.setAlignment(Element.ALIGN_RIGHT);
            paragraph2.setAlignment(Element.ALIGN_CENTER);
            paragraph3.setAlignment(Element.ALIGN_CENTER);
            paragraph5.setAlignment(Element.ALIGN_CENTER);


            document.add(paragraph);
            document.add(paragraph2);
            document.add(paragraph3);
            document.add(paragraph4);
            document.add(paragraph5);


            // Close the document
            document.close();
        }catch (DocumentException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
