package com.kardibus.moex.domain.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonData {

    private String secid;
    private String regnumber;
    private String name;
    private String emitent_title;
    private Date tradedate;
    private Double open;
    private Double close;
    private Double numtrades;

}
