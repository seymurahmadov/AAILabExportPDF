package com.aailab.aailabexportpdf.entity;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Candidate {


    private int id;

    private String name ;

    private String surname ;

    private String fatherName ;

    private String structuralSection;

    private String subStructuralSection;

    private String subSection;

    private String positon;

    private String dateOfEmployement;

    private String probation;

    private String operatingMode;

    private String workTime;

    private Double salary;

    private int degree;

    private Double basicSalaryByState;

    private Double additonalDueWorkingConditions;

    private Double anotherPersonalAddition;
}
