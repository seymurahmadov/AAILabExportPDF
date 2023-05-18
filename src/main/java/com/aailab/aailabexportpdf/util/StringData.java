//package com.aailab.aailabexportpdf.util;
//
//import com.aailab.aailabexportpdf.entity.Candidate;
//
//public class StringData {
//
//    public static String getStringData() {
//
//
//        Candidate candidate = Candidate.builder()
//                .id(1)
//                .name("Vusal")
//                .surname("Ahmadov")
//                .fatherName("Fuzuli")
//                .structuralSection("İctimaiyyətlə əlaqələr və protokol departamenti")
//                .subStructuralSection("Test")
//                .subSection("Test SubSection")
//                .positon("Aparici mutexessis")
//                .dateOfEmployement("01.05.2023")
//                .probation("3")
//                .operatingMode("Daily")
//                .workTime("All")
//                .salary(1633.0)
//                .degree(8)
//                .basicSalaryByState(1633.0)
//                .additonalDueWorkingConditions(0.0)
//                .anotherPersonalAddition(0.0)
//                .build();
//
//
//        return "İşə qəbul\n\n"
//                + "İşçinin ərizəsi və qüvvədə olan əmək müqaviləsi\n\n"
//                + "Ə M R E D İ R Ə M:\n"
//                + "1. İşçinin soyadı: " + candidate.getSurname() + "adı: " + candidate.getName() + " atasının adı: " + candidate.getFatherName() + "\n"
//                + "2. Struktur bölmə: " + candidate.getStructuralSection() + "\n"
//                + "3. Alt struktur bölmə: " + candidate.getSubStructuralSection() + " \n"
//                + "4. Alt bölmə: " + candidate.getSubSection() + "\n"
//                + "5. Vəzifəsi: " +candidate.getPositon()+ "\n"
//                + "6. İşə qəbul tarixi:" +candidate.getDateOfEmployement() + "\n"
//                + "7. Sınaq müddəti: "+candidate.getProbation()+"\n"
//                + "8. İş rejimi: "+candidate.getOperatingMode()+"\n"
//                + "9. İş müddəti: " +candidate.getWorkTime()+ "\n"
//                + "10. Əmək haqqı: " +  candidate.getSalary() + " (vergilər və digər ödənişlər daxil olmaqla)\n"
//                + "   10.1 Dərəcəsi: " +candidate.getDegree() +"\n"
//                + "   10.2 Ştat üzrə əsas əmək haqqı: " +candidate.getBasicSalaryByState() + "\n"
//                + "   10.3 Əmək şəraitinə görə əlavə:" +candidate.getAdditonalDueWorkingConditions() + "AZN\n"
//                + "   10.4 Digər fərdi əlavə: " + candidate.getAnotherPersonalAddition()+ "\n"
//                + "11. Maliyyə və İnsan resursları tapşırılsın ki, əmrdən irəli gələn zəruri \n"
//                + "məsələlərin həllini təmin etsinlər.\n"
//                + "12. Əmr imzalandığı gündən qüvvəyə minir \n"
//                + "Baş direktor              Taleh Ziyadov";
//    }
//}
