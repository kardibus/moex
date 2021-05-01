package com.kardibus.moex.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonEntity {

    private String secid;
    private String regnumber;
    private String name;
    private String emitent_title;
    private String tradedate;
    private String open;
    private String close;
    private String numtrades;

}
