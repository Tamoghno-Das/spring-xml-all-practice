package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manager {
    private Integer mno;
    private String mname;
    private List<String> skills;
    private Map<String,String> salaryDetails;
    private Set<String> phoneNumbers;
}
